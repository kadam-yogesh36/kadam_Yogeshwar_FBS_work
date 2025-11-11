
class Employee {
	int e_Id;
	String name;
	double basicSalary;
	
	
	

	 Employee() { // default constructor
		
		this.e_Id = 5021;
		this.name = "Shubham";
		this.basicSalary = 15000;
	}

	 Employee(int e_Id, String name, double basicSalary) { //Parameterized constructor
		super();
		this.e_Id = e_Id;
		this.name = name;
		this.basicSalary = basicSalary;
	}

	 int getE_Id() {
		return e_Id;
	}

	 void setE_Id(int e_Id) {
		this.e_Id = e_Id;
	}

	 String getName() {
		return name;
	}

	 void setName(String name) {
		this.name = name;
	}

	 double getBasicSalary() {
		return basicSalary;
	}

	 void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	 
	 void display() {
		 System.out.println("Employee ID: "+this.e_Id);
		 System.out.println("Employee Name: "+this.name);
		 System.out.println("Salary : "+this.basicSalary);
	 }

}// Employeee class ends here


class SalesManager extends Employee {
             
	      double incentives;
	      int target;
	      
	      SalesManager() {  // default constructor
				super();
				this.incentives = 1500;
				this.target = 1500000;
			}
	      
	      
	      
		   SalesManager(int id,String name,double salary,double incentives, int target) { //Parameterized constructor
			super(id,name,salary);
			this.incentives = incentives;
			this.target = target;
		}
		   double getIncentives() {
			  return incentives;
		  }
		   void setIncentives(double incentives) {
			  this.incentives = incentives;
		  }
		   int getTarget() {
			  return target;
		  }
		   void setTarget(int target) {
			  this.target = target;
		  }
		   
		   
		   void display() {
			   super.display();
		       System.out.println("Incentives is : "+this.incentives);
			  System.out.println("Target : "+this.target);
		   }
	      
	
	
}//  Sales Manager class ends here

class HR extends Employee {
	          double commission;

			  public HR() {  // default constructor
				super();
				this.commission =500;
			  }

			  public HR(int id,String name,double salary,double commission) {  //Parameterized constructor
				super(id,name,salary);
				this.commission = commission;
			  }

			   double getCommission() {
				  return commission;
			  }

			   void setCommission(double commission) {
				  this.commission = commission;
			  }
			  
			   
			   void display() {
				   super.display();
			 System.out.println("Commission :" +this.commission);
			   }
			       
	          
}// hr class ends here

class Admin extends Employee{
	
	          double allowance;
	          
	          
	          

			     Admin() { // default constructor
				super();
				this.allowance = 2500;
			}

				Admin(int id,String name,double salary,double allowance) { //parameterized constructor
				super(id,name,salary);
				this.allowance = allowance;
			}

			   double getAllowance() {
				  return allowance;
			  }

			   void setAllowance(double allowance) {
				  this.allowance = allowance;
			  }
			   
			 void display() {
				 super.display();
				 System.out.println("Allowance : "+this.allowance);
			 }      
	          
}

class RegisterEmployee{
	public static void main(String[] args) {
		 
		HR h1=new HR(1245,"Shubham",25000,5480);
		h1.display();
	}
	
}

