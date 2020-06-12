package com.Tomcat_Test.service.impl;

import com.Tomcat_Test.dao.ProgramDao;
import com.Tomcat_Test.dao.impl.ProgramDaoImpl;
import com.Tomcat_Test.service.ProgramService;


public class ProgramServiceImpl implements ProgramService{
    ProgramDao dao=new ProgramDaoImpl();//閫氳繃鎺ュ彛鍒涘缓瀹炵幇绫诲璞�
	@Override
	public boolean sumbit(String programname, String programinformation) {
		
		boolean flag=false;
		try {
			flag=dao.sumbit(programname, programinformation);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}

}
