package com.java.challenge.main;

import java.sql.SQLException;
import java.util.List;

import com.java.challenge.dao.CustomerDao;
import com.java.challenge.dao.CustomerDaoImpl;
import com.java.challenge.model.Customer;


public class CustomerShowMain {
	public static void main(String[] args) {
		CustomerDao dao = new CustomerDaoImpl();
		try {
			List<Customer> customerList = dao.showCustomerDao();
			for (Customer customer : customerList) {
				System.out.println(customer);
			}
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
