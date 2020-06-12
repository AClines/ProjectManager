package com.Tomcat_Test.dao;

import java.util.ArrayList;

import com.Tomcat_Test.entity.programEntity;

//项目的数据的接口
public interface FindprogramDao {
//查询所有项目
	ArrayList<programEntity> findAllprogram() throws Exception;

}
