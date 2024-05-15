package com.java.challenge.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.challenge.model.Payment;

public interface PaymentDao {
	
	List<Payment> showPayment()throws ClassNotFoundException, SQLException;

	List<Payment> addPaymentDao() throws ClassNotFoundException, SQLException;

	List<Payment> showPaymentDao() throws ClassNotFoundException, SQLException;
	
}
