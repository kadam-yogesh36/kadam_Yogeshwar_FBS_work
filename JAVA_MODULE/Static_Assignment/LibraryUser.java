import java.util.Scanner;

class LibraryUser{
              //instance variables
                String name;
                int daysLate;
              // static variable
                static double finePerDay;
         
             static {
                 finePerDay=50.55;
             
               } // static block ends here

               LibraryUser(){ // default constructor
                     
                        this.name="Ramdas";
                        this.daysLate=15;
                  }
 
                LibraryUser(String name ,int days){ // parameterized constructor
                     
                        this.name=name;
                        this.daysLate=days;
                  }

               // setters
                 void setName(String name ){
                      this.name=name;
                     }
                  void setDaysLate(int days){
                        this.daysLate=days;
                      }

                 //static method setfineperday

                static void setFinePerDay(double rs){
                          finePerDay=rs;

                     }

                   //getters
                    
                String getName(){
                     return this.name;
                    }
                  int getDaysLate(){
                      return this.daysLate;

                    }

                double calculateFine(){
                     
                   return this.daysLate * finePerDay;
                    }


                // display method


                void display(){
                  System.out.println("\n==================Library Management=================");
                    System.out.println("User Name: "+this.name);
                     System.out.println("Late Days : "+this.daysLate);
                      System.out.println("Fine Per Day: "+finePerDay);
                      System.out.println("Fine Amount:"+ this.calculateFine());
                   }

}// libraruuser class ends here

 class TestLibraryUser{
        public static void main(String [] x){

             Scanner sc= new Scanner(System.in);
              System.out.println("--------------------------This is Libraray Account Handling System -------------------------------");
               System.out.println("Enter and Set fine per day: ");
             
             LibraryUser.setFinePerDay(sc.nextDouble());
              System.out.println("Enter the  Number of Users you can handle");
               int size=sc.nextInt();
             

           LibraryUser[]  lrr=new LibraryUser[size];// array reference created
               for(int i=0;i<lrr.length;i++){
                  lrr[i]=new LibraryUser();
                  System.out.println("-------------Enter Details of User"+ (i+1)+"------------------------");
                         sc.nextLine();
                    System.out.println("Enter User Name :");
                    lrr[i].setName(sc.nextLine());
                    System.out.println("Enter how many Days Late :");
                      lrr[i].setDaysLate(sc.nextInt());
                }

             for(int i=0;i<lrr.length;i++){
                lrr[i].display();
               }


}// main ends here

}// TestLibraryUser ends here

           


           
            

                  
               
     
            
 


                       
                     

             
                    