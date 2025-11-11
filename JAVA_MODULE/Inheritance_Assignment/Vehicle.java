
 class Vehicle {
	   String brand;
	   String model;
	   String reg_Number;
	   String fuelType;
	    double mileage;
	    double price;
	    
	    
	    Vehicle() { //parameter constructor
			
			this.brand = "default brand";
			this.model = "default model";
			this.reg_Number = "MH 26 AW XXXX";
			this.fuelType = "Petrol";
			this.mileage = 20.50;
			this.price = 9000;
		}
	    
		 Vehicle(String brand, String model, String reg_Number, String fuelType, double mileage, double price) { //parameter constructor
			
			this.brand = brand;
			this.model = model;
			this.reg_Number = reg_Number;
			this.fuelType = fuelType;
			this.mileage = mileage;
			this.price = price;
		}
		 String getBrand() {
			return brand;
		}
		 void setBrand(String brand) {
			this.brand = brand;
		}
		 String getModel() {
			return model;
		}
		 void setModel(String model) {
			this.model = model;
		}
		 String getReg_Number() {
			return reg_Number;
		}
		 void setReg_Number(String reg_Number) {
			this.reg_Number = reg_Number;
		}
		 String getFuelType() {
			return fuelType;
		}
		 void setFuelType(String fuelType) {
			this.fuelType = fuelType;
		}
		 double getMileage() {
			return mileage;
		}
		 void setMileage(double mileage) {
			this.mileage = mileage;
		}
		 double getPrice() {
			return price;
		}
		 void setPrice(double price) {
			this.price = price;
		}
	    
		  void display() {
			  System.out.println("Brand is : "+this.brand);
			  System.out.println("Model is : "+this.model);
			  System.out.println("Registration Number is : " +this.reg_Number);
			  System.out.println("FuelType is : "+this.fuelType);
			  System.out.println("Mileage is : "+this.mileage);
			  System.out.println("Price : "+this.price);
			  
		  }
	    

}//class vehicle ends here
 
class Bike extends Vehicle{
	
	    boolean hasABS;
	    String bikeType;
	    String riderMode;
	    boolean bluetoothConnectivity;
	    
	    public Bike() { //default Constructor
			super();
			this.hasABS = true;
			this.bikeType = "Sport";
			this.riderMode = "Track Mode";
			this.bluetoothConnectivity = true;
		}
	    
	    
		 public Bike(String brand, String model, String reg_Number, String fuelType, double mileage, double price,boolean hasABS, String bikeType, String riderMode, boolean bluetoothConnectivity) { //parameter Constructor
			super(brand,model,reg_Number,fuelType,mileage,price);
			this.hasABS = hasABS;
			this.bikeType = bikeType;
			this.riderMode = riderMode;
			this.bluetoothConnectivity = bluetoothConnectivity;
		}
		 boolean isHasABS() {
			return hasABS;
		}
		 void setHasABS(boolean hasABS) {
			this.hasABS = hasABS;
		}
		 String getBikeType() {
			return bikeType;
		}
		 void setBikeType(String bikeType) {
			this.bikeType = bikeType;
		}
		 String getRiderMode() {
			return riderMode;
		}
		 void setRiderMode(String riderMode) {
			this.riderMode = riderMode;
		}
		 boolean isBluetoothConnectivity() {
			return bluetoothConnectivity;
		}
		 void setBluetoothConnectivity(boolean bluetoothConnectivity) {
			this.bluetoothConnectivity = bluetoothConnectivity;
		}
		 void display() {
			 super.display();
			 System.out.println("Has ABS : "+this.hasABS);
			 System.out.println("Bike Type : "+this.bikeType);
			 System.out.println("Rider Mode: "+this.riderMode);
			 System.out.println("BluetoothConnectivity available or Not: "+this.bluetoothConnectivity);
		 }
	    
	    
}//bike class ends here

