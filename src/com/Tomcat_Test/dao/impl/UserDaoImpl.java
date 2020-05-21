package com.Tomcat_Test.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Tomcat_Test.dao.IUserDao;
import com.Tomcat_Test.entity.UserEntity;


public class UserDaoImpl implements IUserDao{

	//登陆-------连接数据库查询
	@Override
	public UserEntity login(String userName, String password) throws ClassNotFoundException, SQLException {

		// 1.加载JDBC驱动
		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/ecommerceplatform"; // 数据库地址
		String uName = "root"; // 数据库用户名
		String upassword = "rootroot"; // 数据库密码
		// 2.建立数据库连接Connection
		Connection conn = DriverManager.getConnection(url, uName, upassword);

		//3.写sql,如果有参数使用占位符?
		String sql = "select * from t_user where username = ? and password=? ";
		
		//4.创建执行SQL的语句Statement,如果sql中有占位符，调用setXXX(int index,value)方法，给占位符赋值
		PreparedStatement pst =  conn.prepareStatement(sql);
		pst.setString(1, userName);  //序号对应占位符的顺序
		pst.setString(2, password);
		
		/*
		 * 5.选择执行sql语句的方法   
		   executeQuery()：运行select语句，返回ResultSet结果集。
           executeUpdate()：运行insert/update/delete操作，返回更新的行数 --- int。
		 */
		 ResultSet rs = pst.executeQuery();
		
		/*
		 * 6.处理ResultSet结果集---只有查询才处理
		 *  (1)选择数据类型： 1、如果查询总条数、某个人的年龄等--int   如果是某个商品的价格、某个人的账户余额 --double
		 *                  2、如果查询张三的全部信息----对象 UserEntity
		 *                  3、如果查询所有人的全部信息-----ArrayList<UserEntity>
		 *  (2)移动   next()：移动到下一行
		 *  (3)取值     getXXX(int index)、getXXX(String columnName)：获得在数据库里是varchar、char等类型的数据对象。
		 */
		 
		 UserEntity user = null;
		 while(rs.next()) {
			 user = new UserEntity();//创建用户实体对象，用来接收数据库查询出来的数据
			 user.setUserName(rs.getString("username"));
			 user.setUserPhone(rs.getString("phone"));
		 }
		 
		 
		 //7.关闭连接
		 rs.close();
		 pst.close();
		 conn.close();
		 
		 
		return user;
		
	}

}
