package com.lt.app.model;

public class BankDAO {
	
	private String bankName;
	private Long bankID;
	private String branch;
	private Address address;
	
	public BankDAO() {
		
	}
	
	public BankDAO(String bankName, Long bankID, String branch, Address address) {
		super();
		this.bankName = bankName;
		this.bankID = bankID;
		this.branch = branch;
		this.address = address;
	}
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Long getBankID() {
		return bankID;
	}
	public void setBankID(Long bankID) {
		this.bankID = bankID;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
