package com.Tomcat_Test.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Tomcat_Test.dao.IUserDao;
import com.Tomcat_Test.entity.UserEntity;

import cmo.Tomcat_Test.utils.DBUtils;

public class UserDaoImpl extends DBUtils implements IUserDao {

	// 登陆-------连接数据库查询
	@Override
	public UserEntity login(int userAccount, String userPassword) throws Exception {
		UserEntity user = null;
		openConnection();
		// 写sql,如果有参数使用占位符?

		String sql = "select * from user where userAccount = ? and userPassword=? ";
		
		// 创建执行SQL的语句Statement,如果sql中有占位符，调用setXXX(int index,value)方法，给占位符赋值
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, userAccount); // 序号对应占位符的顺序
		pst.setString(2, userPassword);
		ResultSet rs = pst.executeQuery();
		
		while (rs.next()) {
			user = new UserEntity();// 创建用户实体对象，用来接收数据库查询出来的数据
			user.setUserNum(rs.getInt("userNum"));
			user.setTeamNum(rs.getInt("teamNum"));
			user.setUserName(rs.getString("userName"));
			user.setUserAccount(rs.getInt("userAccount"));
			user.setUserPhone(rs.getString("userPhone"));
			user.setUserEmail(rs.getString("userEmail"));
			user.setUserSex(rs.getString("userSex"));
			user.setUserInformation(rs.getString("userInformation"));
		}
		// 7.关闭连接
		closeConnection();
		closeConnection(pst);
		closeConnection(rs);
		return user;

	}
	
	//重载
	public UserEntity find(String userName) throws Exception {
		UserEntity user = null;
		openConnection();
		// 写sql,如果有参数使用占位符?

		String sql = "select * from user where userName=? ";
		
		// 创建执行SQL的语句Statement,如果sql中有占位符，调用setXXX(int index,value)方法，给占位符赋值
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, userName); // 序号对应占位符的顺序
		ResultSet rs = pst.executeQuery();
		
		while (rs.next()) {
			user = new UserEntity();// 创建用户实体对象，用来接收数据库查询出来的数据
			user.setUserNum(rs.getInt("userNum"));
			user.setTeamNum(rs.getInt("teamNum"));
			user.setUserName(rs.getString("userName"));
			user.setUserAccount(rs.getInt("userAccount"));
			user.setUserPhone(rs.getString("userPhone"));
			user.setUserEmail(rs.getString("userEmail"));
			user.setUserSex(rs.getString("userSex"));
			user.setUserInformation(rs.getString("userInformation"));
		}
		// 7.关闭连接
		closeConnection();
		closeConnection(pst);
		closeConnection(rs);
		return user;

	}
}
