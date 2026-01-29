package com.services;

import com.bean.Employee;

public interface EmployeeManagementServices {
	   public void addEmployee(int id, String name, double salary);
	   public boolean deleteEmployee(int id);
	   public Employee searchByID(int id);
	   public boolean updateByID(int id,double salary);
	   public void displayEmployee();
	   
}
