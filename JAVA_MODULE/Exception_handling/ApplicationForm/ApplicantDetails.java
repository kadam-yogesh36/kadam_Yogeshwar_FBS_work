package ApplicationForm;



public class ApplicantDetails {
	     String name;
	     String email;
	     int  age;
	     int percentage;
	     
	     
		 public ApplicantDetails(String name, String email, int age, int percentage) {
			super();
			this.name = name;
			this.email = email;
			this.age = age;
			this.percentage = percentage;
		 }
	     
		 
		 void validateDetails() throws InvalidEmailException,NotEligibleException,AgeLimitExceededException,InvalidPercentageException {
			  
			 if (!email.contains("@")) {
				 throw new InvalidEmailException();
				 
			 }
			 
			 if(age<18) {
				 throw new NotEligibleException();
			 }
			 
			 if(age>35) {
				 throw new AgeLimitExceededException();
			 }
			 
			 if(percentage <0 || percentage >100) {
				 throw new InvalidPercentageException();
			 }
			 
			 System.out.println("Form Submitted Successfully!........");
			
		 }
}


