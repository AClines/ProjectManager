package com.Tomcat_Test.service;

import com.Tomcat_Test.entity.UserEntity;

//�û��߼��ӿ�
public interface IUserService {

	public UserEntity Login(int userAccount, String userPassword);

}
