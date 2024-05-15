package com.java.challenge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.challenge.model.Payment;
import com.java.challenge.util.DBConnUtil;
import com.java.challenge.util.DBPropertyUtil;
public class PaymentDaoImpl implements PaymentDao{

	Connection connection;
	PreparedStatement pst;
	
	@Override
	public List<Payment> showPaymentDao() throws ClassNotFoundException, SQLException{
		String connStr = DBPropertyUtil.getConnectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		String cmd = "select * from Payment";
		pst =  connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Payment> paymentList = new ArrayList <Payment>();
		Payment payment = null;
		while(rs.next()) {
			payment = new Payment();
			payment.setPaymentID(rs.getInt("paymentID"));
			payment.setLeaseID(rs.getInt("leaseID"));
			payment.setTransactionDate(rs.getString("transactionDate"));
			payment.setAmount(rs.getDouble("amount"));
			
			Payment.add(payment);
		}
		return paymentList;
	}

	@Override
	public List<Payment> showPayment() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> addPaymentDao() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
