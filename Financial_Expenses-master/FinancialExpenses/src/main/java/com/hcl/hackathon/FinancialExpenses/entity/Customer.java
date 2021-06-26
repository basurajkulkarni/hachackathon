package com.hcl.hackathon.FinancialExpenses.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@Column(name="cust_Id")
	private int custId;
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", address=" + address + "]";
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name="cust_name")
	private String custName;
	@Column
	private String address;
	

}
