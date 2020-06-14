package com.Tomcat_Test.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.Tomcat_Test.entity.programEntity;
import com.Tomcat_Test.entity.taskEntity;

public interface FindProjectDeatilDao {



	programEntity findProjectDetail(int projectId) throws SQLException, Exception;

	ArrayList<taskEntity> findProjectTaskList(int projectId) throws SQLException, Exception;

}
