package com.Tomcat_Test.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Tomcat_Test.dao.ICommitDao;
import com.Tomcat_Test.entity.commitEntity;

import cmo.Tomcat_Test.utils.DBUtils;

public class CommitDaoImpl extends DBUtils implements ICommitDao {

	// 连接数据库
	@Override
	public boolean commit(int userNum, String commitName) throws Exception {

		openConnection();
		// 写sql
		String sql = "insert into commit(userNum,commitName) values(?,?)";

		// 创建执行sql的语句Statement,如果sql有占位符，调用setXXX方法
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, userNum);
		pst.setString(2, commitName);
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
	
}
