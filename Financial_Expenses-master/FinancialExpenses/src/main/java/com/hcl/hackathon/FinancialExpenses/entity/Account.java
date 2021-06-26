package com.hcl.hackathon.FinancialExpenses.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Primary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
public class Account {
	@Id
	@Column(name="account_num")
	private int accountNum;
	public Account(int accountNum, String accountType, int custId, double avaiableBalance) {
		super();
		this.accountNum = accountNum;
		this.accountType = accountType;
		this.custId = custId;
		this.avaiableBalance = avaiableBalance;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public double getAvaiableBalance() {
		return avaiableBalance;
	}
	public void setAvaiableBalance(double avaiableBalance) {
		this.avaiableBalance = avaiableBalance;
	}
	@Column(name="account_type")
	private String accountType;
	@Column(name="cust_id")
	private int custId;
	@Column(name="available_balance")
	private double avaiableBalance;
	

}
