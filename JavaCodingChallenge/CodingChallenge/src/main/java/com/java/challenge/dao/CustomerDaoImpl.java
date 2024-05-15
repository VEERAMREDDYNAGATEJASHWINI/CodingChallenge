package com.java.challenge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.challenge.model.Customer;
import com.java.challenge.util.DBConnUtil;
import com.java.challenge.util.DBPropertyUtil;

public class CustomerDaoImpl implements CustomerDao {
		Connection connection;
		PreparedStatement pst;
		
		@Override
		public List<Customer> showCustomerDao() throws ClassNotFoundException, SQLException{
			String connStr = DBPropertyUtil.getConnectionString("db");
			connection = DBConnUtil.GetConnection(connStr);
			String cmd = "select * from Customer";
			pst =  connection.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			List<Customer> CustomerList = new ArrayList <Customer>();
			Customer customer = null;
			while(rs.next()) {
				customer = new Customer();
				customer.setCustomerID(rs.getInt("customerID"));
				customer.setFirstName(rs.getString("firstName"));
				customer.setLastName(rs.getString("LastName"));
				customer.setEmail(rs.getString("email"));
				customer.setPhoneNumber(rs.getString("PhoneNumber"));
				
				CustomerList.add(customer);
			}
			return CustomerList;
		
		}

		@Override
		public String addCustomerDao(Customer customer) throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
			return null;
		}


}
