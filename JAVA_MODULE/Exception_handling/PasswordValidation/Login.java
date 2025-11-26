package PasswordValidation;

public class Login {
	        String userName;
	        String Password;
	        
	        
			public Login(String userName, String password) {
				super();
				this.userName = userName;
				Password = password;
			}
	        //check Password or username
			void ValidatePassword() throws InvalidUsernameException,WeakPasswordException,PasswordCriteriaException {
				
				if(userName.isEmpty()) {
					throw new InvalidUsernameException();
				}
				
				if(Password.length() < 8) {
					throw new WeakPasswordException();
					
				}
			   
			   boolean hasUpper=false;
			   boolean hasDigit=false;
			   boolean hasSpecial=false;
			   
			   
			   //convert Password into Character Array and Check Individually one-by-one Character
			   for(char c:Password.toCharArray()) {
				   
				   
				   if(Character.isUpperCase(c)) {
					   hasUpper=true;
					   
				   }
				   else if(Character.isDigit(c)) {
					   hasDigit=true;
				   }else if(!Character.isLetterOrDigit(c)) {
					   hasSpecial=true;
				   }
				     
			   }
			   
			   
			   if(!(hasUpper && hasDigit && hasSpecial)) {
				   throw new PasswordCriteriaException();
			   }
			   
			   System.out.println("Login SuccessFully!.....");
			   
			}
			
	        

}
