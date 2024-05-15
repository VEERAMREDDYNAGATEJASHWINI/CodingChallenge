package com.java.challenge.model;

import java.sql.Date;

public class Payment {
	private int paymentID;
	private int leaseID;
	private Date transactionDate;
	private Double amount;
	public int getPaymentID() {
		return paymentID;
	}
	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}
	public int getLeaseID() {
		return leaseID;
	}
	public void setLeaseID(int leaseID) {
		this.leaseID = leaseID;
	}
	public Date getPaymentDate() {
		return transactionDate;
	}
	public void setPaymentDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(int paymentID, int leaseID, Date paymentDate, Double amount, Date transactionDate) {
		super();
		this.paymentID = paymentID;
		this.leaseID = leaseID;
		this.transactionDate = transactionDate;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Payment [paymentID=" + paymentID + ", leaseID=" + leaseID + ", transactionDate=" + transactionDate + ", amount="
				+ amount + "]";
	}
	public static void add(Payment payment) {
		// TODO Auto-generated method stub
		
	}
	public void setTransactionDate(String date) {
		// TODO Auto-generated method stub
		
	}
	
	

}
