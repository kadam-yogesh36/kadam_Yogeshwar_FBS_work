package com.gui;


import java.util.Scanner;


import com.aspect.ObjectCreater;
import com.services.LoginValidationServices;

public class ClientCode {
  public static void main(String[] args) {
	          Scanner sc = new Scanner(System.in);
	          LoginValidationServices login = ObjectCreater.createObject();
	          
	          int choice;

	          do {
	              System.out.println("\n====== MENU ======");
	              System.out.println("1. Sign Up");
	              System.out.println("2. Sign In");
	              System.out.println("3. Update Password");
	              System.out.println("4. Forgot Password");
	              System.out.println("5. Delete User");
	              System.out.println("6. Exit");
	              System.out.print("Enter your choice: ");

	              choice = sc.nextInt();

	              switch (choice) {

	                  case 1:
	                      System.out.print("Enter Username: ");
	                      String uname = sc.next();
	                      System.out.print("Enter Password: ");
	                      String pass = sc.next();
	                      login.createUser(uname, pass);
	                      System.out.println("User created successfully");
	                      break;

	                  case 2:
	                      System.out.print("Enter Username: ");
	                      uname = sc.next();
	                      System.out.print("Enter Password: ");
	                      pass = sc.next();
	                      boolean res=login.validateUser(uname, pass);
	                      
	                      if(res) {
	                    	  System.out.println("Welcome User!....");
	                      }
	                      else
	                      {
	                    	  System.out.println("Please try again!...");
	                      }
	                      break;

	                  case 3:
	                     System.out.println("Enter username");
	                     String username=sc.next();
	                      System.out.print("Enter Old Password: ");
	                      String oldPass = sc.next();
	                      System.out.print("Enter New Password: ");
	                      String newPass = sc.next();
	                      if(login.updatePassword(username,oldPass, newPass)) {
	                    	  System.out.println("Password Update Succesfully");
	                      }else
	                      {
	                    	  System.out.println("Old Password Does Not Match");
	                      }
	                    	  
	                      break;

	                  case 4:
	                      System.out.print("Enter Username: ");
	                      uname = sc.next();
	                      System.out.print("Enter New Password: ");
	                      String newPassword = sc.next();
	                      if(login.forgotPassword(uname,newPassword)) {
	                    	  System.out.println("New Password Set Succesfully!..");
	                      }
	                      else
	                      {
	                    	  System.out.println("User Not Found!....");
	                      }
	                      break;
	                  case 5:
	                      System.out.print("Enter Username: ");
	                      uname = sc.next();
	                      if(login.deleteUser(uname)) 
	                      {
	                    	  System.out.println("Users Deleted Succesfully!..");
	                      }
	                  else
	                      {
	                    	  System.out.println("User Not Found!.....");
	                      }
	                      break;

	                  case 6:
	                      System.out.println("Thank you! Exiting...");
	                      break;

	                  default:
	                      System.out.println("Invalid choice");
	              }

	          } while (choice != 6);
	          


	          sc.close();
	      }
	  

	  
	  
	  
	  
}

