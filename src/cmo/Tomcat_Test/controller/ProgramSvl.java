package cmo.Tomcat_Test.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Tomcat_Test.entity.UserEntity;
import com.Tomcat_Test.entity.programEntity;
import com.Tomcat_Test.service.IUserService;
import com.Tomcat_Test.service.ProgramService;
import com.Tomcat_Test.service.impl.ProgramServiceImpl;
import com.Tomcat_Test.service.impl.UserServiceImpl;;

@WebServlet("/ProgramSvl")
public class ProgramSvl extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    
    public ProgramSvl() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //鎺ユ敹椤甸潰鐨勪紶閫掔殑鍙傛暟
    	String programname=request.getParameter("programName");
         String programinformation=request.getParameter("programInformation");
         System.out.println(programname+"  "+programinformation);
       //鍒涘缓ProgramServiceImpl瀵硅薄锛岃皟鐢ㄦ柟娉曪紝寰楀埌杩斿洖鍊�
         ProgramService service=new ProgramServiceImpl();
        //鏈夋病鏈夊弬鏁�  鏈夋病鏈夎繑鍥炲��
         boolean flag = service.sumbit(programname, programinformation);
			String url = "";
			String msg = "";
			if (flag) {
				url = "Findprogram.jsp";// 登录成功后跳转的地址;
				msg = "登记成功";// 要显示的信息
			} else {
				url = "Findprogram.jsp";
				msg = "登记失败";
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
