package com.Tomcat_Test.entity;

public class programEntity {
	public int programNum;//锟斤拷目锟斤拷牛锟斤拷锟斤拷锟斤拷锟斤拷远锟斤拷锟斤拷锟�
	public int teamNum;
	public String programName;//锟脚讹拷锟斤拷锟斤拷
	public String programStartTime;
	public String programEndTime;//锟斤拷止时锟斤拷
	public String programRate;//锟斤拷目锟斤拷锟斤拷
	public String programInformation;
		
	
	
	//get锟斤拷set锟斤拷锟斤拷
	
	
	public int getProgramNum() {
		return programNum;
	}
	public void setProgramNum(int programNum) {
		this.programNum = programNum;
	}
	public int getTeamNum() {
		return teamNum;
	}
	public void setTeamNum(int teamNum) {
		this.teamNum = teamNum;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getProgramStartTime() {
		return programStartTime;
	}
	public void setProgramStartTime(String programStartTime) {
		this.programStartTime = programStartTime;
	}
	public String getProgramEndTime() {
		return programEndTime;
	}
	public void setProgramEndTime(String programEndTime) {
		this.programEndTime = programEndTime;
	}
	public String getProgramRate() {
		return programRate;
	}
	public void setProgramRate(String programRate) {
		this.programRate = programRate;
	}
	
	public String getProgramInformation() {
		return programInformation;
	}
	public void setProgramInformation(String programInformation) {
		this.programInformation = programInformation;
	}
	//toString锟斤拷锟斤拷
	@Override
	public String toString() {
		return "programEntity [programNum=" + programNum + ", teamNum=" + teamNum + ", programName=" + programName
				+ ", programStartTime=" + programStartTime + ", programEndTime=" + programEndTime + ", programRate="
				+ programRate + ", programInformation=" + programInformation + "]";
	}
	
	
	
}
