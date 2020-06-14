package cmo.Tomcat_Test.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Tomcat_Test.entity.UserEntity;
import com.Tomcat_Test.service.IUserService;
import com.Tomcat_Test.service.impl.UserServiceImpl;


@WebServlet("/LoginSvl")
public class LoginSvl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginSvl() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//1.接受页面参数
		int userAccount = Integer.parseInt(request.getParameter("userAccount"));//该方法参数里放的是html页面input里的元素的名字
		String userPassword = request.getParameter("userPassword");//该方法参数里放的是html页面input里的元素的名字
		System.out.println(userAccount+"  "+userPassword);
		//2.创建对象，调用方法
		IUserService userService = new UserServiceImpl();
		UserEntity user = userService.Login(userAccount,userPassword);
		System.out.println(user+" ");
		
		//对user判断
		String url="";//登录成功后跳转的地址;
		String msg="";//要显示的信息
		boolean flag=false;
		if(user!=null) {
			//把user信息保存到session会话中
			HttpSession session =request.getSession();
			session.setAttribute("user", user);//浏览器不关闭，信息就有效
			//登录成功
			url="index.jsp";//
			flag=true;
			
		}
		else {
			//登录失败，继续在登录页面
			url="TestLogin.jsp";
			msg="用户名或者密码错误";
		}
		
		//3.把数据保存到请求域
		request.setAttribute("msg",msg);
		
		//4.跳转页面
		if(flag) {
			//响应重定向
			response.sendRedirect(url);
		}else {
			request.getRequestDispatcher(url).forward(request, response);
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
