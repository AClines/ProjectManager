package cmo.Tomcat_Test.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Tomcat_Test.entity.UserEntity;
import com.Tomcat_Test.service.IUserService;
import com.Tomcat_Test.service.impl.UserServiceImpl;


@WebServlet("/LoginSvl")
public class LoginSvl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginSvl() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//1.����ҳ�����
		int userAccount = Integer.parseInt(request.getParameter("userAccount"));//�÷���������ŵ���htmlҳ��input���Ԫ�ص�����
		String userPassword = request.getParameter("userPassword");//�÷���������ŵ���htmlҳ��input���Ԫ�ص�����
		System.out.println(userAccount+"  "+userPassword);
		//2.�������󣬵��÷���
		IUserService userService = new UserServiceImpl();
		UserEntity user = userService.Login(userAccount,userPassword);
		System.out.println(user+" ");
		
		//��user�ж�
		String url="";//��¼�ɹ�����ת�ĵ�ַ;
		String msg="";//Ҫ��ʾ����Ϣ
		boolean flag=false;
		if(user!=null) {
			//��user��Ϣ���浽session�Ự��
			HttpSession session =request.getSession();
			session.setAttribute("user", user);//��������رգ���Ϣ����Ч
			//��¼�ɹ�
			url="index.jsp";//
			flag=true;
			
		}
		else {
			//��¼ʧ�ܣ������ڵ�¼ҳ��
			url="TestLogin.jsp";
			msg="�û��������������";
		}
		
		//3.�����ݱ��浽������
		request.setAttribute("msg",msg);
		
		//4.��תҳ��
		if(flag) {
			//��Ӧ�ض���
			response.sendRedirect(url);
		}else {
			request.getRequestDispatcher(url).forward(request, response);
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
