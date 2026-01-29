package com.aspect;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import com.dao.DAOInterface;
import com.services.EmployeeManagementServices;

public class ObjectCreator {
	public static EmployeeManagementServices createObject() {
		EmployeeManagementServices ems=null;
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(".//Resources//ObjectClass.properties");
			Properties p=new Properties();
			p.load(fis);
			
			String classname=p.getProperty("className");
			
			ems=(EmployeeManagementServices) Class.forName(classname).newInstance();
		} catch (IOException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ems;
		
	
		
		
	}
	
	public static DAOInterface createDAOObject() {
		DAOInterface dao=null;
		
	try {
		FileInputStream	fis = new FileInputStream(".//Resources//ObjectClass.properties");
			Properties p=new Properties();
			p.load(fis);
			
			String classname=p.getProperty("DAOClassName");
			dao=(DAOInterface) Class.forName(classname).newInstance();
	} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | IOException e) {
		
		e.printStackTrace();
	}
		return dao;
	}

}
