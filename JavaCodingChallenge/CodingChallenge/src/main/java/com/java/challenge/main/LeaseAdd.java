package com.java.challenge.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.challenge.dao.LeaseDaoImpl;
import com.java.challenge.model.Lease;


public class LeaseAdd {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Lease lease = new Lease();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter LeaseID:");
		lease.setLeaseID(sc.nextInt());
		
		System.out.println("Enter vID:");
		lease.setVehicleID(sc.nextInt());
		
		System.out.println("Enter cID:");
		lease.setCustomerID(sc.nextInt());
		
		System.out.println("Enter Year:");
		lease.setTransactionDate(sc.next());
		
		
		
		LeaseDaoImpl dao =new LeaseDaoImpl();
		System.out.println(dao.addVehicleDao(lease));
	}


}
