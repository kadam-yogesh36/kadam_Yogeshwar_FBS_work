
 class Student {

	      int fbs_id;
	      String name;
	      int distance;
	      static int count=0;
	      
	      
	      
	      Student() { // default constructor
	    	  System.out.println("Student default constructor called");
	    		
	   		this.fbs_id = 1020;
	   		this.name = "Yogesh";
	   		this.distance = 50;
	   		  count++;
	      }
	      
	      //parameteriazed constructor
	     
		    Student(int fbs_id, String name, int distance) {
		    	 System.out.println("Student Parameterized constructor called");
			
			this.fbs_id = fbs_id;
			this.name = name;
			this.distance = distance;
			count++;
		}
		    
		    
		   int getFbs_id() {
			  return fbs_id;
		  }
		   void setFbs_id(int fbs_id) {
			  this.fbs_id = fbs_id;
		  }
		   String getName() {
			  return name;
		  }
		   void setName(String name) {
			  this.name = name;
		  }
		   int getDistance() {
			  return distance;
		  }
		   void setDistance(int distance) {
			  this.distance = distance;
		  }

           // Ststic function setter and getter
		    static int getCount() {
			   return count;
		   }


		    static void setCount(int count) {
			   Student.count = count;
		   }
		    
		     void display() {
		    	 
		    	 System.out.println("FBS ID is:" +this.fbs_id);
		    	 System.out.println("Name Is :"+this.name);
		    	 System.out.println("Distance Travelled:"+this.distance);
		     }
	      
	      
}// class Student ends here
 
 class PlacedStudent extends Student{ // step 1
	  // step 3 remove state and behavior which is available in super class
     String c_name;
     String designation;
     
     
     
     
     PlacedStudent() { // default constructor
    	 super();// step 4 a
    	 System.out.println("PlacedStudent default constructor called");
 		
 		this.c_name = "Fbs";
 		this.designation = "Developer";
 		
     }
     
     
	  PlacedStudent(int fbs_id,String name,int distance, String c_name, String designation) {  // parameterized constructor
		  super(fbs_id,name,distance); //step 4 b
		  System.out.println("PlacedStudent Para constructor called");
		
		this.c_name = c_name;
		this.designation = designation;
	}
	  
	 
	  String getC_name() {
		 return c_name;
	 }
	  void setC_name(String c_name) {
		 this.c_name = c_name;
	 }
	  String getDesignation() {
		 return designation;
	 }
	  void setDesignation(String designation) {
		 this.designation = designation;
	 }
	  void display() {
	    	 super.display(); // step 3
	    	 System.out.println("Company Name:"+this.c_name);
	    	 System.out.println("Designation:"+this.designation);
	     }
     
     
           
 }// class Placed Student Ends here
 
 
 class RegisterStudent{
	 public static void main(String [] args) {
		 
		 
		  
		  PlacedStudent ps2=new PlacedStudent();
		  ps2.display();
		  
		  PlacedStudent ps1=new PlacedStudent(102030,"Rajesh",505,
				  "Fbs","Admin");
		  System.out.println("Student ttal Count: "+Student.getCount());
		  ps1.display();
		  
		 
		 
		 
		 
	 }
 }
 


