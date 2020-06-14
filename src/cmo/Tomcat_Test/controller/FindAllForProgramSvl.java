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
import com.Tomcat_Test.entity.taskEntity;
import com.Tomcat_Test.service.FindprogramService;
import com.Tomcat_Test.service.impl.FindprogramServiceImpl;

/**
 * Servlet implementation class FindAllForProgramSvl
 */
@WebServlet("/FindAllForProgramSvl")
public class FindAllForProgramSvl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindAllForProgramSvl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		FindprogramService srevice=new FindprogramServiceImpl();
		
		int MyUserId = ((UserEntity)request.getSession().getAttribute("user")).getUserNum();
		
		/*获取我参与项目
		 * ArrayList<programEntity> programEntities=srevice.findAllForProgram(MyUserId);
		 * ArrayList<programEntity> forProgramEntities= new ArrayList(); for(int i =
		 * 0;i<programEntities.size();i++) {
		 * forProgramEntities.add(srevice.findProgramById(programEntities.get(i).
		 * getProgramNum())); } request.setAttribute("forProgramEntities",
		 * forProgramEntities);
		 */
		
		
		ArrayList<taskEntity> taskEntities=srevice.findTaskById(MyUserId);
		ArrayList<commitEntity> commitEntities=srevice.findCommitById(MyUserId);
		
		
		System.out.println(taskEntities);
		
		
		request.setAttribute("taskEntities", taskEntities);
		request.setAttribute("commitEntities", commitEntities);
		
		request.getRequestDispatcher("MyTask.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
