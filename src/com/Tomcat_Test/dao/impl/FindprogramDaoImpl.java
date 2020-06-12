package com.Tomcat_Test.dao.impl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.Tomcat_Test.dao.FindprogramDao;
import com.Tomcat_Test.entity.programEntity;


import cmo.Tomcat_Test.utils.DBUtils;
//项目数据Dao层实现类
public class FindprogramDaoImpl extends DBUtils implements FindprogramDao{
//查询所有项目实现类
	@Override
	public ArrayList<programEntity> findAllprogram() throws Exception{
		ArrayList<programEntity> programEntities=new ArrayList<>();//存放所有项目信息的集合
		openConnection();
		String sql="select * from program where parentid=0";
		PreparedStatement pst	= conn.prepareStatement(sql);
		ResultSet rs= pst.executeQuery();
   programEntity p=null;
   while (rs.next()) {
	p=new programEntity();
	p.setTeamNum(rs.getInt("teamNum"));
	p.setProgramNum(rs.getInt("programNum"));
	p.setProgramName(rs.getString("programName"));
	p.setProgramInformation(rs.getString("programInformation"));
	programEntities.add(p);//把对象存到集合中
	closeConnection();
	closeConnection(pst);
	closeConnection(rs);
}
		return programEntities;
	}

}
