package com.Tomcat_Test.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Tomcat_Test.dao.IEnrollDao;
import com.Tomcat_Test.dao.IUserDao;
import com.Tomcat_Test.entity.UserEntity;

import cmo.Tomcat_Test.utils.DBUtils;

public class IEnrollDaoImpl extends DBUtils implements IEnrollDao {

	@Override
	public boolean enroll(int userAccount, String userPassword, String userName) throws Exception {
		if(this.isEnrolled(userName)) {
			openConnection();
			// 写sql
			String sql = "insert into user(userAccount,userPassword,userName) values(?,?,?)";

			// 创建执行sql的语句Statement,如果sql有占位符，调用setXXX方法
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, userAccount);
			pst.setString(2, userPassword);
			pst.setString(3, userName);
			
			int line = pst.executeUpdate();
			closeConnection();
			closeConnection(pst);
			if(line!=0) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		
	}
	public boolean isEnrolled(String userName) {//查询是否被注册
		IUserDao dao =new UserDaoImpl();
		UserEntity user=null;
		try {
			user=dao.find(userName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(user!=null) {
			return false;
		}
		else {
			return true;
		}
		
	}
	@Override
	public boolean isEnrolled(int userAccount) {
		// TODO Auto-generated method stub
		return false;
	}
}
