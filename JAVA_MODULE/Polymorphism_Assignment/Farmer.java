
public class Farmer {
        int farmer_id;
        String Farmer_Name;
        double landArea;
        String landLocation;
        double annualIncome;
        int noOfEquipment;
        
        
        
        
        
		public Farmer() { // default constructor
			super();
			this.farmer_id = 524;
			this.Farmer_Name = "Default name";
			this.landArea = 506;
			this.landLocation = "Default location";
			this.annualIncome = 5552;
			this.noOfEquipment = 54;
		}
		public Farmer(int farmer_id, String farmer_Name, double landArea, String lasLocation, double annualLocation,
				int noOfEquipment) { // parameterized constructor
			super();
			this.farmer_id = farmer_id;
			Farmer_Name = farmer_Name;
			this.landArea = landArea;
			this.landLocation = lasLocation;
			this.annualIncome = annualLocation;
			this.noOfEquipment = noOfEquipment;
		
		}
		
		// setters and getters
		public int getFarmer_id() {
			return farmer_id;
		}
		public void setFarmer_id(int farmer_id) {
			this.farmer_id = farmer_id;
		}
		public String getFarmer_Name() {
			return Farmer_Name;
		}
		public void setFarmer_Name(String farmer_Name) {
			Farmer_Name = farmer_Name;
		}
		public double getLandArea() {
			return landArea;
		}
		public void setLandArea(double landArea) {
			this.landArea = landArea;
		}
		public String getLasLocation() {
			return landLocation;
		}
		public void setLasLocation(String lasLocation) {
			this.landLocation = lasLocation;
		}
		public double getAnnualLocation() {
			return annualIncome;
		}
		public void setAnnualLocation(double annualLocation) {
			this.annualIncome= annualLocation;
		}
		public int getNoOfEquipment() {
			return noOfEquipment;
		}
		public void setNoOfEquipment(int noOfEquipment) {
			this.noOfEquipment = noOfEquipment;
		}
                   //Subsidy Function
                void calSubsidy(){
                   System.out.println("Subsidy Recieved.......");
              }
                      
        void display() {
		 System.out.println("Farmer ID: " + farmer_id);
	        System.out.println("Farmer Name: " + Farmer_Name);
	        System.out.println("Land Area (in acres): " + landArea);
	        System.out.println("Land Location: " + landLocation);
	        System.out.println("Annual Income: " + annualIncome);
	        System.out.println("Number of Equipment: " + noOfEquipment);
	        
        }
		
        
}// class Farmer ends here

class DairyFarmer extends Farmer{
	     int noOfCattles;
	     int milkProduceAmount;
	     int dairylicenceno;
	     
	     
	     
		 public DairyFarmer() { // Default constructor
			super();
			this.noOfCattles = 5;
			this.milkProduceAmount = 54;
			this.dairylicenceno = 15485;
		}
		 public DairyFarmer(int farmer_id, String farmer_Name, double landArea, String lasLocation, double annualLocation,
					int noOfEquipment,int noOfCattles, int milkProduceAmount, int dairylicenceno) { // parameterized constructor
			super(farmer_id,farmer_Name,landArea,lasLocation,annualLocation,noOfEquipment);
			this.noOfCattles = noOfCattles;
			this.milkProduceAmount = milkProduceAmount;
			this.dairylicenceno = dairylicenceno;
		}
		// setters and getters
		 public int getNoOfCattles() {
			 return noOfCattles;
		 }
		 public void setNoOfCattles(int noOfCattles) {
			 this.noOfCattles = noOfCattles;
		 }
		 public int getMilkProduceAmount() {
			 return milkProduceAmount;
		 }
		 public void setMilkProduceAmount(int milkProduceAmount) {
			 this.milkProduceAmount = milkProduceAmount;
		 }
		 public int getDairylicenceno() {
			 return dairylicenceno;
		 }
		 public void setDairylicenceno(int dairylicenceno) {
			 this.dairylicenceno = dairylicenceno;
		 }



                     //Subsidy Function
                void calSubsidy(){
                   System.out.println(" DairyFarmer Subsidy Recieved Basis of Cattels.......");
              }

		// Display function
		 void display() {
			 super.display();
		        System.out.println("Number of Cattles: " + noOfCattles);
		        System.out.println("Milk Produced (in liters): " + milkProduceAmount);
		        System.out.println("Dairy License Number: " + dairylicenceno);
		    }
	     
	     
}// class Dairy ends here

class PoultryFarmer extends Farmer{
	      String p_name;
	      int noOfChickens;
	      int shedCapacity;
	      int eggsProducePerDay;
	      
	      
	      
	      
	      
