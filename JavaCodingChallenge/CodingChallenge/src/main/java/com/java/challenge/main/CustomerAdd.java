package com.java.challenge.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.challenge.dao.CustomerDao;
import com.java.challenge.dao.CustomerDaoImpl;
import com.java.challenge.model.Customer;

public class CustomerAdd {
	public static void main(String[] args) {
		Customer customer = new Customer();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter customerID  ");
			customer.setCustomerID(sc.nextInt());
			System.out.println("Enter  FirstName  ");
			customer.setFirstName(sc.next());
			System.out.println("Enter  LastName  ");
			customer.setLastName(sc.next());
			System.out.println("Enter Email  ");
			customer.setEmail(sc.next());
			System.out.println("Enter phonenumber  ");
			customer.setPhoneNumber(sc.next());
		}
		CustomerDao dao = new CustomerDaoImpl();
		try {
			System.out.println(dao.addCustomerDao(customer));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
