package com.dataload.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.dataload.modal.RegisterNew;

@Repository
public class RegisterDaoImpl implements RegisterDao{
	
	@Override
	public boolean register(RegisterNew register) {
		System.out.println("values : "+ register.getFirstname().toString());
		String sql="insert into register(firstname,middlename,lastname,email,phoneno) values (?,?,?,?,?)";
		Connection connection = null;
		PreparedStatement preparedStatement =null;
		boolean status = true;
		try {
			connection = new DataAccess().getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, register.getFirstname());
			preparedStatement.setString(2, register.getMiddlename());
			preparedStatement.setString(3, register.getLastname());
			preparedStatement.setString(4, register.getEmail());
			preparedStatement.setString(5, register.getPhoneno());			
			preparedStatement.execute();			
		} catch (Exception e) {
			status = false;
			System.out.println("Exception in RegisterDaoImpl.register"+e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("SQLException in RegisterDaoImpl.register"+e.getMessage());
				status = false;
				e.printStackTrace();
			}
		}
		return status;
	}

}
