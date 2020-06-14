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
import com.Tomcat_Test.entity.taskEntity;
import com.Tomcat_Test.service.FindAllUserService;
import com.Tomcat_Test.service.impl.FindAllUserServiceImpl;

/**
 * Servlet implementation class TaskBridageSvl
 */
@WebServlet("/TaskBridageSvl")
public class TaskBridageSvl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaskBridageSvl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.接收页面参数 goodsid   Integer.parseInt(String value)  把String类型转成int的包装类
		String url = "TaskEdit.jsp";
		int projectId = Integer.parseInt(request.getParameter("projectId")) ;
		//把数据保存到请求域
		System.out.println(projectId);
		
		
		ArrayList<taskEntity> taskEntities= new ArrayList<taskEntity>();
		taskEntity t = new taskEntity();
		t.setProgramNum(projectId);
		taskEntities.add(t);
		
		//----------------查询所有的user----------------------------//
		FindAllUserService srevice=new FindAllUserServiceImpl();
		
		ArrayList<UserEntity>userEntities=srevice.findAllUser();
		
		System.out.println(userEntities);
		
		request.setAttribute("userEntities", userEntities);
		//------------------------------------------------------------//
		
		
		request.setAttribute("projectId", taskEntities);
		request.getRequestDispatcher(url).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
