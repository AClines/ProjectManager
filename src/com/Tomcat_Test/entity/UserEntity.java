package com.Tomcat_Test.entity;

public class UserEntity {
	public int userNum;//�û���ţ��������Զ�����ֵ
	public int teamNum;//�Ŷӱ�ţ����������team��
	public String userName;//�û�����
	public int userAccount;//�û��˺�
	public String userPassword;//�û�����
	public String userPhone;//�û��ֻ���
	public String userInformation;//���˼��
	public String userSex;//�Ա�
	public String userEmail;//����
	
	//get��set����
	public int getUserNum() {
		return userNum;
	}
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	public int getTeamNum() {
		return teamNum;
	}
	public void setTeamNum(int teamNum) {
		this.teamNum = teamNum;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(int userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserInformation() {
		return userInformation;
	}
	public void setUserInformation(String userInformation) {
		this.userInformation = userInformation;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	//toString����
	@Override
	public String toString() {
		return "userEntity [userNum=" + userNum + ", teamNum=" + teamNum + ", userName=" + userName + ", userAccount="
				+ userAccount + ", userPassword=" + userPassword + ", userPhone=" + userPhone + ", userInformation="
				+ userInformation + ", userSex=" + userSex + ", userEmail=" + userEmail + "]";
	}
	
	
	
}
