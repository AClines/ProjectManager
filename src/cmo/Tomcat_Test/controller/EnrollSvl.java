package cmo.Tomcat_Test.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Tomcat_Test.service.impl.ICommitServiceImpl;
import com.Tomcat_Test.service.impl.IEnrollServiceImpl;

/**
 * Servlet implementation class EnrollSvl
 */
@WebServlet("/EnrollSvl")
public class EnrollSvl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EnrollSvl() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.����ҳ�����
				int userAccount = Integer.parseInt(request.getParameter("userAccount"));// �û����
				String userPassword = request.getParameter("userPassword");// �ύ����
				String userName=request.getParameter("userName");
				IEnrollServiceImpl service=new IEnrollServiceImpl();
				boolean flag = service.enroll(userAccount, userPassword, userName);
				String url = "";
				String msg = "";
				if (flag) {
					url = "TestWelcome.jsp";// ��¼�ɹ�����ת�ĵ�ַ;
					msg = "ע��ɹ�";// Ҫ��ʾ����Ϣ
				} else {
					url = "TestCommit.jsp";
					msg = "ע��ʧ��";
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
