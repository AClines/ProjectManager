package com.Tomcat_Test.dao;

import com.Tomcat_Test.entity.commitEntity;

public interface ICommitDao {
	public boolean commit(int userAccount,String commitName) throws Exception;
}
