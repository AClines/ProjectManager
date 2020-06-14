package com.Tomcat_Test.dao.impl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.Tomcat_Test.dao.FindprogramDao;
import com.Tomcat_Test.entity.commitEntity;
import com.Tomcat_Test.entity.programEntity;
import com.Tomcat_Test.entity.taskEntity;

import cmo.Tomcat_Test.utils.DBUtils;
//项目数据Dao层实现类
public class FindprogramDaoImpl extends DBUtils implements FindprogramDao{
//查询所有项目实现类
	@Override
public ArrayList<programEntity> findAllprogram(int MyUserId) throws Exception{
		ArrayList<programEntity> programEntities=new ArrayList<>();//存放所有项目信息的集合
		openConnection();
		String sql="select * from program where userNum = ?";
		PreparedStatement pst	= conn.prepareStatement(sql);
		pst.setInt(1, MyUserId);
		ResultSet rs= pst.executeQuery();
        programEntity p=null;
   while (rs.next()) {
	p=new programEntity();
	p.setTeamNum(rs.getInt("teamNum"));
	p.setProgramNum(rs.getInt("programNum"));
	p.setProgramName(rs.getString("programName"));
	p.setProgramInformation(rs.getString("programInfomation"));
	programEntities.add(p);//把对象存到集合中

      }
	closeConnection();
	closeConnection(pst);
	closeConnection(rs);
		return programEntities;
	}

	@Override
	public ArrayList<programEntity> findAllForProgram(int MyUserId) throws Exception {

		ArrayList<programEntity> programEntities=new ArrayList<>();//存放所有项目信息的集合
		openConnection();
		String sql="select * from task where userNum = ?";
		PreparedStatement pst	= conn.prepareStatement(sql);
		pst.setInt(1, MyUserId);
		ResultSet rs= pst.executeQuery();
        programEntity p=null;
   while (rs.next()) {
	p=new programEntity();
	p.setProgramNum(rs.getInt("programNum"));
	programEntities.add(p);//把对象存到集合中

      }
	closeConnection();
	closeConnection(pst);
	closeConnection(rs);
		return programEntities;
	}

	@Override
	public programEntity findProgramById(int programNum) throws Exception {


		openConnection();
		String sql="select * from program where programNum = ?";
		PreparedStatement pst	= conn.prepareStatement(sql);
		pst.setInt(1, programNum);
		ResultSet rs= pst.executeQuery();
        programEntity p=null;
   while (rs.next()) {
	p=new programEntity();
	p.setProgramNum(rs.getInt("programNum"));
      }
	closeConnection();
	closeConnection(pst);
	closeConnection(rs);
		return p;
	}

	@Override
	public ArrayList<taskEntity> findTaskById(int myUserId) throws Exception {
		ArrayList<taskEntity> taskEntities=new ArrayList<>();//存放所有项目信息的集合
		openConnection();
		String sql="select * from task where userNum = ?";
		PreparedStatement pst	= conn.prepareStatement(sql);
		pst.setInt(1, myUserId);
		ResultSet rs= pst.executeQuery();
		taskEntity p=null;
   while (rs.next()) {
	p=new taskEntity();
	p.setProgramNum(rs.getInt("programNum"));
	p.setTaskName(rs.getString("taskName"));
	p.setTaskNum(rs.getInt("taskNum"));
	taskEntities.add(p);//把对象存到集合中

      }
	closeConnection();
	closeConnection(pst);
	closeConnection(rs);
		return taskEntities;
	}

	@Override
	public ArrayList<commitEntity> findCommitById(int myUserId) throws Exception {
		ArrayList<commitEntity> commitEntities=new ArrayList<>();//存放所有项目信息的集合
		openConnection();
		String sql="select * from commit where userNum = ?";
		PreparedStatement pst	= conn.prepareStatement(sql);
		pst.setInt(1, myUserId);
		ResultSet rs= pst.executeQuery();
		commitEntity p=null;
   while (rs.next()) {
	p=new commitEntity();
	p.setProgramNum(rs.getInt("programNum"));
	p.setCommitName(rs.getString("commitName"));
	p.setTaskNum(rs.getInt("taskNum"));
	commitEntities.add(p);//把对象存到集合中

    }
	closeConnection();
	closeConnection(pst);
	closeConnection(rs);
		return commitEntities;
	}

	@Override
	public ArrayList<commitEntity> findAllCommit() throws Exception {
		ArrayList<commitEntity> commitEntities=new ArrayList<>();//存放所有项目信息的集合
		openConnection();
		String sql="select * from commit";
		PreparedStatement pst	= conn.prepareStatement(sql);

		ResultSet rs= pst.executeQuery();
		commitEntity p=null;
   while (rs.next()) {
	p=new commitEntity();
	p.setProgramNum(rs.getInt("programNum"));
	p.setCommitName(rs.getString("commitName"));
	p.setTaskNum(rs.getInt("taskNum"));
	commitEntities.add(p);//把对象存到集合中

    }
	closeConnection();
	closeConnection(pst);
	closeConnection(rs);
		return commitEntities;
	}

}
