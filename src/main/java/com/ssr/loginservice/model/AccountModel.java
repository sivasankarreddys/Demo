package com.ssr.loginservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "account")
public class AccountModel {
	@Id
	private long account_id;

	public AccountModel(long account_id, long accountNum, String accounttype, int balance) {
		super();
		this.account_id = account_id;
		this.accountNum = accountNum;
		this.accounttype = accounttype;
		this.balance = balance;
	}

	public AccountModel() {
		super();
	}

	public long getAccountId() {
		return account_id;
	}

	public void setAccountId(long accountId) {
		this.account_id = accountId;
	}

	public long getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "AccountModel [accountId=" + account_id + ", accountNum=" + accountNum + ", accounttype=" + accounttype
				+ ", balance=" + balance + "]";
	}

	@Column(name = "accountnum")
	private long accountNum;
	@Column(name = "accounttype")
	private String accounttype;
	@Column(name = "balance")
	private int balance;
	

	

}
