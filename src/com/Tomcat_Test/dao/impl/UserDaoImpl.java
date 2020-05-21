package com.Tomcat_Test.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Tomcat_Test.dao.IUserDao;
import com.Tomcat_Test.entity.UserEntity;


public class UserDaoImpl implements IUserDao{

	//��½-------�������ݿ��ѯ
	@Override
	public UserEntity login(String userName, String password) throws ClassNotFoundException, SQLException {

		// 1.����JDBC����
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/ecommerceplatform"; // ���ݿ��ַ
		String uName = "root"; // ���ݿ��û���
		String upassword = "rootroot"; // ���ݿ�����
		// 2.�������ݿ�����Connection
		Connection conn = DriverManager.getConnection(url, uName, upassword);

		//3.дsql,����в���ʹ��ռλ��?
		String sql = "select * from t_user where username = ? and password=? ";
		
		//4.����ִ��SQL�����Statement,���sql����ռλ��������setXXX(int index,value)��������ռλ����ֵ
		PreparedStatement pst =  conn.prepareStatement(sql);
		pst.setString(1, userName);  //��Ŷ�Ӧռλ����˳��
		pst.setString(2, password);
		
		/*
		 * 5.ѡ��ִ��sql���ķ���   
		   executeQuery()������select��䣬����ResultSet�������
           executeUpdate()������insert/update/delete���������ظ��µ����� --- int��
		 */
		 ResultSet rs = pst.executeQuery();
		
		/*
		 * 6.����ResultSet�����---ֻ�в�ѯ�Ŵ���
		 *  (1)ѡ���������ͣ� 1�������ѯ��������ĳ���˵������--int   �����ĳ����Ʒ�ļ۸�ĳ���˵��˻���� --double
		 *                  2�������ѯ������ȫ����Ϣ----���� UserEntity
		 *                  3�������ѯ�����˵�ȫ����Ϣ-----ArrayList<UserEntity>
		 *  (2)�ƶ�   next()���ƶ�����һ��
		 *  (3)ȡֵ     getXXX(int index)��getXXX(String columnName)����������ݿ�����varchar��char�����͵����ݶ���
		 */
		 
		 UserEntity user = null;
		 while(rs.next()) {
			 user = new UserEntity();//�����û�ʵ����������������ݿ��ѯ����������
			 user.setUserName(rs.getString("username"));
			 user.setUserPhone(rs.getString("phone"));
		 }
		 
		 
		 //7.�ر�����
		 rs.close();
		 pst.close();
		 conn.close();
		 
		 
		return user;
		
	}

}
