package com.java.challenge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.challenge.model.Status;
import com.java.challenge.model.Vehicle;
import com.java.challenge.util.DBConnUtil;
import com.java.challenge.util.DBPropertyUtil;

public  class VehicleDaoImpl implements VehicleDao {
	Connection connection;
	PreparedStatement pst;
	
	@Override
	public List<Vehicle> showVehicleDao() throws ClassNotFoundException, SQLException{
		String connStr = DBPropertyUtil.getConnectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		String cmd = "select * from Vehicle";
		pst =  connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Vehicle> vehicleList = new ArrayList <Vehicle>();
		Vehicle vehicle = null;
		while(rs.next()) {
			vehicle = new Vehicle();
			vehicle.setVehicleID(rs.getInt("vehicleID"));
			vehicle.setMake(rs.getString("make"));
			vehicle.setModel(rs.getString("model"));
			vehicle.setYear(rs.getInt("Year"));
			vehicle.setDailyRate(rs.getDouble("dailyRate"));
			vehicle.setStatus(Status.valueOf(rs.getString("status")));
			vehicle.setPassengerCapacity(rs.getInt("passengerCapacity"));
			vehicle.setEngineCapacity(rs.getDouble("engineCapacity"));
			
			vehicleList.add(vehicle);
		}
		return vehicleList;
	
	}

	public Vehicle searchVehicleDao(int vehicleID) throws ClassNotFoundException, SQLException {
		String connStr = DBPropertyUtil.getConnectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		String cmd = "select * from Employ Where Empno = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, vehicleID);
		ResultSet rs = pst.executeQuery();
		Vehicle vehicle = null;
		if (rs.next()) {
			vehicle = new Vehicle();
			vehicle.setVehicleID(rs.getInt("vehicleID"));
			vehicle.setMake(rs.getString("make"));
			vehicle.setModel(rs.getString("model"));
			vehicle.setYear(rs.getInt("Year"));
			vehicle.setDailyRate(rs.getDouble("dailyRate"));
			vehicle.setStatus(Status.valueOf(rs.getString("status")));
			vehicle.setPassengerCapacity(rs.getInt("passengerCapacity"));
			vehicle.setEngineCapacity(rs.getDouble("engineCapacity"));
		}
		return vehicle;
	}

	@Override
	public String addVehicleDao(Vehicle vehicle) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
