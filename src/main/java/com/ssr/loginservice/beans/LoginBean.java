package com.ssr.loginservice.beans;



public class LoginBean {
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "LoginBean [userid=" + userid + ", username=" + username + ", emailId=" + emailId + ", mobileNo="
				+ mobileNo + ", password=" + password + "]";
	}
	public String getPassword() {
		return password;
	}
	public LoginBean(int userid, String username, String emailId, int mobileNo, String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.password = password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private int userid;
	private String username;
	private String emailId;
	private int mobileNo;
	private String password;

}
