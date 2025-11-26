package Hotel_Room_Booking;

public class Customer {
		String customerName;
		String  contact;
		
		
		
		
		public Customer() {
			super();
			this.customerName = "Yogesh";
			this.contact = "9309524170";
		}
		public Customer(String customerName, String contact) {
			super();
			this.customerName = customerName;
			this.contact = contact;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		
		
		  public void printCustomer() {
	        System.out.println("Customer Name: "+customerName);
	        System.out.println("Contact: +91"+contact);
	    }
		
		
		

}
//class customer ends here

