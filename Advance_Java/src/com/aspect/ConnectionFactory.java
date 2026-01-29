package com.aspect;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
      
      public static Connection  getDbConnection() {
    	  Connection con=null;
    	try {
			FileInputStream fis=new FileInputStream(".//Resources//DBInfo.properties");
			Properties p=new Properties();
			p.load(fis);
			
			String className=p.getProperty("className");
			Class.forName(className);
			
			String url=p.getProperty("url");
			String username=p.getProperty("username");
			String password=p.getProperty("password");
			con=DriverManager.getConnection(url,username,password);
			
			
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
    	return con;
    	  
      }
}
