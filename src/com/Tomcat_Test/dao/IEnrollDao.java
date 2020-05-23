package com.Tomcat_Test.dao;

public interface IEnrollDao {
	public boolean enroll(int userAccount,String userPassword,String userName) throws Exception;
	public boolean isEnrolled(String  userName);
}
