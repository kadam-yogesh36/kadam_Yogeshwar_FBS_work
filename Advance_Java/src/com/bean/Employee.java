package com.bean;

import java.util.Objects;

public class Employee {
	int eId;
	String eName;
	double salary;
	
	/**
	 * 
	 */
	public Employee() {
		super();
		
	}
	
	
	public Employee(int eId, String eName, double salary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
	}
	
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", salary=" + salary + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(eId, eName, salary);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return eId == other.eId && Objects.equals(eName, other.eName)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}


	

	
	

}
