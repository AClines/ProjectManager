package com.Tomcat_Test.service.impl;

import java.util.ArrayList;

import com.Tomcat_Test.dao.FindProjectDeatilDao;
import com.Tomcat_Test.dao.impl.FindProjectDeatilDaoImpl;
import com.Tomcat_Test.entity.programEntity;
import com.Tomcat_Test.entity.taskEntity;
import com.Tomcat_Test.service.IFindProjectDeatilService;

public class IFindProjectDeatilServiceImpl implements IFindProjectDeatilService  {

	FindProjectDeatilDao dao = new FindProjectDeatilDaoImpl();// 创建GoodsDaoImpl对象
	@Override
	public programEntity findProjectDeatil(int projectId) {
		programEntity goods = null;
		try {
			// 1.打开连接
			// 2.创建dao对象
			// 3.调用方法 findGoodsDetail
			// 参数：goodsid
			// 返回值：GoodsEntity
			goods = dao.findProjectDetail(projectId);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// 6.关闭连接
		}
		
		// 7.返回GoodsEntity
		return goods;
	}
	@Override
	public ArrayList<taskEntity> findProjectTaskList(int projectId) {
		ArrayList<taskEntity> taskEntities = null;
		try {
			// 1.打开连接
			// 2.创建dao对象
			// 3.调用方法 findGoodsDetail
			// 参数：goodsid
			// 返回值：GoodsEntity
			taskEntities = dao.findProjectTaskList(projectId);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// 6.关闭连接
		}
		
		// 7.返回GoodsEntity
		return taskEntities;
	}

}
