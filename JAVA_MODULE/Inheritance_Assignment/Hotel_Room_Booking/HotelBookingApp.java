package Hotel_Room_Booking;




public class HotelBookingApp {
	public static void main(String[] args) {
		// Customer
	    Customer c1 = new Customer("Rahul Sharma", "9876543210");

	   
	    Room room = new SuiteRoom(501, 5000, 6, 2000, 3000);

	    // Booking
	    Booking b1 = new Booking(c1, room);

	    b1.printBookingDetails();
	    
	}   
	}
    
    


