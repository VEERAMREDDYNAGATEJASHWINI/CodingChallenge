package com.java.challenge.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.challenge.model.Lease;

public interface LeaseDao {
	
	List<Lease> showLeaseDao()throws ClassNotFoundException, SQLException;

}
