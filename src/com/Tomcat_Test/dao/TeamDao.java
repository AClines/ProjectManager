package com.Tomcat_Test.dao;

import com.Tomcat_Test.entity.TeamEntity;

public interface TeamDao {

	boolean sumbit(String teaminformation,int projectId,int userId) throws Exception;
	public boolean isSumbit(String  teaminformation);
	TeamEntity find(String teaminformation) throws Exception;
}
