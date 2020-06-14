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

	// �������ݿ�
	@Override
	public boolean commit(int userNum, String commitName,int taskId, int projectId) throws Exception {

		openConnection();
		// дsql
		String sql = "insert into commit(userNum,commitName,taskNum,programNum) values(?,?,?,?)";

		// ����ִ��sql�����Statement,���sql��ռλ��������setXXX����
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, userNum);
		pst.setString(2, commitName);
		pst.setInt(3, taskId);
		pst.setInt(4, projectId);
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
