package com.java.challenge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.challenge.model.Lease;
import com.java.challenge.model.Type;
import com.java.challenge.util.DBConnUtil;
import com.java.challenge.util.DBPropertyUtil;

public class LeaseDaoImpl implements LeaseDao {
	Connection connection;
	PreparedStatement pst;
	
	@Override
	public List<Lease> showLeaseDao() throws ClassNotFoundException, SQLException{
		String connStr = DBPropertyUtil.getConnectionString("db");
		connection = DBConnUtil.GetConnection(connStr);
		String cmd = "select * from Lease";
		pst =  connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Lease> leaseList = new ArrayList <Lease>();
		Lease lease = null;
		while(rs.next()) {
			lease = new Lease();
			lease.setLeaseID(rs.getInt("leaseID"));
			lease.setVehicleID(rs.getInt("vehicleID"));
			lease.setCustomerID(rs.getInt("customerID"));
			lease.setTransactionDate(rs.getString("startDate"));	
			lease.setType(Type.valueOf(rs.getString("type")));
			
			leaseList.add(lease);
		}
		return leaseList;
	

	}

	public char[] addVehicleDao(Lease lease) {
		// TODO Auto-generated method stub
		return null;
	}
}