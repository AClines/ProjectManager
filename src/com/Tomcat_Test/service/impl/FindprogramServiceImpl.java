package com.Tomcat_Test.service.impl;

import java.util.ArrayList;

import com.Tomcat_Test.dao.FindprogramDao;
import com.Tomcat_Test.dao.impl.FindprogramDaoImpl;
import com.Tomcat_Test.entity.programEntity;
import com.Tomcat_Test.service.FindprogramService;

public class FindprogramServiceImpl implements FindprogramService {
FindprogramDao dao=new FindprogramDaoImpl();//�������ݲ����
	
	//�鿴������Ŀ
	@Override
	public ArrayList<programEntity> findAllprogram() {
		ArrayList<programEntity> programEntities=null;
	
		try {
			programEntities=dao.findAllprogram();	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return programEntities;
	}

}
