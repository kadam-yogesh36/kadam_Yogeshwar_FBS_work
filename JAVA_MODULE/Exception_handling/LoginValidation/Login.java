/*✅ Problem Statement: Login Validation Using Custom Exceptions (Single User)

Create a Java program that simulates a simple login system for one predefined user.
The program must use two custom exceptions:

InvalidUsernameException

InvalidPasswordException

Requirements:

Create a Login class with two attributes:

username (predefined, e.g., "admin")

password (predefined, e.g., "12345")

In the Login class, implement:

validateUsername(String enteredUsername)

If the entered username does not match the stored username, throw InvalidUsernameException.

validatePassword(String enteredPassword)

If the entered password does not match the stored password, throw InvalidPasswordException.

In the main method:

Ask the user to enter the username.

If the username is invalid → display the exception message and stop the program (do not ask for password).

If the username is valid → allow the user to enter the password.

Password validation must happen inside a loop with a maximum of 3 attempts:

If the password is incorrect, throw and catch InvalidPasswordException and show how many attempts remain.

If the user enters the correct password → print “Login Successful!”

If all 3 attempts fail → display “Account Locked!”*/

package com.LoginValidation;

import java.util.Scanner;

public class Login {
	      String systemUsername="Yogesh";
	     String systemPassword="Yogesh@123";
	       
	     String userName;
	     String password;
	     
	     
	     
		 public String getUserName() {
			return userName;
		}


		 public void setUserName(String userName) {
			 this.userName = userName;
		 }


		 public String getPassword() {
			 return password;
		 }


		 public void setPassword(String password) {
			 this.password = password;
		 }


		 public Login(String userName, String password) {
			super();
			this.userName = userName;
			this.password = password;
		 }
	     
		 
		 void validateUserName() throws InvalidUsernameException {
			   
			 if(!systemUsername.equals(userName)) {
				 throw new InvalidUsernameException();
			 }
			 
		 }
		 
		 
		 void validatePassword() throws InvalidPasswordException {
			 if(!systemPassword.equals(password)) {
				 throw new InvalidPasswordException();
			 }
		 }
		 
	

}//Login class Ends here

class TestLogin{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Username : ");
		String username=sc.next();

		Login l=new Login(username, null);  

		try {
		    l.validateUserName();  

		    boolean loggedIn=false;

		    for (int i=1;i<=3;i++) {

		        System.out.print("Enter Password ("+i +"/3): ");
		        String pass=sc.next();
		        l.setPassword(pass); 

		        try {
		            l.validatePassword();   
		            loggedIn = true;
		            break;
		        } 
		        catch (InvalidPasswordException e) {
		            System.out.println(e);

		            if (i == 3) {
		                System.out.println("❌ 3 Attempts Over! Access Denied.");
		            }
		        }
		    }

		    if (loggedIn) {
		        System.out.println("✔ Login Successfully....");
		    }

		} catch (InvalidUsernameException e) {
		    System.out.println(e);
		}
	}

}