		  public PoultryFarmer() { // default constructor
			super();
			this.p_name = "Default name";
			this.noOfChickens = 5;
			this.shedCapacity = 545555;
			this.eggsProducePerDay = 45555;
		}
		  public PoultryFarmer(int farmer_id, String farmer_Name, double landArea, String lasLocation, double annualLocation,
					int noOfEquipment,String p_name, int noOfChickens, int shedCapacity, int eggsProducePerDay) { // parameterized constructor
			  super(farmer_id,farmer_Name,landArea,lasLocation,annualLocation,noOfEquipment);
			this.p_name = p_name;
			this.noOfChickens = noOfChickens;
			this.shedCapacity = shedCapacity;
			this.eggsProducePerDay = eggsProducePerDay;
		}
		// setters and getters
		  public String getP_name() {
			  return p_name;
		  }
		  public void setP_name(String p_name) {
			  this.p_name = p_name;
		  }
		  public int getNoOfChickens() {
			  return noOfChickens;
		  }
		  public void setNoOfChickens(int noOfChickens) {
			  this.noOfChickens = noOfChickens;
		  }
		  public int getShedCapacity() {
			  return shedCapacity;
		  }
		  public void setShedCapacity(int shedCapacity) {
			  this.shedCapacity = shedCapacity;
		  }
		  public int getEggsProducePerDay() {
			  return eggsProducePerDay;
		  }
		  public void setEggsProducePerDay(int eggsProducePerDay) {
			  this.eggsProducePerDay = eggsProducePerDay;
		  }

         //Subsidy Function
                void calSubsidy(){
                   System.out.println(" DairyFarmer Subsidy Recieved Basis of Chikens.......");
              }

		// Display function
		  void display() {
			  super.display();
		        System.out.println("Poultry Farm Name: " + p_name);
		        System.out.println("Number of Chickens: " + noOfChickens);
		        System.out.println("Shed Capacity: " + shedCapacity);
		        System.out.println("Eggs Produced Per Day: " + eggsProducePerDay);
		    }

	      
	      
	
}// poultry class ends here

class OrganicFaremer extends Farmer{
	       int Org_id;
	       String cropType;
	       boolean fertilizerUsed;
	       
	       
	       
	       
	       
		   public OrganicFaremer() {
			super();
			Org_id = 45;
			this.cropType = "Default type";
			this.fertilizerUsed = true;
		}
		   public OrganicFaremer(int farmer_id, String farmer_Name, double landArea, String lasLocation, double annualLocation,
					int noOfEquipment,int org_id, String cropType, boolean fertilizerUsed) {
			   super(farmer_id,farmer_Name,landArea,lasLocation,annualLocation,noOfEquipment);
			Org_id = org_id;
			this.cropType = cropType;
			this.fertilizerUsed = fertilizerUsed;
		}
		   public int getOrg_id() {
			   return Org_id;
		   }
		   public void setOrg_id(int org_id) {
			   Org_id = org_id;
		   }
		   public String getCropType() {
			   return cropType;
		   }
		   public void setCropType(String cropType) {
			   this.cropType = cropType;
		   }
		   public boolean isFertilizerUsed() {
			   return fertilizerUsed;
		   }
		   public void setFertilizerUsed(boolean fertilizerUsed) {
			   this.fertilizerUsed = fertilizerUsed;
		   }  
                       //Subsidy Function
                void calSubsidy(){
                   System.out.println(" DairyFarmer Subsidy Recieved Basis of CropType.......");
              }

		// Display function
		    void display() {
		    	super.display();
		        System.out.println("Organization ID: " + Org_id);
		        System.out.println("Crop Type: " + cropType);
		        System.out.println("Fertilizer Used: " + fertilizerUsed);
		    }
	
}// class organic ends here

class  RegisterFarmer{
	public static void main1(String[] args) {
		DairyFarmer farmer1 = new DairyFarmer(101, "Yogeshwar Kadam", 10.5, "Pune", 500000.0, 5, 20, 150, 12345);
         farmer1.display();
         System.out.println("\n\n");
         PoultryFarmer pf1 = new PoultryFarmer(102, "Rahul Sharma", 8.0, "Nagpur", 300000.0, 4, "Layer Farm", 50, 60, 120);
           pf1.display();
           System.out.println("\n\n");
           OrganicFaremer of1 = new OrganicFaremer(103, "Sita Patil", 12.0, "Solapur", 400000.0, 6, 501, "Wheat", true);
                of1.display();
           
	}

     public static void main(String[] args){

                     Farmer f1;
                      f1=new  DairyFarmer();
                        f1.calSubsidy();
                       f1=new PoultryFarmer();
                       f1.calSubsidy();
                       f1= new OrganicFaremer();
                            f1.calSubsidy();
                        
}
}


