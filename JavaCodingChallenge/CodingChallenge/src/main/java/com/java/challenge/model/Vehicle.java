package com.java.challenge.model;

public class Vehicle {
	private int vehicleID;
	private String make;
	private String model;
	private int year;
	private Double dailyRate;
	private Status status;
	private int passengerCapacity;
	private Double engineCapacity;
	public int getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Double getDailyRate() {
		return dailyRate;
	}
	public void setDailyRate(Double dailyRate) {
		this.dailyRate = dailyRate;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public int getPassengerCapacity() {
		return passengerCapacity;
	}
	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	public Double getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(Double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int vehicleID, String make, String model, int year, Double dailyRate, Status status,
			int passengerCapacity, Double engineCapacity) {
		super();
		this.vehicleID = vehicleID;
		this.make = make;
		this.model = model;
		this.year = year;
		this.dailyRate = dailyRate;
		this.status = status;
		this.passengerCapacity = passengerCapacity;
		this.engineCapacity = engineCapacity;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleID=" + vehicleID + ", make=" + make + ", model=" + model + ", year=" + year
				+ ", dailyRate=" + dailyRate + ", status=" + status + ", passengerCapacity=" + passengerCapacity
				+ ", engineCapacity=" + engineCapacity + "]";
	}

	

}
