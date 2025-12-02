/*📝 Assignment: Bollywood Movie Ticket Booking System (Menu-Driven)

Objective:
Create a Java program to simulate a Bollywood movie ticket booking system with custom exceptions. The system should allow multiple bookings, automatically calculate the total amount, and manage ticket availability.

System Details

Movies available:

3 Idiots

Dangal

Bahubali 2: The Conclusion

Kabir Singh

Chhichhore

Zindagi Na Milegi Dobara

Tanhaji

Uri: The Surgical Strike

War

Bajrangi Bhaijaan

Ticket price: ₹200 per ticket (system-managed)

Total tickets available: 50 (shared across all bookings)

User Interaction

The program should repeatedly display a menu with the available movies.

The user selects a movie (by number) and enters the number of tickets.

The system calculates the total amount automatically.

The menu continues until all tickets are sold out.

Custom Exceptions

InvalidMovieSelectionException → Thrown if the user selects a number outside the movie list.

InvalidTicketNumberException → Thrown if the number of tickets entered is ≤ 0.

TicketsSoldOutException → Thrown if the requested number of tickets exceeds remaining tickets.

Behavior

If booking is successful, display:

Booking Successful for "<Movie Name>"!
Tickets booked: <Number of Tickets>
Total amount: <Amount>


If an exception occurs, display the corresponding error message.

When all tickets are sold out, display:

Sorry! Tickets are sold out.

Additional Notes

Implement a MovieBooking class with a bookTickets() method that throws custom exceptions.

Use static fields for ticketPrice and maxAvailableTickets to manage ticket availability across all bookings.

Add a static method getRemainingTickets() to check remaining tickets internally for stopping the menu loop (not shown to the user).*/
package com.MovieTicket;

import java.util.Scanner;

public class MovieTicketBooking {
	    
	      static String MovieName="Dangal";
	      static double price=200;
	      static int totalTicketAvailable=50;
	      
	      
	      
		  public String getMovieName() {
			  return MovieName;
		  }
		  public void setMovieName(String movieName) {
			  MovieName = movieName;
		  }
		  public static double getPrice() {
			  return price;
		  }
		  public static void setPrice(double price) {
			  MovieTicketBooking.price = price;
		  }
		  public static int getTotalTicketAvailable() {
			  return totalTicketAvailable;
		  }
		  public static void setTotalTicketAvailable(int totalTicketAvailable) {
			  MovieTicketBooking.totalTicketAvailable = totalTicketAvailable;
		  }
	      
		  
		    void bookTicket(int ticketCount) throws InvalidTicketNumberException, TicketsSoldOutException {
			  
			   if(ticketCount<=0) {
				   throw new InvalidTicketNumberException();
			   }
			   
			   if(totalTicketAvailable <ticketCount) {
				   throw new TicketsSoldOutException();
			   }
			   
			   totalTicketAvailable-=ticketCount;
			   double Amount=ticketCount*price;
			   
			   
			   System.out.println("Ticket Booked Successfully!.....");
			   
			   System.out.println("\n===================PVR INOX====================");
			   System.out.println("Movie Name: " +MovieName);
			   System.out.println("Number Of Seats : "+ticketCount);
			   System.out.println("Total Amount : "+Amount);
			   System.out.println("=================================================");
			   
			   
		  }
		    
		    
	      
	      
	      
	      
	      
	      
	

}

class TestTicketbooking{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		MovieTicketBooking m1=new MovieTicketBooking();
		
		while(true) {
			System.out.println("===================Menu Card======================");
			System.out.println("1.Book Ticket: ");
			System.out.println("0.Exit : ");
			int ch=sc.nextInt();
			if(ch==1) {
			while(true) {
				System.out.println("====Ticket Booking Portal======");
				System.out.println("Enter Number Of Tickets: ");
				int mt=sc.nextInt();
				try {
					m1.bookTicket(mt);
					break;
				} catch (InvalidTicketNumberException | TicketsSoldOutException e) {
					System.out.println(e);
				}
				
			}
			
			}
			if(ch==0) {
				return;
			}
		}
		
	
	}
}
