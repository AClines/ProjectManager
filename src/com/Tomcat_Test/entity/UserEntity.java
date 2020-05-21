package com.Tomcat_Test.entity;

public class UserEntity {
	public int userNum;//用户编号，主键，自动生成值
	public int teamNum;//团队编号，外键，依赖team表
	public String userName;//用户姓名
	public int userAccount;//用户账号
	public String userPassword;//用户密码
	public String userPhone;//用户手机号
	public String userInformation;//个人简介
	public String userSex;//性别
	public String userEmail;//邮箱
	
	//get和set方法
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
	
	//toString方法
	@Override
	public String toString() {
		return "userEntity [userNum=" + userNum + ", teamNum=" + teamNum + ", userName=" + userName + ", userAccount="
				+ userAccount + ", userPassword=" + userPassword + ", userPhone=" + userPhone + ", userInformation="
				+ userInformation + ", userSex=" + userSex + ", userEmail=" + userEmail + "]";
	}
	
	
	
}
