package cmo.Tomcat_Test.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {
	protected Connection conn=null;
	//打开连接
	public void openConnection() throws Exception {
		if(conn==null||conn.isClosed()) {
			//1.加载JDBC驱动
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/program_manage"; // 数据库地址
		    String uName = "root"; // 数据库用户名
		    String upassword = "151122"; // 数据库密码
		    
		    // 2.建立数据库连接Connection
		    conn = DriverManager.getConnection(url, uName, upassword);
	    
		}
	}
	//关闭连接
	
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
	//打开事务
	public void beginTransaction() {
		try {
			this.openConnection();
			conn.setAutoCommit(false);//设置事务手动提交
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//提交事务
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
	//回滚事务
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
