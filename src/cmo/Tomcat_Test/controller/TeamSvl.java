package cmo.Tomcat_Test.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Tomcat_Test.service.TeamService;
import com.Tomcat_Test.service.impl.TeamServiceImpl;

/**
 * Servlet implementation class TeamSvl
 */
@WebServlet("/TeamSvl")
public class TeamSvl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeamSvl() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String teaminformation=request.getParameter("teamInformation");
	        System.out.println(teaminformation);
	      //鍒涘缓ProgramServiceImpl瀵硅薄锛岃皟鐢ㄦ柟娉曪紝寰楀埌杩斿洖鍊�
	        TeamService service=new TeamServiceImpl();
	       //鏈夋病鏈夊弬鏁�  鏈夋病鏈夎繑鍥炲��
	        boolean flag = service.sumbit(teaminformation);
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
