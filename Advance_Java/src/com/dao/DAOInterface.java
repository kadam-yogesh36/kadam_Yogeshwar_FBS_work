package com.dao;

import com.bean.User;

public interface DAOInterface {
	public void insertData(User u);
	public boolean getData(User u);
	public boolean isUserExists(String username);
	public boolean updatePassword(User u,String password);
	public boolean forgotPassword(String username,String newPassword);
	public boolean deleteData(String user);

}
