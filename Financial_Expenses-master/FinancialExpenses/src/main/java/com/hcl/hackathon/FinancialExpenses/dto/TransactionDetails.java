package com.hcl.hackathon.FinancialExpenses.dto;

public class TransactionDetails {


	private double amount;
	private String transactionDesc;
	private String paymentType;
	public TransactionDetails(double amount, String transactionDesc, String paymentType) {
		super();
		this.amount = amount;
		this.transactionDesc = transactionDesc;
		this.paymentType = paymentType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTransactionDesc() {
		return transactionDesc;
	}
	public void setTransactionDesc(String transactionDesc) {
		this.transactionDesc = transactionDesc;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	@Override
	public String toString() {
		return "TransactionDetails [amount=" + amount + ", transactionDesc=" + transactionDesc + ", paymentType="
				+ paymentType + "]";
	}
}
