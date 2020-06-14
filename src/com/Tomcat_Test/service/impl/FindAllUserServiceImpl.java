package com.Tomcat_Test.service.impl;

import java.util.ArrayList;

import com.Tomcat_Test.dao.FindAllUserDao;
import com.Tomcat_Test.dao.FindprogramDao;
import com.Tomcat_Test.dao.impl.FindAllUserDaoImpl;
import com.Tomcat_Test.dao.impl.FindprogramDaoImpl;
import com.Tomcat_Test.entity.UserEntity;
import com.Tomcat_Test.entity.programEntity;
import com.Tomcat_Test.service.FindAllUserService;
import com.Tomcat_Test.service.FindprogramService;

public class FindAllUserServiceImpl implements FindAllUserService {
	FindAllUserDao dao=new FindAllUserDaoImpl();//创建数据层对象
	@Override
	public ArrayList<UserEntity> findAllUser() {
		ArrayList<UserEntity>userEntities=null;
		
		try {
			userEntities=dao.findAllUser();	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userEntities;
	}
	@Override
	public UserEntity findUserById(int id) {
		UserEntity userEntities=null;
		
		try {
			userEntities=dao.findUserById(id);	
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userEntities;
	}

}
