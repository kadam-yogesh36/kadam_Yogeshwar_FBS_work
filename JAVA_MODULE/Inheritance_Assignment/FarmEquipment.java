
 class FarmEquipment {
	     String name;
	     boolean isWorking;
	     double price;
	     
	     

		 FarmEquipment() {  // Default constructor
	 		
				this.name = "Default name";
				this.isWorking = true;
				this.price=450000;
				
			}
	     
	     
	     
		   FarmEquipment(String name, boolean isWorking,double price) { // parameterized constructor
			   
		
			this.name = name;
			this.isWorking = isWorking;
			this.price=price;
		}
	     
	      double getPrice() {
			return price;
		}
		  void setPrice(double price) {
			 this.price = price;
		 }
		  String getName() {
			 return name;
		 }
		  void setName(String name) {
			 this.name = name;
		 }
		  boolean isWorking() {
			 return isWorking;
		 }
		  void setWorking(boolean isWorking) {
			 this.isWorking = isWorking;
		 }
	     
		  void display() {
			  System.out.println("Equipment Name: "+this.name);
			  System.out.println("Is Working :"+this.isWorking);
			  System.out.println("Price :"+this.price);
			  
			  
		  }

}// class equipment ends here
 
 class Tractor extends FarmEquipment{
	    int HorsePower;
	    String fuelType;
	    
	    
	    
	    
		   Tractor() {// default constructor
			super();
			HorsePower = 45;
			this.fuelType = "diesel";
		}
		  Tractor(String name, boolean isWorking,double price,int horsePower, String fuelType) {
			super(name,isWorking,price);
			HorsePower = horsePower;
			this.fuelType = fuelType;
		}
		 int getHorsePower() {
			return HorsePower;
		}
		 void setHorsePower(int horsePower) {
			HorsePower = horsePower;
		}
		 String getFuelType() {
			return fuelType;
		}
		 void setFuelType(String fuelType) {
			this.fuelType = fuelType;
		}
		 
		 
		 void display() {
			 super.display();
			 System.out.println("Horse Power :"+this.HorsePower);
			 System.out.println("FuelType:"+this.fuelType);
		 }
	    
 }//tractor class ends here
 
 class WaterPump extends FarmEquipment{
	     double flowRateliterPermin;
	     
	     WaterPump() {
			  super();
			this.flowRateliterPermin = 45.8;
		}
	     

		  WaterPump(String name, boolean isWorking,double price,double flowRateliterPermin) {
			  super(name,isWorking,price);
			this.flowRateliterPermin = flowRateliterPermin;
		}

		  double getFlowRateliterPermin() {
			 return flowRateliterPermin;
		 }

		  void setFlowRateliterPermin(double flowRateliterPermin) {
			 this.flowRateliterPermin = flowRateliterPermin;
		 }
	     
		  void display() {
			  super.display();
			  System.out.println("Flow Rate per minute :"+this.flowRateliterPermin);
		  }
	     
	              
	 
 }//WaterPump class ends here
 
 class Harvestor extends FarmEquipment{
	      double cuttingWidth;

	      
		     Harvestor() {
			super();
			this.cuttingWidth = 4.5;
		}

			Harvestor(String name, boolean isWorking,double price,double cuttingWidth) {
		    super(name,isWorking,price);
			this.cuttingWidth = cuttingWidth;
		}

		   double getCuttingWidth() {
			  return cuttingWidth;
		  }

		   void setCuttingWidth(double cuttingWidth) {
			  this.cuttingWidth = cuttingWidth;
		  }
	      
		   void display() {
			   super.display();
			   System.out.println("Cutting Width in Meters:"+this.cuttingWidth);
		   }
	      
 }// Harvester class Ends here
 
 class RegisterEquipment{
	 public static void main(String[] args) {
		Tractor t1=new Tractor();
		t1.display();
		System.out.println("\n\n");
		Tractor t2=new Tractor("mahindra ",true,2545555,55,"diesel");
		t2.display();
		System.out.println("\n\n");
		
		Harvestor h1=new Harvestor();
		h1.display();
		System.out.println("\n\n");
		Harvestor h2=new Harvestor("Sonalika",true,458575,4.5);
		h2.display();
		
		System.out.println("\n\n");
		
		WaterPump w1=new  WaterPump();
		w1.display();
		System.out.println("\n\n");
		WaterPump w2=new WaterPump("Texmo",true,25000,5.6);
		w2.display();
	}
 }
