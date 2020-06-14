package com.Tomcat_Test.dao;

import com.Tomcat_Test.entity.commitEntity;

public interface ICommitDao {

	boolean commit(int userNum, String commitName, int taskId, int projectId) throws Exception;
}
