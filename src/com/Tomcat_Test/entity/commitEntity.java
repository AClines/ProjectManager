package com.Tomcat_Test.entity;

public class commitEntity {
	public int commitNum;//����,�ύ���,�Զ����ɱ��
	public int userNum;//���,�û����,����user��
	public String commitName;//�ύ����
	public String commitTime;//�ύʱ��
	//get��set����
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
	//toString����
	@Override
	public String toString() {
		return "commitEntity [commitNum=" + commitNum + ", userNum=" + userNum + ", commitName=" + commitName
				+ ", commitTime=" + commitTime + "]";
	}
	
}
