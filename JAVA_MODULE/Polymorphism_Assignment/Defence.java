
 class Defence {
	 String nameOfHead;
	 int noOfTroops;
	 double budget;
	 int noOfDept;
	 String headquarter;
	 String countryName;
	 int manPowerCount;
	 int noOfMissionPerformed;
	 int noOfBase;
	 int noOfCasultie;
	 
	 
	    Defence() { //Default Constructor
		
		this.nameOfHead = "Default name";
		this.noOfTroops = 0;
		this.budget = 0;
		this.noOfDept = 0;
		this.headquarter = "Default headquarters";
		this.countryName = "Default country";
		this.manPowerCount = 0;
		this.noOfMissionPerformed = 0;
		this.noOfBase = 0;
		this.noOfCasultie = 0;
	}
	   Defence(String nameOfHead, int noOfTroops, double budget, int noOfDept, String headquarter,
			String countryName, int manPowerCount, int noOfMissionPerformed, int noOfBase, int noOfCasultie) { // parameter Constructor
		
		this.nameOfHead = nameOfHead;
		this.noOfTroops = noOfTroops;
		this.budget = budget;
		this.noOfDept = noOfDept;
		this.headquarter = headquarter;
		this.countryName = countryName;
		this.manPowerCount = manPowerCount;
		this.noOfMissionPerformed = noOfMissionPerformed;
		this.noOfBase = noOfBase;
		this.noOfCasultie = noOfCasultie;
	}
	  String getNameOfHead() {
		 return nameOfHead;
	 }
	  void setNameOfHead(String nameOfHead) {
		 this.nameOfHead = nameOfHead;
	 }
	  int getNoOfTroops() {
		 return noOfTroops;
	 }
	  void setNoOfTroops(int noOfTroops) {
		 this.noOfTroops = noOfTroops;
	 }
	  double getBudget() {
		 return budget;
	 }
	  void setBudget(double budget) {
		 this.budget = budget;
	 }
	  int getNoOfDept() {
		 return noOfDept;
	 }
	  void setNoOfDept(int noOfDept) {
		 this.noOfDept = noOfDept;
	 }
	  String getHeadquarter() {
		 return headquarter;
	 }
	  void setHeadquarter(String headquarter) {
		 this.headquarter = headquarter;
	 }
	  String getCountryName() {
		 return countryName;
	 }
	  void setCountryName(String countryName) {
		 this.countryName = countryName;
	 }
	  int getManPowerCount() {
		 return manPowerCount;
	 }
	  void setManPowerCount(int manPowerCount) {
		 this.manPowerCount = manPowerCount;
	 }
	  int getNoOfMissionPerformed() {
		 return noOfMissionPerformed;
	 }
	  void setNoOfMissionPerformed(int noOfMissionPerformed) {
		 this.noOfMissionPerformed = noOfMissionPerformed;
	 }
	  int getNoOfBase() {
		 return noOfBase;
	 }
	  void setNoOfBase(int noOfBase) {
		 this.noOfBase = noOfBase;
	 }
	  int getNoOfCasultie() {
		 return noOfCasultie;
	 }
	  void setNoOfCasultie(int noOfCasultie) {
		 this.noOfCasultie = noOfCasultie;
	 }
	    // Attack function
            void attack(){
                  System.out.println("Attack On Enemies.....");

            }
	  void display() {
	        System.out.println("---- Defence Information ----");
	        System.out.println("Head of Defence: " + nameOfHead);
	        System.out.println("Number of Troops: " + noOfTroops);
	        System.out.println("Budget: $" + budget);
	        System.out.println("Number of Departments: " + noOfDept);
	        System.out.println("Headquarter: " + headquarter);
	        System.out.println("Country: " + countryName);
	        System.out.println("Man Power Count: " + manPowerCount);
	        System.out.println("Missions Performed: " + noOfMissionPerformed);
	        System.out.println("Number of Bases: " + noOfBase);
	        System.out.println("Number of Casualties: " + noOfCasultie);
	    }

}// class defence ends here
 
class Army extends Defence{
	int noOfTanks;
	int noOfGuns;
	int noOfGranades;
	int noOfBatallian;
	
	
	
	
	   Army() {
		super();
		this.noOfTanks = 0;
		this.noOfGuns = 0;
		this.noOfGranades = 0;
		this.noOfBatallian = 0;
	}
	  Army(String nameOfHead, int noOfTroops, double budget, int noOfDept, String headquarter,
				String countryName, int manPowerCount, int noOfMissionPerformed, int noOfBase, int noOfCasultie,int noOfTanks, int noOfGuns, int noOfGranades, int noOfBatallian) {
		super(nameOfHead,noOfTroops,budget,noOfDept,headquarter,countryName,manPowerCount,noOfMissionPerformed,noOfBase,noOfCasultie);
		this.noOfTanks = noOfTanks;
		this.noOfGuns = noOfGuns;
		this.noOfGranades = noOfGranades;
		this.noOfBatallian = noOfBatallian;
	}
	 int getNoOfTanks() {
		return noOfTanks;
	}
	 void setNoOfTanks(int noOfTanks) {
		this.noOfTanks = noOfTanks;
	}
	 int getNoOfGuns() {
		return noOfGuns;
	}
	 void setNoOfGuns(int noOfGuns) {
		this.noOfGuns = noOfGuns;
	}
	 int getNoOfGranades() {
		return noOfGranades;
	}
	 void setNoOfGranades(int noOfGranades) {
		this.noOfGranades = noOfGranades;
	}
	 int getNoOfBatallian() {
		return noOfBatallian;
	}
	 void setNoOfBatallian(int noOfBatallian) {
		this.noOfBatallian = noOfBatallian;
	}
              
