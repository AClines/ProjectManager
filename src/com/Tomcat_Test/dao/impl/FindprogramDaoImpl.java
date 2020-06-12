package com.Tomcat_Test.dao.impl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.Tomcat_Test.dao.FindprogramDao;
import com.Tomcat_Test.entity.programEntity;


import cmo.Tomcat_Test.utils.DBUtils;
//��Ŀ����Dao��ʵ����
public class FindprogramDaoImpl extends DBUtils implements FindprogramDao{
//��ѯ������Ŀʵ����
	@Override
	public ArrayList<programEntity> findAllprogram() throws Exception{
		ArrayList<programEntity> programEntities=new ArrayList<>();//���������Ŀ��Ϣ�ļ���
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
	programEntities.add(p);//�Ѷ���浽������
	closeConnection();
	closeConnection(pst);
	closeConnection(rs);
}
		return programEntities;
	}

}
