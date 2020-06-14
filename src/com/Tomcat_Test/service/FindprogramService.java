package com.Tomcat_Test.service;

import java.util.ArrayList;

import com.Tomcat_Test.entity.commitEntity;
import com.Tomcat_Test.entity.programEntity;
import com.Tomcat_Test.entity.taskEntity;

public interface FindprogramService {
//查看所有项目
	ArrayList<programEntity> findAllprogram(int MyUserId);

	ArrayList<programEntity> findAllForProgram(int MyUserId);
	
	programEntity findProgramById(int forProgramid);

	ArrayList<taskEntity> findTaskById(int myUserId);

	ArrayList<commitEntity> findCommitById(int myUserId);

	ArrayList<commitEntity> findAllCommit();
}
