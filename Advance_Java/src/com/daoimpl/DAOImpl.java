package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.aspect.DBUtility;
import com.bean.Employee;
import com.dao.DAOInterface;

public class DAOImpl implements DAOInterface {
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	int id;
	String name;
	double salary;
	

	// Insert data into DB
	@Override
	public void insertData(Employee e) {
		con = DBUtility.getDBConnection();
		try {
			pst = con.prepareStatement("INSERT INTO EMPLOYEES(empId, empName, salary) VALUES (?,?,?)");
			pst.setInt(1, e.geteId());
			pst.setString(2, e.geteName());
			pst.setDouble(3, e.getSalary());

			pst.executeUpdate();
		} catch (SQLException e1) {

			e1.printStackTrace();
		}

		// Release Resources
		DBUtility.resourceRelease(rs, pst, con);

	}

	@Override
	public Employee getdata(int id) {

		Employee emp=null;
			try {
				con=DBUtility.getDBConnection();
				pst = con.prepareStatement("select * from employees where empId=?");
				pst.setInt(1, id);
				rs = pst.executeQuery();
				
				if(rs.next()) {
					id = rs.getInt(1);
					name = rs.getString(2);
					salary = rs.getDouble(3);
				 emp= new Employee(id, name, salary);
				}
				return emp;
				

			} catch (SQLException e) {

				e.printStackTrace();
			} finally {
				DBUtility.resourceRelease(rs, pst, con);
			}

		

		return null;
	}

	@Override
	public boolean updateEmp(int id, double salary) {
		
			try {
				con=DBUtility.getDBConnection();
				pst = con.prepareStatement("UPDATE Employees SET salary = ? WHERE empId = ?");
				pst.setDouble(1, salary);
				pst.setInt(2, id);
				return pst.executeUpdate() > 0;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				DBUtility.resourceRelease(rs, pst, con);
			}

		

		return false;
	}

//	@Override
//	public boolean isempexists(int id) {
//		con = DBUtility.getDBConnection();
//		try {
//			pst = con.prepareStatement("select * from employees where empId=?");
//			pst.setInt(1, id);
//			pst.executeQuery();
//			return true;
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		} finally {
//			// close resources in reverse order
//			DBUtility.resourceRelease(rs, pst, con);
//		}
//		return false;
//	}

	@Override
	public boolean deleteEmp(int id) {

		
			try {
				con=DBUtility.getDBConnection();
				pst = con.prepareStatement("delete from employees where empId=?");
				pst.setInt(1, id);
				return pst.executeUpdate() > 0;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DBUtility.resourceRelease(rs, pst, con);
			}
		

		return false;
	}

	@Override
	public ArrayList<Employee> display() {
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		con = DBUtility.getDBConnection();
		try {
			pst = con.prepareStatement("Select * from Employees");
			rs = pst.executeQuery();
			while (rs.next()) {
				id = rs.getInt(1);
				name = rs.getString(2);
				salary = rs.getDouble(3);
				
				Employee emp = new Employee(id, name, salary);
				emplist.add(emp);
			}
			return emplist;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtility.resourceRelease(rs, pst, con);
		}
		return null;

	}

}
