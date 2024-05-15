package com.java.challenge.main;

import java.sql.SQLException;
import java.util.List;
import com.java.challenge.dao.VehicleDao;
import com.java.challenge.dao.VehicleDaoImpl;
import com.java.challenge.model.Vehicle;

public class VehicleShowMain {
	
	public static void main(String[] args) {
		VehicleDao dao = new VehicleDaoImpl();
		try {
			List<Vehicle> vehicleList = dao.showVehicleDao();
			for (Vehicle vehicle : vehicleList) {
				System.out.println(vehicle);
			}
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
