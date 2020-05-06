package com.Tomcat_Test.entity;

import com.sun.jmx.snmp.Timestamp;

public class UserEntity {

	private int userid;
	private String userName;
	private String email;
	private String password;
	private int role;
	private int status;
	private int sex;
	private String phone;
	private Timestamp registtime;
	private String faceurl;
	@Override
	public String toString() {
		return "UserEntity [userid=" + userid + ", userName=" + userName + ", email=" + email + ", password=" + password
				+ ", role=" + role + ", status=" + status + ", sex=" + sex + ", phone=" + phone + ", registtime="
				+ registtime + ", faceurl=" + faceurl + "]";
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Timestamp getRegisttime() {
		return registtime;
	}
	public void setRegisttime(Timestamp registtime) {
		this.registtime = registtime;
	}
	public String getFaceurl() {
		return faceurl;
	}
	public void setFaceurl(String faceurl) {
		this.faceurl = faceurl;
	}
}
