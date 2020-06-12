package cmo.Tomcat_Test.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Tomcat_Test.entity.programEntity;
import com.Tomcat_Test.service.FindprogramService;
import com.Tomcat_Test.service.FindprogramService;
import com.Tomcat_Test.service.impl.FindprogramServiceImpl;

/**
 * Servlet implementation class Findprogram
 */
@WebServlet("/Findprogram")
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
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FindprogramService srevice=new FindprogramServiceImpl();
		
		ArrayList<programEntity> programEntities=srevice.findAllprogram();
		
		request.setAttribute("programEntities", programEntities);
		
		request.getRequestDispatcher("TestWelcome.jsp").forward(request, response);;
		
		doGet(request, response);
	}

}
