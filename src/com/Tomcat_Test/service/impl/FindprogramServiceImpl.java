package com.Tomcat_Test.service.impl;

import java.util.ArrayList;

import com.Tomcat_Test.dao.FindprogramDao;
import com.Tomcat_Test.dao.impl.FindprogramDaoImpl;
import com.Tomcat_Test.entity.commitEntity;
import com.Tomcat_Test.entity.programEntity;
import com.Tomcat_Test.entity.taskEntity;
import com.Tomcat_Test.service.FindprogramService;

public class FindprogramServiceImpl implements FindprogramService {
FindprogramDao dao=new FindprogramDaoImpl();//创建数据层对象
	
	//查看所有项目
	@Override
	public ArrayList<programEntity> findAllprogram(int MyUserId) {
		ArrayList<programEntity> programEntities=null;
	
		try {
			programEntities=dao.findAllprogram(MyUserId);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return programEntities;
	}

	@Override
	public ArrayList<programEntity> findAllForProgram(int MyUserId) {

		ArrayList<programEntity> programEntities=null;
		
		try {
			programEntities=dao.findAllForProgram(MyUserId);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return programEntities;
		
		
	}

	@Override
	public programEntity findProgramById(int forProgramid) {
		
		programEntity programEntities=null;
		
		try {
			programEntities=dao.findProgramById(forProgramid);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return programEntities;
	}

	@Override
	public ArrayList<taskEntity> findTaskById(int myUserId) {
		
		ArrayList<taskEntity> taskEntities=null;
		
		try {
			taskEntities=dao.findTaskById(myUserId);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return taskEntities;
	}

	@Override
	public ArrayList<commitEntity> findCommitById(int myUserId) {

		ArrayList<commitEntity> commitEntities=null;
		
		try {
			commitEntities=dao.findCommitById(myUserId);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return commitEntities;
	}

	@Override
	public ArrayList<commitEntity> findAllCommit() {
		ArrayList<commitEntity> commitEntities=null;
		
		try {
			commitEntities=dao.findAllCommit();	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return commitEntities;
	}

}
