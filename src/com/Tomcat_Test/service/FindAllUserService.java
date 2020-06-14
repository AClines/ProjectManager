package com.Tomcat_Test.service;

import java.util.ArrayList;

import com.Tomcat_Test.entity.UserEntity;

public interface FindAllUserService {

	ArrayList<UserEntity> findAllUser();
	
	UserEntity findUserById(int id);

}
