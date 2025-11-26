package ApplicationForm;

import java.nio.InvalidMarkException;

public class TestForm {
   public static void main(String[] args) {
	   ApplicantDetails a=new ApplicantDetails("Yogesh","yogesh2236@gmail.com",25,110);
	   
	 try {
		 a.validateDetails();
	 }
	 catch(InvalidEmailException e) {
		 System.out.println(e);
	 }
	 catch(InvalidPercentageException e) {
		 System.out.println(e);
	 }
	 catch(InvalidMarkException e) {
		 System.out.println(e);
	 }
	 catch(AgeLimitExceededException e) {
		 System.out.println(e);
		 
	 }
	 catch(NotEligibleException e) {
		 System.out.println(e);
	 }
	 
	 
}
}
