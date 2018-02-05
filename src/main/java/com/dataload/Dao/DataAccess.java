package com.dataload.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author SE410
 */
public class DataAccess {

	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String DB_CONNECTION = "jdbc:mysql://192.168.40.149:3306/testSpring";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "root";
	public Connection getConnection() throws Exception {
		try {
			Connection connection = null;
			String connectionURL = DB_CONNECTION;
			Class.forName(DB_DRIVER).newInstance();
			connection = DriverManager.getConnection(connectionURL, DB_USER, DB_PASSWORD);
			return connection;
		} catch (Exception e) {
			throw e;
		}
	}
	/*public String getLoginDetails(Connection connection, String query) {
            
		String userCredential = "Failed";
		try {
			Statement st = (Statement) connection.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				userCredential = rs.getString("password");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userCredential;
	}	*/
	//String sql="{call proc_Claimfilenameinsert(?,?)}";
}
