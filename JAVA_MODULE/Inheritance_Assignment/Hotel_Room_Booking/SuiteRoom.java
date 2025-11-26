package Hotel_Room_Booking;

public class SuiteRoom extends Room{
			double serviceCharge;
			double foodPackage;
			
			
			
		
			public SuiteRoom() {
				super();
				this.serviceCharge = 700;
				this.foodPackage = 800;
				
			}

			public SuiteRoom(int rommNo, double basePrice, int days,double serviceCharge, double foodPackage) {
				super(rommNo, basePrice, days);
				this.serviceCharge = serviceCharge;
				this.foodPackage = foodPackage;
			}
			public double getServiceCharge() {
				return serviceCharge;
			}
			public void setServiceCharge(double serviceCharge) {
				this.serviceCharge = serviceCharge;
			}
			public double getFoodPackage() {
				return foodPackage;
			}
			public void setFoodPackage(double foodPackage) {
				this.foodPackage = foodPackage;
			}
			
			double calculateBill() {
				 double roomCost=basePrice * days;
				 double total= roomCost+serviceCharge+foodPackage;
				 
				 if(days >5) {
					 
					 total -= total * 0.10; // 10% off
					 
				 }
				 return total;
			}
	
			  

}//class Suite ends here


