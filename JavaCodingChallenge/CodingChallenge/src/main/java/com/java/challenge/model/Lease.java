package com.java.challenge.model;

public class Lease {
	private int leaseID;
	private int vehicleID;
	private int customerID;
	private Type type;
	private String TransactionDate;
	public int getLeaseID() {
		return leaseID;
	}
	public void setLeaseID(int leaseID) {
		this.leaseID = leaseID;
	}
	public int getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public String getTransactionDate() {
		return TransactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		TransactionDate = transactionDate;
	}
	public Lease() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lease(int leaseID, int vehicleID, int customerID, Type type, String transactionDate) {
		super();
		this.leaseID = leaseID;
		this.vehicleID = vehicleID;
		this.customerID = customerID;
		this.type = type;
		TransactionDate = transactionDate;
	}
	@Override
	public String toString() {
		return "Lease [leaseID=" + leaseID + ", vehicleID=" + vehicleID + ", customerID=" + customerID + ", type="
				+ type + ", TransactionDate=" + TransactionDate + "]";
	}
	public void setTransactionDate1(String next) {
		// TODO Auto-generated method stub
		
	}
	public void setTransactionDate1actionDate(String next) {
		// TODO Auto-generated method stub
		
	}
	
	
}
	