package polyMorphism_13_11;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

class BankAccount{

        int acc_number;
        String accHolderName;
        double currentBalance;
       




      BankAccount() {   // default Constructor
     
          this.acc_number=1012142;
          this.accHolderName="kadam Yogesh";
          this.currentBalance=0;
         
       }

       BankAccount(int acno,String name,double currentbal) {   // default Constructor
     
          this.acc_number=acno;
          this.accHolderName=name;
          this.currentBalance=currentbal;
          
       }

     void setAcNumber(int ac_no){
        this.acc_number=ac_no;
        }

     void setHolderName(String name){
      this.accHolderName=name;
        }
     void setCurrentbal(double c_bal){
          this.currentBalance=c_bal;

        }

      

     int getAcNumber(){
        return acc_number;
       }

     String getAccHolderName(){
        return accHolderName;
        }

     double getCurrentbal(){
         return currentBalance;
        }
     
   


   void display(){
        System.out.println("\nAccount Number :" + this.acc_number);
        System.out.println("Account Holder Name :" + this.accHolderName);
        System.out.println("Current Balance :" + this.currentBalance);
        

   }
       //withdraw function
       void withdraw(double amt) {
    	   System.out.println(amt+"RS "+"Withdraw Successfully.......");
    	   
       }


 
} // class BankAccount ends here

 class SavingAccount extends BankAccount{
	                 double minBal;
	                 
	                 
	                 
	                 
	                 

					 public SavingAccount( ) {
						super();
						this.minBal = 0;
					}

					 public SavingAccount(int acno,String name,double currentbal,double minBal) {
						super(acno,name,currentbal);
						this.minBal = minBal;
					}

					 public double getMinBal() {
						 return minBal;
					 }

					 public void setMinBal(double minBal) {
						 this.minBal = minBal;
					 }
					 
					 void display() {
						 super.display();
						 System.out.println("MINIMUM Balance Is :"+this.minBal);
					 }
					 
					 void withdraw(double amt) {
						    if (amt > 0 && (currentBalance - amt) >= minBal) {
						        currentBalance -= amt;
						        System.out.println(amt + " Rs Withdraw Successfully....");
						        System.out.println("Remaining Balance: " + currentBalance);
						    } else {
						        System.out.println("Transaction Failed! Minimum balance must be maintained.");
						    }
						}

				       
					 
	                 
 }//saving account ends here
 
 class CurrentAccount extends BankAccount {
	    double draftLimit;

	    public CurrentAccount() {
	        super();
	        this.draftLimit = -1500;  // overdraft limit
	    }

	    public CurrentAccount(int acno, String name, double currentbal, double draftLimit) {
	        super(acno, name, currentbal);
	        this.draftLimit = draftLimit;
	    }

	    public double getDraftLimit() {
	        return draftLimit;
	    }

	    public void setDraftLimit(double draftLimit) {
	        this.draftLimit = draftLimit;
	    }

	    void display() {
	        super.display();
	        System.out.println("Overdraft Limit: " + this.draftLimit);
	    }

	    // ✅ Correct Withdraw Logic
	    void withdraw(double amt) {
	        if (amt <= 0) {
	            System.out.println("Invalid amount!");
	            return;
	        }

	        // calculate remaining balance after withdrawal
	        double newBalance = currentBalance - amt;

	        if (newBalance >= draftLimit) {
	            currentBalance = newBalance;
	            System.out.println(amt + " Rs Withdraw Successfully.");
	            System.out.println("Updated Balance: " + currentBalance);
	        } else {
	            System.out.println("Transaction Failed! Overdraft limit exceeded.");
	        }
	    }
	} //current Account ends here

 class SalaryAccount extends BankAccount {
	                     int day;
	                     int month;
	                     int year;
	                     
	                     
	                     
	                     
						 public SalaryAccount(int acno,String name,double currentbal,int day, int month, int year) {
							 super(acno,name,currentbal);
							this.day = day;
							this.month = month;
							this.year = year;
						}
						 public SalaryAccount() {
							super();
							this.day = 14;
							this.month = 9;
							this.year = 2025;
						}
						 public int getDay() {
							 return day;
						 }
						 public void setDay(int day) {
							 this.day = day;
						 }
						 public int getMonth() {
							 return month;
						 }
						 public void setMonth(int month) {
							 this.month = month;
						 }
						 public int getYear() {
							 return year;
						 }
						 public void setYear(int year) {
							 this.year = year;
						 }
	                     
	               void display() {
	            	   super.display();
	            	   System.out.println("Last Transaction date is :"+this.day+"/"+this.month+"/"+this.year);
	               }
	                   // whithdraw function
                        void withdraw(double amt) {
			    	   
			    	     LocalDate stratDate=LocalDate.of(this.year, this.month,this.day);
			    	      LocalDate endDate = LocalDate.now();
			    	      
			    	
			    	      long monthsBetween = ChronoUnit.MONTHS.between(stratDate, endDate);

			    	      if (stratDate.plusMonths(2).isAfter(endDate)) {


			    		   
			    	   System.out.println(amt+"RS "+"Withdraw Successfully.......");
			    	   
			    	   }
			    	   else {
			    		   System.out.println("Transaction Failed!......");
			    	   }
			    	   
			       }
	               
	               
 }




class BankAccountTest{
   


public static void main(String [] x){
	
	     BankAccount b1;
	     
	     b1=new SalaryAccount();
	     b1.withdraw(5000);
	     
	     b1= new CurrentAccount();
	     b1.withdraw(2000);
	     
	     b1=new SavingAccount();
	     b1.withdraw(5000);
	    
     




}

} //class BAnkAccountTEst ends here


