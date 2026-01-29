package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.aspect.ConnectionFactory;
import com.bean.User;
import com.dao.DAOInterface;

public class DAOImpl implements DAOInterface {

	Connection con = ConnectionFactory.getDbConnection();
	PreparedStatement pst;
	ResultSet rs;

	public void insertData(User u) {
		// Fired insert query with object data into DB
		try {
			pst = con.prepareStatement("INSERT INTO users (username, password) values (?,?)");
			pst.setString(1, u.getUserName());
			pst.setString(2, u.getPassword());
			pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public boolean getData(User u) {

		try {
			pst = con.prepareStatement("select * from users where username=? AND password=?");
			pst.setString(1, u.getUserName());
			pst.setString(2, u.getPassword());

			rs = pst.executeQuery();

			return rs.next();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean isUserExists(String username) {
		
		try {
			pst = con.prepareStatement("select * from users where username=?");
			pst.setString(1, username);
			

			rs = pst.executeQuery();

			return rs.next();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}

	

	@Override
	public boolean updatePassword(User u, String password) {
		boolean status=false;
		
		       try {
				pst=con.prepareStatement("UPDATE users SET password=? WHERE username=? AND password=?");
				
				pst.setString(1, password);
				pst.setString(2, u.getUserName());
				pst.setString(3, u.getPassword());
				
				 status = pst.executeUpdate() > 0;
				
			   } catch (SQLException e) {
			
				e.printStackTrace();
			   }
		return status;
	}

	@Override
	public boolean forgotPassword(String username, String newPassword) {
		boolean status=false;
		     try {
				pst=con.prepareStatement("UPDATE users SET password=? WHERE username=?");
				pst.setString(1, newPassword);
				pst.setString(2, username);
		    status=pst.executeUpdate()>0;
				
			 }
		     catch (SQLException e)
		     {
			    
				e.printStackTrace();
			 }
		return status;
	}

	@Override
	public boolean deleteData(String user) {
		boolean status=false;
		
		try {
			pst=con.prepareStatement("DELETE FROM users WHERE TRIM(LOWER(username)) = LOWER(?)");
			pst.setString(1, user);
			status=pst.executeUpdate()>0;
			
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		return status;
	}

}
