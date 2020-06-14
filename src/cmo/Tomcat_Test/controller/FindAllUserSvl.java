package cmo.Tomcat_Test.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Tomcat_Test.entity.UserEntity;
import com.Tomcat_Test.entity.programEntity;
import com.Tomcat_Test.service.FindAllUserService;
import com.Tomcat_Test.service.FindprogramService;
import com.Tomcat_Test.service.impl.FindAllUserServiceImpl;
import com.Tomcat_Test.service.impl.FindprogramServiceImpl;

/**
 * Servlet implementation class FindAllUserSvl
 */
@WebServlet("/FindAllUserSvl")
public class FindAllUserSvl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindAllUserSvl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		FindAllUserService srevice=new FindAllUserServiceImpl();
		
		ArrayList<UserEntity>userEntities=srevice.findAllUser();
		
		System.out.println(userEntities);
		
		request.setAttribute("programEntities", userEntities);
		
		request.getRequestDispatcher("my.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
