package PasswordValidation;

public class PasswordCriteriaException extends Exception {

	@Override
	public String toString() {
		return "Password must contain 1 uppercase, 1 digit, and 1 special character!......";
	}
	

}
