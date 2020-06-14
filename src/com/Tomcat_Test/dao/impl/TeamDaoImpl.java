package com.Tomcat_Test.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Tomcat_Test.dao.TeamDao;
import com.Tomcat_Test.entity.TeamEntity;

import cmo.Tomcat_Test.utils.DBUtils;

public class TeamDaoImpl extends DBUtils implements TeamDao{

	@Override
	public boolean sumbit(String teaminformation,int projectId,int userId) throws Exception {
		if(this.isSumbit(teaminformation)) {
			openConnection();
			// 写sql
			String sql = "insert into task(taskName,programNum,userNum) values(?,?,?)";

			// 创建执行sql的语句Statement,如果sql有占位符，调用setXXX方法
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, teaminformation);
			pst.setInt(2, projectId);
			pst.setInt(3, userId);
			
			int line = pst.executeUpdate();
			closeConnection();
			closeConnection(pst);
			if(line!=0) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isSumbit(String teaminformation) {
		TeamDao dao =new TeamDaoImpl();
		TeamEntity teamEntity=null;
		try {
			teamEntity=dao.find(teaminformation);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(teamEntity!=null) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public TeamEntity find(String teaminformation) throws Exception {
		openConnection();

		String sql="select * from team where teamName = ?";
		
	 PreparedStatement pst	= conn.prepareStatement(sql);
	pst.setString(1, teaminformation);

	ResultSet rs=pst.executeQuery();
	TeamEntity tEntity=null;
	while(rs.next()) {
		tEntity=new TeamEntity();
		
	     tEntity.setTeamNum(rs.getInt("teamNum"));
		tEntity.setTeamName(rs.getString("teamName"));
		
		
	}

	closeConnection();
	closeConnection(pst);
	closeConnection(rs);
	return tEntity;

	}

}
