package PasswordValidation;

public class TestLogin {
	public static void main(String[] args) {
		Login l=new Login("Yogesh","Yogesh123");
	try {	
		l.ValidatePassword();
	}catch(PasswordCriteriaException e) {
		System.out.println(e);
	}
	catch (WeakPasswordException e) {
		System.out.println(e);
	}
	catch(InvalidUsernameException e) {
		System.out.println(e);
	}
	}
         
}
