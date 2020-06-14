package com.Tomcat_Test.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Tomcat_Test.dao.FindAllUserDao;
import com.Tomcat_Test.dao.FindprogramDao;
import com.Tomcat_Test.entity.UserEntity;
import com.Tomcat_Test.entity.programEntity;

import cmo.Tomcat_Test.utils.DBUtils;

public class FindAllUserDaoImpl extends DBUtils implements FindAllUserDao {

	@Override
	public ArrayList<UserEntity> findAllUser() throws Exception {
		ArrayList<UserEntity> userEntities=new ArrayList<>();//存放所有项目信息的集合
		openConnection();
		String sql="select * from user";
		PreparedStatement pst	= conn.prepareStatement(sql);
		ResultSet rs= pst.executeQuery();
        UserEntity p=null;
   while (rs.next()) {
	p=new UserEntity();
	p.setTeamNum(rs.getInt("teamNum"));
	p.setUserAccount(rs.getInt("userAccount"));
	p.setUserName(rs.getString("userName"));
	p.setUserEmail(rs.getString("userEmail"));
	p.setUserNum(rs.getInt("userNum"));
	userEntities.add(p);//把对象存到集合中

      }
	closeConnection();
	closeConnection(pst);
	closeConnection(rs);
		return userEntities;
	}

	@Override
	public UserEntity findUserById(int id) throws Exception {
		openConnection();
		String sql="select * from user where userNum = ?";
		PreparedStatement pst	= conn.prepareStatement(sql);
		
		pst.setInt(1, id);
		
		ResultSet rs= pst.executeQuery();
        UserEntity p=null;
       
   while (rs.next()) {
	p=new UserEntity();
	p.setTeamNum(rs.getInt("teamNum"));
	p.setUserAccount(rs.getInt("userAccount"));
	p.setUserName(rs.getString("userName"));
	p.setUserEmail(rs.getString("userEmail"));
	p.setUserNum(rs.getInt("userNum"));

      }
	closeConnection();
	closeConnection(pst);
	closeConnection(rs);
		return p;
	}

}
