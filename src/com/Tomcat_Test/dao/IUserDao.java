package com.Tomcat_Test.dao;

import java.sql.SQLException;

import com.Tomcat_Test.entity.UserEntity;

public interface IUserDao {

	public UserEntity login(int userAccount, String userPassword) throws Exception;
	public UserEntity find(String name)throws Exception;//≤È—Ø–’√˚

}
