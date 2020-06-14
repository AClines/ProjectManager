package com.Tomcat_Test.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.Tomcat_Test.entity.UserEntity;

public interface FindAllUserDao {

	ArrayList<UserEntity> findAllUser() throws SQLException, Exception;

	UserEntity findUserById(int id) throws Exception;

}
