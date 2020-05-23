package com.Tomcat_Test.service;

import com.Tomcat_Test.entity.UserEntity;

//用户逻辑接口
public interface IUserService {

	public UserEntity Login(int userAccount, String userPassword);

}
