package cmo.Tomcat_Test.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Tomcat_Test.entity.UserEntity;
import com.Tomcat_Test.entity.commitEntity;
import com.Tomcat_Test.entity.programEntity;
import com.Tomcat_Test.service.FindprogramService;
import com.Tomcat_Test.service.impl.FindprogramServiceImpl;

/**
 * Servlet implementation class Findprogram
 */
@WebServlet("/FindprogramSvl")
public class FindprogramSvl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindprogramSvl() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		FindprogramService srevice=new FindprogramServiceImpl();
		
		int MyuserId = ((UserEntity)request.getSession().getAttribute("user")).getUserNum();
		
		ArrayList<programEntity> programEntities=srevice.findAllprogram(MyuserId);
		
		
		
		System.out.println(programEntities);
		
		request.setAttribute("programEntities", programEntities);
		
		
		request.getRequestDispatcher("my.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		doGet(request, response);
	}

}
