package com.Tomcat_Test.service;

import com.Tomcat_Test.entity.commitEntity;

public interface ICommitService {
	public boolean commit(int userNum,String commitName);
}
