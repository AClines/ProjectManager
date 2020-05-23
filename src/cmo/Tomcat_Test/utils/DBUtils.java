package cmo.Tomcat_Test.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {
	protected Connection conn=null;
	//������
	public void openConnection() throws Exception {
		if(conn==null||conn.isClosed()) {
			//1.����JDBC����
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/program_manage"; // ���ݿ��ַ
		    String uName = "root"; // ���ݿ��û���
		    String upassword = "151122"; // ���ݿ�����
		    
		    // 2.�������ݿ�����Connection
		    conn = DriverManager.getConnection(url, uName, upassword);
	    
		}
	}
	//�ر�����
	
	public void closeConnection()  {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}
	}
	public void closeConnection(PreparedStatement pst)  {
		if(pst!=null) {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void closeConnection(ResultSet rs)  {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	//������
	public void beginTransaction() {
		try {
			this.openConnection();
			conn.setAutoCommit(false);//���������ֶ��ύ
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//�ύ����
	public void commit() {
		if(conn!=null) {
			try {
				conn.commit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//�ع�����
	public void rollback() {
		if(conn!=null) {
			try {
				conn.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
