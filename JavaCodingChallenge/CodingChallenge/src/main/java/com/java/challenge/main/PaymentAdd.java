package com.java.challenge.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.challenge.dao.PaymentDao;
import com.java.challenge.dao.PaymentDaoImpl;
import com.java.challenge.model.Payment;


public class PaymentAdd {
	private static Payment Payment;

	public static void main(String[] args) {
		Payment = new Payment();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter PaymentID:");
		Payment.setPaymentID(sc.nextInt());
		System.out.println("Enter LeaseID:");
		Payment.setLeaseID(sc.nextInt());
		System.out.println("Enter transactionDate:");
		Payment.setTransactionDate(sc.next());
		System.out.println("Enter amount:");
		Payment.setAmount(sc.nextDouble());
		
		PaymentDao dao = new PaymentDaoImpl();
		try {
			System.out.println(dao.addPaymentDao());
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
