package com.Tomcat_Test.service.impl;

import java.sql.SQLException;

import com.Tomcat_Test.dao.IUserDao;
import com.Tomcat_Test.dao.impl.UserDaoImpl;
import com.Tomcat_Test.entity.UserEntity;
import com.Tomcat_Test.service.IUserService;


//�û�ҵ���߼�ʵ����
public class UserServiceImpl implements IUserService{

	IUserDao dao =new UserDaoImpl();//ͨ���ӿڴ���ʵ����
	@Override
	public UserEntity Login(int userAccount, String userPassword) {
		
		//ͨ��dao�㷽���õ����
		
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
