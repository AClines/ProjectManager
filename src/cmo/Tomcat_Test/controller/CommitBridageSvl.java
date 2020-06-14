package cmo.Tomcat_Test.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cmo.Tomcat_Test.utils.projectAndTask;

/**
 * Servlet implementation class CommitBridageSvl
 */
@WebServlet("/CommitBridageSvl")
public class CommitBridageSvl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommitBridageSvl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String Id =request.getParameter("Id") ;
		int projectId = Integer.parseInt(Id.split(",")[1]);
		int taskId = Integer.parseInt(Id.split(",")[0]);

		request.setAttribute("projectId", projectId);
		request.setAttribute("taskId", taskId);
		
		request.getRequestDispatcher("CommitEdit.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

