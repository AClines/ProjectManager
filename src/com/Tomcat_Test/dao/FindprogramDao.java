package com.Tomcat_Test.dao;

import java.util.ArrayList;

import com.Tomcat_Test.entity.programEntity;

//��Ŀ�����ݵĽӿ�
public interface FindprogramDao {
//��ѯ������Ŀ
	ArrayList<programEntity> findAllprogram() throws Exception;

}
