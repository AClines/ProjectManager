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
import com.Tomcat_Test.service.FindAllUserService;
import com.Tomcat_Test.service.FindprogramService;
import com.Tomcat_Test.service.IFindProjectDeatilService;
import com.Tomcat_Test.service.impl.FindAllUserServiceImpl;
import com.Tomcat_Test.service.impl.FindprogramServiceImpl;
import com.Tomcat_Test.service.impl.IFindProjectDeatilServiceImpl;

/**
 * Servlet implementation class FindProjectDeatil
 */
@WebServlet("/FindProjectDeatil")
public class FindProjectDeatil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindProjectDeatil() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		FindAllUserService userservice=new FindAllUserServiceImpl();
		FindprogramService commitsrevice=new FindprogramServiceImpl();
		
		
		// 1.接收页面参数 goodsid   Integer.parseInt(String value)  把String类型转成int的包装类
		int projectId = Integer.parseInt(request.getParameter("projectId")) ;
		
		// 2.创建service对象，调用方法
		// 参数：goodsid
		// 返回值：GoodsEntity
		IFindProjectDeatilService service = new IFindProjectDeatilServiceImpl();
		programEntity project = service.findProjectDeatil(projectId);
		
		
		ArrayList<programEntity> projectEntities = new ArrayList();
		ArrayList<commitEntity> commitEntities=commitsrevice.findAllCommit();
		
		projectEntities.add(project);
		
		
		
		
		ArrayList<taskEntity> taskEntities = service.findProjectTaskList(projectId);
		for(int i = 0;i<taskEntities.size();i++) {
			taskEntities.get(i).setTaskUserName(userservice.findUserById(taskEntities.get(i).getUserNum()).getUserName());
		}
		
		
		System.out.println(taskEntities.get(0).getTaskUserName());
		// 3.把数据保存到请求域
		request.setAttribute("project", projectEntities);
		request.setAttribute("taskEntities", taskEntities);
		request.setAttribute("commitEntities", commitEntities);
		// 4.请求转发detail.jsp
		request.getRequestDispatcher("ProjectDeatil.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
