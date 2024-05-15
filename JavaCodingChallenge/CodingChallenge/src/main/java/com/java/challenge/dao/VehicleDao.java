package com.java.challenge.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.challenge.model.Vehicle;

public interface VehicleDao {
	List<Vehicle> showVehicleDao() throws ClassNotFoundException, SQLException;

	String addVehicleDao(Vehicle vehicle) throws ClassNotFoundException, SQLException; 
}
