package com.Tomcat_Test.service.impl;

import java.util.ArrayList;

import com.Tomcat_Test.dao.FindProjectDeatilDao;
import com.Tomcat_Test.dao.impl.FindProjectDeatilDaoImpl;
import com.Tomcat_Test.entity.programEntity;
import com.Tomcat_Test.entity.taskEntity;
import com.Tomcat_Test.service.IFindProjectDeatilService;

public class IFindProjectDeatilServiceImpl implements IFindProjectDeatilService  {

	FindProjectDeatilDao dao = new FindProjectDeatilDaoImpl();// ����GoodsDaoImpl����
	@Override
	public programEntity findProjectDeatil(int projectId) {
		programEntity goods = null;
		try {
			// 1.������
			// 2.����dao����
			// 3.���÷��� findGoodsDetail
			// ������goodsid
			// ����ֵ��GoodsEntity
			goods = dao.findProjectDetail(projectId);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// 6.�ر�����
		}
		
		// 7.����GoodsEntity
		return goods;
	}
	@Override
	public ArrayList<taskEntity> findProjectTaskList(int projectId) {
		ArrayList<taskEntity> taskEntities = null;
		try {
			// 1.������
			// 2.����dao����
			// 3.���÷��� findGoodsDetail
			// ������goodsid
			// ����ֵ��GoodsEntity
			taskEntities = dao.findProjectTaskList(projectId);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// 6.�ر�����
		}
		
		// 7.����GoodsEntity
		return taskEntities;
	}

}
