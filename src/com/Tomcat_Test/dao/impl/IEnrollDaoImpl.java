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
			// дsql
			String sql = "insert into user(userAccount,userPassword,userName) values(?,?,?)";

			// ����ִ��sql�����Statement,���sql��ռλ��������setXXX����
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
	public boolean isEnrolled(String userName) {//��ѯ�Ƿ�ע��
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
