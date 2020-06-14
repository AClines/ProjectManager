package com.Tomcat_Test.dao.impl;

import cmo.Tomcat_Test.utils.DBUtils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Tomcat_Test.dao.FindProjectDeatilDao;
import com.Tomcat_Test.entity.programEntity;
import com.Tomcat_Test.entity.taskEntity;
public class FindProjectDeatilDaoImpl extends DBUtils implements FindProjectDeatilDao {


	@Override
	public programEntity findProjectDetail(int projectId) throws Exception {
		openConnection();
//		1.дsql
		String sql = "select * from program where programNum = ?";
		
//		2.����Ԥ���������
		PreparedStatement pst  =  conn.prepareStatement(sql);
		pst.setInt(1, projectId);
		
//		3.ִ��
		ResultSet rs = pst.executeQuery();
//		4 ��������
		programEntity project = null;
		while(rs.next()) {
			project = new programEntity();
			project.setTeamNum(rs.getInt("teamNum"));
			project.setProgramNum(rs.getInt("programNum"));
			project.setProgramName(rs.getString("programName"));
			project.setProgramInformation(rs.getString("programInfomation"));
		}
		
//		5.�ر���Դ
		closeConnection();
		closeConnection(rs);
		closeConnection(pst);
//		6.����
		return project;
	}

	@Override
	public ArrayList<taskEntity> findProjectTaskList(int projectId) throws Exception {
		ArrayList<taskEntity> taskEntities=new ArrayList<>();//���������Ŀ��Ϣ�ļ���
		openConnection();
		String sql="select * from task where programNum = ?";
		PreparedStatement pst	= conn.prepareStatement(sql);
		
		pst.setInt(1, projectId);
		
		ResultSet rs= pst.executeQuery();
		taskEntity p=null;
   while (rs.next()) {
	p=new taskEntity();
	p.setTaskNum(rs.getInt("taskNum"));
	p.setTaskName(rs.getString("taskName"));
	p.setUserNum(rs.getInt("userNum"));
	taskEntities.add(p);//�Ѷ���浽������
      }
	closeConnection();
	closeConnection(pst);
	closeConnection(rs);
		return taskEntities;
	}


}
