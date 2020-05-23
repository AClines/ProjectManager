package com.Tomcat_Test.service.impl;

import com.Tomcat_Test.dao.impl.CommitDaoImpl;
import com.Tomcat_Test.entity.commitEntity;
import com.Tomcat_Test.service.ICommitService;

public class ICommitServiceImpl implements ICommitService {
	//提交方法
	CommitDaoImpl dao=new CommitDaoImpl();
	
	@Override
	public boolean commit(int userNum, String commitName) {
		boolean flag = false;
		try {
			flag = dao.commit(userNum,commitName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	
}