class Bus extends Vehicle{
	     boolean hasAC;
	     String busType;
	     double luggageCapacity;
	     
	     
		  public Bus() {
			super();
			this.hasAC = false;
			this.busType = "Sleeper";
			this.luggageCapacity = 500;
		}
		  public Bus(String brand, String model, String reg_Number, String fuelType, double mileage, double price,boolean hasAC, String busType, double luggageCapacity) {
			  super(brand,model,reg_Number,fuelType,mileage,price);
			this.hasAC = hasAC;
			this.busType = busType;
			this.luggageCapacity = luggageCapacity;
		}
		  boolean isHasAC() {
			 return hasAC;
		 }
		  void setHasAC(boolean hasAC) {
			 this.hasAC = hasAC;
		 }
		  String getBusType() {
			 return busType;
		 }
		  void setBusType(String busType) {
			 this.busType = busType;
		 }
		  double getLuggageCapacity() {
			 return luggageCapacity;
		 }
		  void setLuggageCapacity(double luggageCapacity) {
			 this.luggageCapacity = luggageCapacity;
		 }
		  
		  void display() {
			  super.display();
			  System.out.println("Has Ac: "+this.hasAC);
			  System.out.println("Bus Type :"+this.busType);
			  System.out.println("luggageCapacity :"+this.luggageCapacity);
		  }
	     
	     
}// class bus ends here

class Car extends Vehicle{
	
	           int noOfDoors;
	           String transMissionType;
	           boolean hasSunroof;
	           int airBagCount;
	           
	           
	           
			 public Car() {
				super();
				this.noOfDoors = 4;
				this.transMissionType = "Manual";
				this.hasSunroof = false;
				this.airBagCount = 3;
			}
			 Car(String brand, String model, String reg_Number, String fuelType, double mileage, double price,int noOfDoors, String transMissionType, boolean hasSunroof, int airBagCount) {
			    super(brand,model,reg_Number,fuelType,mileage,price);
				this.noOfDoors = noOfDoors;
				this.transMissionType = transMissionType;
				this.hasSunroof = hasSunroof;
				this.airBagCount = airBagCount;
			}
				int getNoOfDoors() {
				   return noOfDoors;
			   }
			    void setNoOfDoors(int noOfDoors) {
				   this.noOfDoors = noOfDoors;
			   }
			    String getTransMissionType() {
				   return transMissionType;
			   }
			    void setTransMissionType(String transMissionType) {
				   this.transMissionType = transMissionType;
			   }
			    boolean isHasSunroof() {
				   return hasSunroof;
			   }
			    void setHasSunroof(boolean hasSunroof) {
				   this.hasSunroof = hasSunroof;
			   }
			    int getAirBagCount() {
				   return airBagCount;
			   }
			    void setAirBagCount(int airBagCount) {
				   this.airBagCount = airBagCount;
			   }
	           
			    void display() {
			    	super.display();
			    	System.out.println("No Of Doors : "+this.noOfDoors);
			    	System.out.println("TransMission Type: "+this.transMissionType);
			    	System.out.println("Has SunRoof: "+this.hasSunroof);
			      	System.out.println("Total AirBags : "+this.airBagCount);
			    }
	           
	           
	
}//class car ends here

class RegisterVehicle{
	public static void main(String[] args) {
		 Bike b1=new Bike();
		 b1.display();
		 System.out.println("\n\n");
		 Bike b2=new Bike("Honda","ShineCB","MH 26 AW 4575","Petrol",55,105000,false,"Commuter Bike","Eco",false);
		 b2.display();
		 System.out.println("\n\n");
		 
		 Bus bs1=new Bus();
		 bs1.display();
		 System.out.println("\n\n");
		 Bus bs2=new Bus("Eicher","10150MK","MH 02 CF 5424","diesel",30,2545858,false,"Seating",1500);
		 bs2.display();
		 System.out.println("\n\n");
		 
		 Car c1=new Car();
		 c1.display();
		 System.out.println("\n\n");
		 Car c2=new Car("Toyota","Camry","21 BH X 4578","Petrol",25,45200000,4,"Automatic",true,6);
		 c2.display(); 
		 
	}
}
