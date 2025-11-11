 import java.util.*;
 class Employee{
             // declare Attributes
              String name;
              double basicSalary;
              static double companyBonusRate;

               
    // Default Constructor
    Employee() {
          this.name = "lokesh";
        this.basicSalary = 30000.0;
    }

    // Parameterized Constructor
    Employee( String name, double salary) {
      
        this.name = name;
        this.basicSalary = salary;
    }


        static{ // static block for initialize static variable
              companyBonusRate=10.5;
   
          } // Static block ends here

          // setters
          void setName(String name){
                    this.name=name;

              }

          void setbasicSalary(double b_salary){
                     this.basicSalary=b_salary;
              }
          
                // static method 
          static void setCompanyBonusRate(double com_bonusRate){
                      companyBonusRate=com_bonusRate;

                 } // Static function ends here

            // getters
          
            String getName(){
                   return this.name;
                 }

              double getBasicSalary(){
                   return this.basicSalary ;
                 }
          
            double calculateSalary(){
            return (this.basicSalary +(this.basicSalary * companyBonusRate / 100));
                 }

             void display(){
                System.out.println("\n============================Employee Salary Slip================================");
                System.out.println("Name : " + this.name);
                System.out.println("Basic Salary: " +this.basicSalary);
                System.out.println("Basic BonusRate: " +companyBonusRate);
                System.out.println("Total Salary : " + this.calculateSalary());
}



} // class Employeee Ends here

class EmployeeTest{

       public static void main(String [] x){
            
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter number of Employee: ");
                  int size=sc.nextInt();
                 
                Employee[] err=new Employee[size];  // employee Object reference created
                
                for(int i=0;i<err.length;i++){
                   
                     err[i]=new Employee(); // object craeted 
                     System.out.println("-------------Enter Details of Employee"+ (i+1)+"------------------------");
                         sc.nextLine();
                    System.out.println("Enter Employee Name :");
                    err[i].setName(sc.nextLine());
                    System.out.println("Enter Basic Salary :");
                      err[i].setbasicSalary(sc.nextDouble());

                   }
                   
                   for(int i=0;i<err.length;i++){
                        err[i].display();
                        
                     }


   } // main ends here

} // testEmployee class ends here
                        
                    



        

          


