package com.aspect;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtility {

	public static Connection getDBConnection() {

		Connection con = null;

		try {
			FileInputStream fis = new FileInputStream(".//Resources//DBInfo.properties");
			Properties p = new Properties();
			p.load(fis);

			String classname = p.getProperty("className");
			String url = p.getProperty("url");
			String userName = p.getProperty("userName");
			String password = p.getProperty("password");
			con = DriverManager.getConnection(url, userName, password);
			

		} catch (IOException | SQLException e) {

			e.printStackTrace();
		}
		return con;

	}

	public static void resourceRelease(ResultSet rs, PreparedStatement pst, Connection con) {
		try {
			if (rs != null) rs.close();
            if (pst != null) pst.close();
            if (con != null) con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
