package com.servicesimpl;

import java.util.ArrayList;

import com.aspect.ObjectCreator;
import com.bean.Employee;
import com.dao.DAOInterface;
import com.services.EmployeeManagementServices;

public class EmployeeManagementServicesImpl  implements EmployeeManagementServices {
         
	       DAOInterface dao=ObjectCreator.createDAOObject();
	@Override
	public void addEmployee(int id, String name, double salary) {
		Employee employee=new Employee(id,name,salary);
		  dao.insertData(employee);
		
	}

	@Override
	public boolean deleteEmployee(int id) {
		
		return dao.deleteEmp(id);
	}

	@Override
	public Employee searchByID(int id) {
		
		return dao.getdata(id);
	}

	

	@Override
	public void displayEmployee() {
	    ArrayList<Employee> emplist = dao.display();

	    // Table header
	    System.out.printf("%-10s %-20s %-10s%n", "EmpId", "EmpName", "Salary");
	    System.out.println("-------------------------------------------");

	    // Table rows
	    for (Employee e : emplist) {
	        System.out.printf("%-10d %-20s %-10.2f%n", e.geteId(), e.geteName(), e.getSalary());
	    }
	}

	@Override
	public boolean updateByID(int id, double salary) {
		
		return dao.updateEmp(id, salary);
	}

	
	

	
}
