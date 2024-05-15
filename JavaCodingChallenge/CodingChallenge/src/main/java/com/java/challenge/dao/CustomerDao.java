package com.java.challenge.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.challenge.model.Customer;
public interface CustomerDao {
	List<Customer> showCustomerDao()throws ClassNotFoundException, SQLException;

	String addCustomerDao(Customer customer) throws ClassNotFoundException, SQLException;  
	
	

}
