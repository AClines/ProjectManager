package com.Tomcat_Test.service;

import com.Tomcat_Test.entity.UserEntity;

//�û��߼��ӿ�
public interface IUserService {

	UserEntity Login(String userName, String password);

}
