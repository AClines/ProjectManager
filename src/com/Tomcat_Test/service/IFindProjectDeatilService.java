package com.Tomcat_Test.service;

import java.util.ArrayList;

import com.Tomcat_Test.entity.programEntity;
import com.Tomcat_Test.entity.taskEntity;

public interface IFindProjectDeatilService {

	programEntity findProjectDeatil(int projectId);

	ArrayList<taskEntity> findProjectTaskList(int projectId);

}
