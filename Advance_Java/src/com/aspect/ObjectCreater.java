package com.aspect;

import java.io.FileInputStream;
import java.util.Properties;

import com.dao.DAOInterface;
import com.services.LoginValidationServices;

public class ObjectCreater {

	private static Properties loadProperties() {
		Properties p = new Properties();
		try {
			FileInputStream fis = new FileInputStream(".//Resources//ObjectClass.properties");
			p.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}

	public static LoginValidationServices createObject() {
		LoginValidationServices login = null;
		try {
			Properties p = loadProperties();
			String className = p.getProperty("businessClass");
			login = (LoginValidationServices) Class.forName(className).getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return login;
	}

	public static DAOInterface createDaoObject() {
		DAOInterface dao = null;
		try {
			Properties p = loadProperties();
			String className = p.getProperty("daoimplclass");
			dao = (DAOInterface) Class.forName(className).getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dao;
	}
}
