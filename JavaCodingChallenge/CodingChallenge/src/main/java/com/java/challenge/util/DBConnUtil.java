package com.java.challenge.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBConnUtil {
	public static Connection GetConnection(String connStr) throws ClassNotFoundException, SQLException{

			ResourceBundle rb = ResourceBundle.getBundle("db");

			String driver = rb.getString("driver");

			String user = rb.getString("user");

			String pwd = rb.getString("password");

			Class.forName(driver);

			Connection con = DriverManager.getConnection(connStr, user, pwd);

			return con;
			}
}
