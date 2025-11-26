package Hotel_Room_Booking;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Booking {
	  Customer customer; //has a relationship
	  Room room;       // Has a Relationship
	  String checkInDateTime;
	  String checkOutDateTime;
	  public Booking(Customer customer, Room room) {
		super();
		this.customer = customer;
		this.room = room;
		 // Format: 12-01-2025 10:45 PM
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        this.checkInDateTime = LocalDateTime.now().format(format);

        this.checkOutDateTime = LocalDateTime.now()
                .plusDays(room.days)
                .format(format);
	  }
	  
	  
	  
	  
	  public Customer getCustomer() {
		return customer;
	}




	  public void setCustomer(Customer customer) {
		  this.customer = customer;
	  }




	  public Room getRoom() {
		  return room;
	  }




	  public void setRoom(Room room) {
		  this.room = room;
	  }




	  public String getCheckInDateTime() {
		  return checkInDateTime;
	  }




	  public void setCheckInDateTime(String checkInDateTime) {
		  this.checkInDateTime = checkInDateTime;
	  }




	  public String getCheckOutDateTime() {
		  return checkOutDateTime;
	  }




	  public void setCheckOutDateTime(String checkOutDateTime) {
		  this.checkOutDateTime = checkOutDateTime;
	  }




	  public void printBookingDetails() {
	        System.out.println("----- Booking Details -----");
	        customer.printCustomer();

	        System.out.println("Check-in: " + checkInDateTime);
	        System.out.println("Check-out: " + checkOutDateTime);
	        System.out.println();

	        room.printRoomDetails();
	    }
	  
	  
	  
	  

}//class booking ends here


