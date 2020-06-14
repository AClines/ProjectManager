package com.Tomcat_Test.service.impl;

import com.Tomcat_Test.dao.TeamDao;
import com.Tomcat_Test.dao.impl.TeamDaoImpl;
import com.Tomcat_Test.service.TeamService;

public class TeamServiceImpl implements TeamService{
    
	TeamDao dao=new TeamDaoImpl();
	@Override
	public boolean sumbit(String teaminformation,int projectId,int userId) {
		// TODO Auto-generated method stub
		boolean flag=false;
		try {
			flag=dao.sumbit(teaminformation,projectId,userId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

}