               // Attack function
            void attack(){
                  System.out.println("Army ka using guns,tanks Attack On Enemies.....");

            }

	 void display() {
	        super.display();  // call base class display
	        
	        System.out.println("Number of Tanks: " + noOfTanks);
	        System.out.println("Number of Guns: " + noOfGuns);
	        System.out.println("Number of Granades: " + noOfGranades);
	        System.out.println("Number of Batallians: " + noOfBatallian);
	    }
	
	
}//cass Army ends here

class Navy extends Defence{
	int noOfships;
	int noOfSubmarines;
	int noOfTorpedos;
	
	
	
	
	   Navy() {
		super();
		this.noOfships = 0;
		this.noOfSubmarines = 0;
		this.noOfTorpedos = 0;
	}
	  Navy(String nameOfHead, int noOfTroops, double budget, int noOfDept, String headquarter,
				String countryName, int manPowerCount, int noOfMissionPerformed, int noOfBase, int noOfCasultie,int noOfships, int noOfSubmarines, int noOfTorpedos) {
		  super(nameOfHead,noOfTroops,budget,noOfDept,headquarter,countryName,manPowerCount,noOfMissionPerformed,noOfBase,noOfCasultie);
		this.noOfships = noOfships;
		this.noOfSubmarines = noOfSubmarines;
		this.noOfTorpedos = noOfTorpedos;
	}
	 int getNoOfships() {
		return noOfships;
	}
	 void setNoOfships(int noOfships) {
		this.noOfships = noOfships;
	}
	 int getNoOfSubmarines() {
		return noOfSubmarines;
	}
	 void setNoOfSubmarines(int noOfSubmarines) {
		this.noOfSubmarines = noOfSubmarines;
	}
	 int getNoOfTorpedos() {
		return noOfTorpedos;
	}
	 void setNoOfTorpedos(int noOfTorpedos) {
		this.noOfTorpedos = noOfTorpedos;
	}


                 // Attack function
            void attack(){
                  System.out.println("Navy ka using torpidoes Attack On Enemies.....");

            }

	    void display() {
	        super.display();  // call base class display
	      
	        System.out.println("Number of Ships: " + noOfships);
	        System.out.println("Number of Submarines: " + noOfSubmarines);
	        System.out.println("Number of Torpedos: " + noOfTorpedos);
	    }

	
}// class navy ends here
class AirForce extends Defence{
	int noOfmissiles;
	int noOfaircraft;
	
	
	
	
	   AirForce() {
		super();
		this.noOfmissiles = 0;
		this.noOfaircraft = 0;
	}
	  AirForce(String nameOfHead, int noOfTroops, double budget, int noOfDept, String headquarter,
				String countryName, int manPowerCount, int noOfMissionPerformed, int noOfBase, int noOfCasultie,int noOfmissiles, int noOfaircraft) {
		  super(nameOfHead,noOfTroops,budget,noOfDept,headquarter,countryName,manPowerCount,noOfMissionPerformed,noOfBase,noOfCasultie);
		this.noOfmissiles = noOfmissiles;
		this.noOfaircraft = noOfaircraft;
	}
	 int getNoOfmissiles() {
		return noOfmissiles;
	}
	 void setNoOfmissiles(int noOfmissiles) {
		this.noOfmissiles = noOfmissiles;
	}
	 int getNoOfaircraft() {
		return noOfaircraft;
	}
	 void setNoOfaircraft(int noOfaircraft) {
		this.noOfaircraft = noOfaircraft;
	}

           
               // Attack function
            void attack(){
                  System.out.println("Airforce ka using missiles,jets,drones,Attack On Enemies.....");

            }

	 void display() {
	        super.display();  // call base class display
	        
	        System.out.println("Number of Missiles: " + this.noOfmissiles);
	        System.out.println("Number of Aircraft: " + this.noOfaircraft);
	        
	 }
}// AirForce class ends here

class RegisterDefence{
	public static void main1(String[] args) {
		
		
		
	
		AirForce af1 = new AirForce("Air Chief Marshal Vivek Ram Chaudhari", 140000, 1800000000.0, 4, "New Delhi", "India", 150000, 80, 40, 100, 500, 1200);
        af1.display();
        System.out.println("\n\n");
        Navy n1 = new Navy("Admiral Karambir Singh", 67000, 1500000000.0, 4, "New Delhi", "India", 80000, 60, 30, 200, 200, 20, 500);
      n1.display();
      System.out.println("\n\n");
      Army a1 = new Army("General Bipin Rawat", 1500000, 5000000000.0, 4, "New Delhi", "India", 2000000, 120, 50, 500, 5000, 10000, 20000, 100);
       a1.display();
       
	}

public static void main(String[] args){

       Defence d1;
      d1=new Army();
       d1.attack();
      System.out.println("\n");
       d1=new Navy();
         d1.attack();
       System.out.println("\n");
     d1=new AirForce();
     d1.attack();

}


}


