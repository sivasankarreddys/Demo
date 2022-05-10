package com.ssr.loginservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="accounts")
public class Accounts {
	@Id
	@GeneratedValue
   	private long account_id;
	@Column(name="phoneno")
	private long phoneno;
	@Column(name="acc_createdDate")
	private String acc_createdDate;
	public Accounts(long account_id, long phoneno, String acc_createdDate, String firstName, String lastName,
			String identificationType, String identificationNum, AccountModel accountModel) {
		super();
		
		this.phoneno = phoneno;
		this.acc_createdDate = acc_createdDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identificationType = identificationType;
		this.identificationNum = identificationNum;
		this.accountModel = accountModel;
	}
	@Column(name="FirstName")
	private String firstName;
	@Override
	public String toString() {
		return "Accounts [account_id=" + account_id + ", phoneno=" + phoneno + ", acc_createdDate=" + acc_createdDate
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", identificationType=" + identificationType
				+ ", identificationNum=" + identificationNum + ", accountModel=" + accountModel + "]";
	}
	@Column(name="LastName")
	private String lastName;
	public Accounts(int account_id, long phoneno, String acc_createdDate, String firstName, String lastName,
			String identificationType, String identificationNum) {
		super();
		this.account_id = account_id;
		this.phoneno = phoneno;
		this.acc_createdDate = acc_createdDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identificationType = identificationType;
		this.identificationNum = identificationNum;
	}
	@Column(name="IdentificationType")
	private String identificationType;
	public long getaccount_id() {
		return account_id;
	}
	public void setaccount_id(int account_id) {
		this.account_id = account_id;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getAcc_createdDate() {
		return acc_createdDate;
	}
	public void setAcc_createdDate(String acc_createdDate) {
		this.acc_createdDate = acc_createdDate;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getIdentificationType() {
		return identificationType;
	}
	public void setIdentificationType(String identificationType) {
		this.identificationType = identificationType;
	}
	public String getIdentificationNum() {
		return identificationNum;
	}
	public void setIdentificationNum(String identificationNum) {
		this.identificationNum = identificationNum;
	}
	@Column(name="IdentificationNum")
	private String identificationNum;
	public Accounts() {
		super();
	}
	
	public AccountModel getAccountModel() {
		return accountModel;
	}
	public void setAccountModel(AccountModel accountModel) {
		this.accountModel = accountModel;
	}
	@OneToOne
	@JoinColumn(name="account_id", referencedColumnName = "account_id")
	private AccountModel accountModel;
	
	

}
