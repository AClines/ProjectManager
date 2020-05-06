package cmo.Tomcat_Test.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Tomcat_Test.entity.UserEntity;
import com.Tomcat_Test.service.IUserService;
import com.Tomcat_Test.service.impl.UserServiceImpl;

/**
 * Servlet implementation class LoginSvl
 */
@WebServlet("/LoginSvl")
public class LoginSvl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginSvl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//1.����ҳ�����
		String userName = request.getParameter("username");//�÷���������ŵ���htmlҳ��input���Ԫ�ص�����
		String password = request.getParameter("pssword");//�÷���������ŵ���htmlҳ��input���Ԫ�ص�����
//      2.�������󣬵��÷���
		IUserService userService = new UserServiceImpl();
		
		UserEntity user = userService.Login(userName,password);
		//3.
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
