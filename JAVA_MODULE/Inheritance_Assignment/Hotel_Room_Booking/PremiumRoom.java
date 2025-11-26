package Hotel_Room_Booking;

public class PremiumRoom extends Room {
	 double serviceCharge;


	 public PremiumRoom() {
		super();
		this.serviceCharge = 500;
	}


	 public PremiumRoom(int rommNo, double basePrice, int days,double serviceCharge) {
		 super(rommNo, basePrice, days);
		this.serviceCharge = serviceCharge;
	 }


	 public double getServiceCharge() {
		 return serviceCharge;
	 }


	 public void setServiceCharge(double serviceCharge) {
		 this.serviceCharge = serviceCharge;
	 }
	 
	 
	 double calculateBill() {
		 
		    double roomCost=basePrice * days;
		    
		    return roomCost + serviceCharge;
		 
	 }

}
