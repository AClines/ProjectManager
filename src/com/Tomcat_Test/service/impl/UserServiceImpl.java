package com.Tomcat_Test.service.impl;

import java.sql.SQLException;

import com.Tomcat_Test.dao.IUserDao;
import com.Tomcat_Test.dao.impl.UserDaoImpl;
import com.Tomcat_Test.entity.UserEntity;
import com.Tomcat_Test.service.IUserService;
import com.sun.org.apache.bcel.internal.generic.NEW;

//用户业务逻辑实现类
public class UserServiceImpl implements IUserService{

	IUserDao dao =new UserDaoImpl();//通过接口创建实现类
	@Override
	public UserEntity Login(String userName, String password) {
		// TODO Auto-generated method stub
		//通过dao层方法得到结果
		try {
			UserEntity user = dao.login(userName,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
