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
		// 1.接收页面参数
		int userNum = ((UserEntity)request.getSession().getAttribute("user")).getUserNum();// 用户编号
		String commitName = request.getParameter("commitName");// 提交名称
		
		int projectId = Integer.parseInt(request.getParameter("projectId"));
		int taskId = Integer.parseInt(request.getParameter("taskId"));
		System.out.println(taskId);

		// 2.创建CommitServiceImpl对象,调用方法，得到返回值
		ICommitService service = new ICommitServiceImpl();
		boolean flag = service.commit(userNum,commitName,taskId,projectId);
		String url = "";
		String msg = "";
		if (flag) {
			url = "TestWelcome.jsp";// 登录成功后跳转的地址;
			msg = "提交成功";// 要显示的信息
		} else {
			url = "TestCommit.jsp";
			msg = "提交失败";
		}

		//把数据保存到请求域
		request.setAttribute("msg", msg);
		// 跳转页面
		if (flag) {
			// 响应重定向
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
