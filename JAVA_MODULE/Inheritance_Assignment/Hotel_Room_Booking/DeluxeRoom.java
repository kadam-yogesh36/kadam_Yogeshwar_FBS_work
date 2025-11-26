package Hotel_Room_Booking;

public class DeluxeRoom extends Room{
	                  double acCharge;
	                  double wifiFee;
	                  
	                  
					  public DeluxeRoom() {
						super();
						this.acCharge = 500;
						this.wifiFee = 100;
						
					}
					  public DeluxeRoom(int rommNo, double basePrice, int days,double acCharge, double wifiFee) {
						super(rommNo, basePrice, days);
						this.acCharge = acCharge;
						this.wifiFee = wifiFee;
					  }
					 
					  public double getAcCharge() {
						  return acCharge;
					  }
					  public void setAcCharge(double acCharge) {
						  this.acCharge = acCharge;
					  }
					  public double getWifiFee() {
						  return wifiFee;
					  }
					  public void setWifiFee(double wifiFee) {
						  this.wifiFee = wifiFee;
					  }
					  
					  double calculateBill() {
						  double roomCost=basePrice * days;
						  
						  return roomCost + acCharge + wifiFee;
					  }
	                  

}//class DeluxeRoom ends here


