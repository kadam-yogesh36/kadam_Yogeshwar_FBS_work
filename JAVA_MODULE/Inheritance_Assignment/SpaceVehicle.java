
public class SpaceVehicle {
                String name;
                String launchDate;
                String fuelType;
                String missionType;
                
                
                
				public SpaceVehicle() {
					
					this.name = "Default Name";
					this.launchDate = "Default Date";
					this.fuelType = "Default Fuel";
					this.missionType = "Default Mission";
				}
				public SpaceVehicle(String name, String launchDate, String fuelType, String missionType) {
					super();
					this.name = name;
					this.launchDate = launchDate;
					this.fuelType = fuelType;
					this.missionType = missionType;
				}
				public String getName() {
					return name;
				}
				public void setName(String name) {
					this.name = name;
				}
				public String getLaunchDate() {
					return launchDate;
				}
				public void setLaunchDate(String launchDate) {
					this.launchDate = launchDate;
				}
				public String getFuelType() {
					return fuelType;
				}
				public void setFuelType(String fuelType) {
					this.fuelType = fuelType;
				}
				public String getMissionType() {
					return missionType;
				}
				public void setMissionType(String missionType) {
					this.missionType = missionType;
				}
                
				void display() {
				    System.out.println("Name: " + this.name);
				    System.out.println("Launch Date: " + this.launchDate);
				    System.out.println("Fuel Type: " + this.fuelType);
				    System.out.println("Mission Type: " + this.missionType);
				}

				
                
}//SpaceVehicle class ends here

class Satellite extends SpaceVehicle{
	            String orbitType;
	             String purpose;
	             double transmissionPower;
	             
	             
	             
	             
				 public Satellite() {
					super();
					this.orbitType = "default Type";
					this.purpose = "Default Purpose";
					this.transmissionPower = 0.00;
				}
				 public Satellite(String name, String launchDate, String fuelType, String missionType,String orbitType, String purpose, double transmissionPower) {
					super(name,launchDate,fuelType,missionType);
					this.orbitType = orbitType;
					this.purpose = purpose;
					this.transmissionPower = transmissionPower;
				}
				 public String getOrbitType() {
					 return orbitType;
				 }
				 public void setOrbitType(String orbitType) {
					 this.orbitType = orbitType;
				 }
				 public String getPurpose() {
					 return purpose;
				 }
				 public void setPurpose(String purpose) {
					 this.purpose = purpose;
				 }
				 public double getTransmissionPower() {
					 return transmissionPower;
				 }
				 public void setTransmissionPower(double transmissionPower) {
					 this.transmissionPower = transmissionPower;
				 }
				 void display() {
					 super.display();
					    System.out.println("Orbit Type: " + this.orbitType);
					    System.out.println("Purpose: " + this.purpose);
					    System.out.println("Transmission Power: " + this.transmissionPower);
					}

	             
}// Satellite Constructor Ends here

class Rover extends SpaceVehicle{
	                String terrainCapability;
	                double solarPanelSize;
	                int cameraCount;
	                
	                
					public Rover() {
						super();
						this.terrainCapability = "Default capability";
						this.solarPanelSize = 0.00;
						this.cameraCount = 0;
					}
					public Rover(String name, String launchDate, String fuelType, String missionType,String terrainCapability, double solarPanelSize, int cameraCount) {
						super(name,launchDate,fuelType,missionType);
						this.terrainCapability = terrainCapability;
						this.solarPanelSize = solarPanelSize;
						this.cameraCount = cameraCount;
					}
					public String getTerrainCapability() {
						return terrainCapability;
					}
					public void setTerrainCapability(String terrainCapability) {
						this.terrainCapability = terrainCapability;
					}
					public double getSolarPanelSize() {
						return solarPanelSize;
					}
					public void setSolarPanelSize(double solarPanelSize) {
						this.solarPanelSize = solarPanelSize;
					}
					public int getCameraCount() {
						return cameraCount;
					}
					public void setCameraCount(int cameraCount) {
						this.cameraCount = cameraCount;
					}
	                
					void display() {
						super.display();
					    System.out.println("Terrain Capability: " + this.terrainCapability);
					    System.out.println("Solar Panel Size: " + this.solarPanelSize);
					    System.out.println("Camera Count: " + this.cameraCount);
					}

	                
}// class Rover ends here

class SpaceShuttle extends SpaceVehicle{
	         int crewCapacity;
	          boolean reEntryCapability;
	          double flightHours;
	          
	          
	          
	          
	          
	          
			  public SpaceShuttle() {
				super();
				this.crewCapacity = 5;
				this.reEntryCapability = false;
				this.flightHours = 0.00;
			}
			  public SpaceShuttle(String name, String launchDate, String fuelType, String missionType,int crewCapacity, boolean reEntryCapability, double flightHours) {
				  super(name,launchDate,fuelType,missionType);
				this.crewCapacity = crewCapacity;
				this.reEntryCapability = reEntryCapability;
				this.flightHours = flightHours;
			}
			  public int getCrewCapacity() {
				  return crewCapacity;
			  }
			  public void setCrewCapacity(int crewCapacity) {
				  this.crewCapacity = crewCapacity;
			  }
			  public boolean isReEntryCapability() {
				  return reEntryCapability;
			  }
			  public void setReEntryCapability(boolean reEntryCapability) {
				  this.reEntryCapability = reEntryCapability;
			  }
			  public double getFlightHours() {
				  return flightHours;
			  }
			  public void setFlightHours(double flightHours) {
				  this.flightHours = flightHours;
			  }
	          
			  void display() {
				  super.display();
				    System.out.println("Crew Capacity: " + this.crewCapacity);
				    System.out.println("Re-entry Capability: " + this.reEntryCapability);
				    System.out.println("Flight Hours: " + this.flightHours);
				}

}// SpaceShuttle class Ends here

class RegisterSpaceVehicle{
	public static void main(String[] args) {
		Satellite s1 = new Satellite("INSAT-3D", "12-11-2025", "Liquid Fuel", "Communication", "Geostationary", "Weather Monitoring", 1500.75);
                     s1.display();
                     System.out.println("\n\n");
        Rover r1 = new Rover("Pragyan", "22-07-2023", "Solar", "Exploration", "Rocky Terrain", 2.5, 4);
                         r1.display();
                         System.out.println("\n\n");
                         
        SpaceShuttle sh1 = new SpaceShuttle("Discovery", "24-04-1990", "Liquid Hydrogen", "Research", 7, true, 1200.5);
                  sh1.display();
            
                     
	}
}
