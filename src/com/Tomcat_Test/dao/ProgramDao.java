package com.Tomcat_Test.dao;

import com.Tomcat_Test.entity.programEntity;

//项目相关数据层的接口
public interface ProgramDao {

	boolean sumbit(String programname, String programinformation) throws Exception;
	public boolean isSumbit(String  programname);
	programEntity find(String programname) throws Exception;
}
