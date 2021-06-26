package com.hcl.hackathon.FinancialExpenses.dto;

public class TransactionResponse {
	
	private int transactionid;
	@Override
	public String toString() {
		return "TransactionResponse [transactionid=" + transactionid + ", StatusCode=" + StatusCode + ", statusMessage="
				+ statusMessage + "]";
	}
	public int getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}
	public int getStatusCode() {
		return StatusCode;
	}
	public void setStatusCode(int statusCode) {
		StatusCode = statusCode;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	private int StatusCode;
	private String statusMessage;

}
