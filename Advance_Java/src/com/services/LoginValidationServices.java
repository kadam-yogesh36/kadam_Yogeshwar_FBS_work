package com.services;
//Menu Card 
public interface LoginValidationServices {
	
	     public void createUser(String username,String password);
	     public boolean validateUser(String username,String password);
	     public boolean updatePassword(String username,String oldPassword,String newwPassword );
	     public boolean forgotPassword(String username,String newPass);
	     public boolean deleteUser(String username);
	     
	
	

}
