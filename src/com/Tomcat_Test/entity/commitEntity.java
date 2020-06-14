package com.Tomcat_Test.entity;

public class commitEntity {
	public int commitNum;//主键,提交编号,自动生成编号
	public int userNum;//外键,用户编号,依赖user表
	public String commitName;//提交名称
	public String commitTime;//提交时间
	public int programNum;//所属项目ID
	public int taskNum;//所属任务ID
	public int getProgramNum() {
		return programNum;
	}
	public void setProgramNum(int projectId) {
		this.programNum = projectId;
	}
	public int getTaskNum() {
		return taskNum;
	}
	public void setTaskNum(int taskId) {
		this.taskNum = taskId;
	}
	//get和set方法
	public int getCommitNum() {
		return commitNum;
	}
	public void setCommitNum(int commitNum) {
		this.commitNum = commitNum;
	}
	public int getUserNum() {
		return userNum;
	}
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	public String getCommitName() {
		return commitName;
	}
	public void setCommitName(String commitName) {
		this.commitName = commitName;
	}
	public String getCommitTime() {
		return commitTime;
	}
	public void setCommitTime(String commitTime) {
		this.commitTime = commitTime;
	}
	//toString方法
	@Override
	public String toString() {
		return "commitEntity [commitNum=" + commitNum + ", userNum=" + userNum + ", commitName=" + commitName
				+ ", commitTime=" + commitTime + "]";
	}
	
}
