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

	// ��½-------�������ݿ��ѯ
	@Override
	public UserEntity login(int userAccount, String userPassword) throws Exception {
		UserEntity user = null;
		openConnection();
		// дsql,����в���ʹ��ռλ��?

		String sql = "select * from user where userAccount = ? and userPassword=? ";
		
		// ����ִ��SQL�����Statement,���sql����ռλ��������setXXX(int index,value)��������ռλ����ֵ
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, userAccount); // ��Ŷ�Ӧռλ����˳��
		pst.setString(2, userPassword);
		ResultSet rs = pst.executeQuery();
		
		while (rs.next()) {
			user = new UserEntity();// �����û�ʵ����������������ݿ��ѯ����������
			user.setUserNum(rs.getInt("userNum"));
			user.setTeamNum(rs.getInt("teamNum"));
			user.setUserName(rs.getString("userName"));
			user.setUserAccount(rs.getInt("userAccount"));
			user.setUserPhone(rs.getString("userPhone"));
			user.setUserEmail(rs.getString("userEmail"));
			user.setUserSex(rs.getString("userSex"));
			user.setUserInformation(rs.getString("userInformation"));
		}
		// 7.�ر�����
		closeConnection();
		closeConnection(pst);
		closeConnection(rs);
		return user;

	}
	
	//����
	public UserEntity find(String userName) throws Exception {
		UserEntity user = null;
		openConnection();
		// дsql,����в���ʹ��ռλ��?

		String sql = "select * from user where userName=? ";
		
		// ����ִ��SQL�����Statement,���sql����ռλ��������setXXX(int index,value)��������ռλ����ֵ
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, userName); // ��Ŷ�Ӧռλ����˳��
		ResultSet rs = pst.executeQuery();
		
		while (rs.next()) {
			user = new UserEntity();// �����û�ʵ����������������ݿ��ѯ����������
			user.setUserNum(rs.getInt("userNum"));
			user.setTeamNum(rs.getInt("teamNum"));
			user.setUserName(rs.getString("userName"));
			user.setUserAccount(rs.getInt("userAccount"));
			user.setUserPhone(rs.getString("userPhone"));
			user.setUserEmail(rs.getString("userEmail"));
			user.setUserSex(rs.getString("userSex"));
			user.setUserInformation(rs.getString("userInformation"));
		}
		// 7.�ر�����
		closeConnection();
		closeConnection(pst);
		closeConnection(rs);
		return user;

	}
}
