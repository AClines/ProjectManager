package com.Tomcat_Test.service.impl;

import java.sql.SQLException;

import com.Tomcat_Test.dao.IUserDao;
import com.Tomcat_Test.dao.impl.UserDaoImpl;
import com.Tomcat_Test.entity.UserEntity;
import com.Tomcat_Test.service.IUserService;


//用户业务逻辑实现类
public class UserServiceImpl implements IUserService{

	IUserDao dao =new UserDaoImpl();//通过接口创建实现类
	@Override
	public UserEntity Login(int userAccount, String userPassword) {
		
		//通过dao层方法得到结果
		
		UserEntity user = null;
		try {
			user = dao.login(userAccount,userPassword);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

}
