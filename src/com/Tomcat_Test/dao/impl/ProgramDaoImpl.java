package com.Tomcat_Test.dao.impl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Tomcat_Test.dao.IUserDao;
import com.Tomcat_Test.dao.ProgramDao;
import com.Tomcat_Test.entity.UserEntity;
import com.Tomcat_Test.entity.programEntity;

import cmo.Tomcat_Test.utils.DBUtils;
//鐢ㄦ埛鐩稿叧鏁版嵁灞傛帴鍙ｅ疄鐜扮被
public class ProgramDaoImpl extends DBUtils implements ProgramDao {
  
	@Override
	public boolean sumbit(String programname, String programinformation) throws Exception {
		if(this.isSumbit(programname)) {
			openConnection();
			// 写sql
			String sql = "insert into program(programname,programinformation) values(?,?)";

			// 创建执行sql的语句Statement,如果sql有占位符，调用setXXX方法
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, programname);
			pst.setString(2, programinformation);
			
			
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
	
	public programEntity find(String programname) throws Exception {
		
	
	openConnection();

	String sql="select * from program where programName = ?";
	
 PreparedStatement pst	= conn.prepareStatement(sql);
pst.setString(1, programname);

ResultSet rs=pst.executeQuery();
programEntity program = null;
while(rs.next()) {
	program=new programEntity();
	program.setProgramNum(rs.getInt("programNum"));
     program.setTeamNum(rs.getInt("teamNum"));
	program.setProgramName(rs.getString("programName"));
	program.setProgramInformation(rs.getString("programInformation"));
	
}

closeConnection();
closeConnection(pst);
closeConnection(rs);
return program;

	
	}
	
	public boolean isSumbit(String programname) {//查询是否被注册
		ProgramDao dao =new ProgramDaoImpl();
		programEntity pEntity=null;
		try {
			pEntity=dao.find(programname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(pEntity!=null) {
			return false;
		}
		else {
			return true;
		}

     }
}
