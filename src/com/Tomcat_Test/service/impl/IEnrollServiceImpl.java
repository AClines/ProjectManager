package com.Tomcat_Test.service.impl;

import com.Tomcat_Test.dao.impl.IEnrollDaoImpl;
import com.Tomcat_Test.service.IEnrollService;

public class IEnrollServiceImpl implements IEnrollService {
	
	IEnrollDaoImpl dao=new IEnrollDaoImpl();
	public boolean enroll(int userAccount, String userPassword, String userName) {
		boolean flag=false;
		try {
			flag=dao.enroll(userAccount, userPassword, userName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

}
