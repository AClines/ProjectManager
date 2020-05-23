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
		// 1.接收页面参数
				int userAccount = Integer.parseInt(request.getParameter("userAccount"));// 用户编号
				String userPassword = request.getParameter("userPassword");// 提交名称
				String userName=request.getParameter("userName");
				IEnrollServiceImpl service=new IEnrollServiceImpl();
				boolean flag = service.enroll(userAccount, userPassword, userName);
				String url = "";
				String msg = "";
				if (flag) {
					url = "TestWelcome.jsp";// 登录成功后跳转的地址;
					msg = "注册成功";// 要显示的信息
				} else {
					url = "TestCommit.jsp";
					msg = "注册失败";
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
