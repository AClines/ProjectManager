package com.Tomcat_Test.dao;

import java.util.ArrayList;

import com.Tomcat_Test.entity.commitEntity;
import com.Tomcat_Test.entity.programEntity;
import com.Tomcat_Test.entity.taskEntity;

//��Ŀ�����ݵĽӿ�
public interface FindprogramDao {
//��ѯ������Ŀ
	ArrayList<programEntity> findAllprogram(int MyUserId) throws Exception;

	ArrayList<programEntity> findAllForProgram(int MyUserId) throws Exception;

	programEntity findProgramById(int myUserId) throws Exception;

	ArrayList<taskEntity> findTaskById(int myUserId) throws Exception;

	ArrayList<commitEntity> findCommitById(int myUserId) throws Exception;

	ArrayList<commitEntity> findAllCommit() throws Exception;	
}
