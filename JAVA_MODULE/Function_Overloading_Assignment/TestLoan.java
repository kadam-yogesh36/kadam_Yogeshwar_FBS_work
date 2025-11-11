class Student{
             
           int rollno;
           String name;
           double percentage;

        Student(){  // default constructor 
          this.rollno=111021;
          this.name="Yogesh";
           this.percentage=75;

        } //end constructor
           
  }  // class Student Ends here

class Employee{
       
            int e_id;
            String name;
            double  ann_salary;
   
            Employee(int id,String name,double salary){  //parameterized constructor called
             this.e_id=id;
             this.name=name;
             this.ann_salary=salary;

        } //end constructor


  } // class Employee ends here


class Bank{

       void approveLoan(Student s){

           if(s.percentage > 80){

            System.out.println("Approved loan Amount is : 200000");

           }
           else if(s.percentage > 60 && s.percentage <=80){

            System.out.println("Approved loan Amount is : 100000");

           }
           else if(s.percentage > 40 && s.percentage <=60){

            System.out.println("Approved loan Amount is :  50000");

           }
           else {
            System.out.println("No Loan Approved");

           }

      } //approveLoan ends here

      void approveLoan(Employee e){

           if(e.ann_salary > 1200000){
            System.out.println("Approved loan Amount is :  700000");
           }
           else if(e.ann_salary > 1000000 && e.ann_salary <=1200000 ){
            System.out.println("Approved loan Amount is :  600000");
           }
           else if(e.ann_salary > 600000 && e.ann_salary <=1000000 ){
            System.out.println("Approved loan Amount is :  500000");
           }
           else if(e.ann_salary > 400000 && e.ann_salary <=600000 ){
            System.out.println("Approved loan Amount is :  400000");
           }
           else {
            System.out.println("NO Loan Approved");
           }

     } //functins approveloan ends here

} //class bank ends here




class TestLoan{

    public static void main(String [] x){
       
              Student s=new Student();
              Employee e=new Employee(202511,"Shubham",200000);
              Bank b=new Bank();

              b.approveLoan(s);
              b.approveLoan(e);
               

          } //main ends here

}//TestLoan ends here


               






           





    

              
          