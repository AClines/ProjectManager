package com.Tomcat_Test.dao;

import java.sql.SQLException;

import com.Tomcat_Test.entity.UserEntity;

public interface IUserDao {

	UserEntity login(String userName, String password) throws ClassNotFoundException, SQLException;

}
