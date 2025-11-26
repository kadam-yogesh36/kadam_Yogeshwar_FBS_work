package Hotel_Room_Booking;

public abstract class Room {
            int  roomNo;
            double basePrice;
            int days;
            
            
            
			public Room() {
				super();
				this.roomNo = 202;
				this.basePrice = 5000;
				this.days = 4;
				
			}
			public Room(int rommNo, double basePrice, int days) {
				super();
				this.roomNo = rommNo;
				this.basePrice = basePrice;
				this.days = days;
			}
			public int getRommNo() {
				return roomNo;
			}
			public void setRommNo(int rommNo) {
				this.roomNo = rommNo;
			}
			public double getBasePrice() {
				return basePrice;
			}
			public void setBasePrice(double basePrice) {
				this.basePrice = basePrice;
			}
			public int getDays() {
				return days;
			}
			public void setDays(int days) {
				this.days = days;
			}
            
			
			//abstract method calculateBill
			
			abstract double calculateBill();
			
			 public void printRoomDetails() {
			        System.out.println("Room Number: " + roomNo);
			        System.out.println("Base Price per Night: " + basePrice);
			        System.out.println("Days: " + days);
			        System.out.println("Total Room Bill: " + calculateBill());
			    }
            
}//class room ends here



