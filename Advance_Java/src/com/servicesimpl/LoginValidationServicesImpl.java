package com.servicesimpl;

import com.aspect.ObjectCreater;
import com.bean.User;
import com.dao.DAOInterface;
import com.services.LoginValidationServices;

public class LoginValidationServicesImpl implements LoginValidationServices {

	//Data Supplied by POJO ---Has a Realtionship
	User user;
	DAOInterface dao=ObjectCreater.createDaoObject();
	@Override
	public void createUser(String username, String password) {
		user=new User(username,password);
		dao.insertData(user);
		
	}

	@Override
	public boolean validateUser(String username, String password) {
		if (username == null || password == null) {
	        return false;
	    }

	    User user = new User();
	    user.setUserName(username);
	    user.setPassword(password);

		return dao.getData(user);
	}

	@Override
	public boolean updatePassword(String username,String oldPassword, String newPassword) {
		
		User user = new User();
	    user.setUserName(username);
	    user.setPassword(oldPassword);
	 // validate old credentials
	    if (!dao.getData(user)) {
	        return false;
	    }

	    //  update password and return actual DB result
	    return dao.updatePassword(user, newPassword);
	}

	@Override
	public boolean forgotPassword(String username,String newPass) {
		if(dao.isUserExists(username)) {
			dao.forgotPassword(username, newPass);
			return true;
		}
		return  false;
	}

	@Override
	public boolean deleteUser(String username) {
		//validation
		if (username == null) {
	        return false;
	    }
		//check userName exist or not 
		if(dao.isUserExists(username)) {
			dao.deleteData(username);
			return true;
		}
		return false;
	}
	
	

}
