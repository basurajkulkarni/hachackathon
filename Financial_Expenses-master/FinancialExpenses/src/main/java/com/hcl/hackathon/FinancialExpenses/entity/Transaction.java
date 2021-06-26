package com.hcl.hackathon.FinancialExpenses.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="trans_id")
	private int transId;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	
	public Transaction(int transId, int accNum, String paymentType, String transDesc, double amount) {
		super();
		this.transId = transId;
		this.accNum = accNum;
		this.paymentType = paymentType;
		this.transDesc = transDesc;
		this.amount = amount;
	}
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getTransDesc() {
		return transDesc;
	}
	public void setTransDesc(String transDesc) {
		this.transDesc = transDesc;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Column(name="acc_num")
	private int accNum;
	@Column(name="payment_type")
	private String paymentType;
	@Column(name="trans_desc")
	private String transDesc;
	@Column
	private double amount;
	

}
