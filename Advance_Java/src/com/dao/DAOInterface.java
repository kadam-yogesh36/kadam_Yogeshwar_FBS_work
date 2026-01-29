package com.dao;

import java.util.ArrayList;

import com.bean.Employee;

public interface DAOInterface {
	public void insertData(Employee e);

	public Employee getdata(int id);

	public boolean updateEmp(int id,double salary);

//	public boolean isempexists(int id);

	public boolean deleteEmp(int id);

	public ArrayList<Employee> display();

}
