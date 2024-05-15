package com.java.challenge.main;

import java.sql.SQLException;
import java.util.List;

import com.java.challenge.dao.PaymentDao;
import com.java.challenge.dao.PaymentDaoImpl;
import com.java.challenge.model.Payment;

public class PaymentShow {
	
	public static void main(String[] args) {
		PaymentDao dao = new PaymentDaoImpl();
		try {
			List<Payment> Payment = dao.showPaymentDao();
			for (Payment payment2 : Payment) {
				System.out.println(payment2);
			}
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
