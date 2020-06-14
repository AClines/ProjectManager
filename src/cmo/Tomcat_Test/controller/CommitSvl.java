package cmo.Tomcat_Test.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Tomcat_Test.entity.UserEntity;
import com.Tomcat_Test.entity.commitEntity;
import com.Tomcat_Test.service.ICommitService;
import com.Tomcat_Test.service.impl.ICommitServiceImpl;

/**
 * Servlet implementation class CommitSvl
 */
@WebServlet("/CommitSvl")
public class CommitSvl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CommitSvl() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.����ҳ�����
		int userNum = ((UserEntity)request.getSession().getAttribute("user")).getUserNum();// �û����
		String commitName = request.getParameter("commitName");// �ύ����
		
		int projectId = Integer.parseInt(request.getParameter("projectId"));
		int taskId = Integer.parseInt(request.getParameter("taskId"));
		System.out.println(taskId);

		// 2.����CommitServiceImpl����,���÷������õ�����ֵ
		ICommitService service = new ICommitServiceImpl();
		boolean flag = service.commit(userNum,commitName,taskId,projectId);
		String url = "";
		String msg = "";
		if (flag) {
			url = "TestWelcome.jsp";// ��¼�ɹ�����ת�ĵ�ַ;
			msg = "�ύ�ɹ�";// Ҫ��ʾ����Ϣ
		} else {
			url = "TestCommit.jsp";
			msg = "�ύʧ��";
		}

		//�����ݱ��浽������
		request.setAttribute("msg", msg);
		// ��תҳ��
		if (flag) {
			// ��Ӧ�ض���
			response.sendRedirect(url);
		} else {
			request.getRequestDispatcher(url).forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
