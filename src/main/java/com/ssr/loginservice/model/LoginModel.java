package com.ssr.loginservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "login")
public class LoginModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userid;
	@Column(name = "username")
	private String username;
	@Column(name = "emailid")
	private String emailId;
	@Column(name = "mobileno")
	private int mobileNo;

	public LoginModel(int userid, String username, String emailId, int mobileNo, String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.password = password;
	}

	@Column(name = "password")
	private String password;

	public LoginModel() {
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginModel [userid=" + userid + ", username=" + username + ", emailId=" + emailId + ", mobileNo="
				+ mobileNo + ", password=" + password + "]";
	}
	

}
