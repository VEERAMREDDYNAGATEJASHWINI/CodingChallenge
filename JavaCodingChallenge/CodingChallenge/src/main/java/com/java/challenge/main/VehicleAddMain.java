package com.java.challenge.main;

import java.util.Scanner;
import java.sql.SQLException;
import com.java.challenge.dao.VehicleDao;
import com.java.challenge.dao.VehicleDaoImpl;
import com.java.challenge.model.Status;
import com.java.challenge.model.Vehicle;

public class VehicleAddMain {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter VehicleID:");
		vehicle.setVehicleID(sc.nextInt());
		
		System.out.println("Enter make:");
		vehicle.setMake(sc.next());
		
		System.out.println("Enter model:");
		vehicle.setModel(sc.next());
		
		System.out.println("Enter Year:");
		vehicle.setYear(sc.nextInt());
		
		System.out.println("Enter DailyRate:");
		vehicle.setDailyRate(sc.nextDouble());
		
		System.out.println("Enter Status:");
		vehicle.setStatus(Status.valueOf(sc.next()));
		
		System.out.println("Enter PassengerCapacity:");
		vehicle.setPassengerCapacity(sc.nextInt());
		
		System.out.println("Enter engineCapacity:");
		vehicle.setEngineCapacity(sc.nextDouble());
		
		VehicleDao dao = new VehicleDaoImpl();
		try {
			System.out.println(dao.addVehicleDao(vehicle));
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
