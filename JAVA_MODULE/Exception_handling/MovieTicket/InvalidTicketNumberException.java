package com.MovieTicket;

public class InvalidTicketNumberException extends Exception {

	@Override
	public String toString() {
		return "Select seat At least 1";
	}
	

}
