
public class Payment {
            int payment_ID;
            double transaction_Amount;
            String payment_Date;
            String payer_Name;
        
            
			public Payment() {
				
				this.payment_ID = 00000001;
				this.transaction_Amount = 0.00;
				this.payment_Date = "12-jun-2025";
				this.payer_Name = "Default Name";
			}
			public Payment(int payment_ID, double transaction_Amount, String payment_Date, String payer_Name) {
				
				this.payment_ID = payment_ID;
				this.transaction_Amount = transaction_Amount;
				this.payment_Date = payment_Date;
				this.payer_Name = payer_Name;
			}
			public int getPayment_ID() {
				return payment_ID;
			}
			public void setPayment_ID(int payment_ID) {
				this.payment_ID = payment_ID;
			}
			public double getTransaction_Amount() {
				return transaction_Amount;
			}
			public void setTransaction_Amount(double transaction_Amount) {
				this.transaction_Amount = transaction_Amount;
			}
			public String getPayment_Date() {
				return payment_Date;
			}
			public void setPayment_Date(String payment_Date) {
				this.payment_Date = payment_Date;
			}
			public String getPayer_Name() {
				return payer_Name;
			}
			public void setPayer_Name(String payer_Name) {
				this.payer_Name = payer_Name;
			}
            
            
			void display() {
			    System.out.println("Payment ID: " + this.payment_ID);
			    System.out.println("Transaction Amount: " + this.transaction_Amount);
			    System.out.println("Payment Date: " + this.payment_Date);
			    System.out.println("Payer Name: " + this.payer_Name);
			}

            
}// Payment class ends here

class CreditCardPayment extends Payment{
	           int cardNumber;
	           int cvv;
	           String cardTpye;
	           
	             
	           
			   public CreditCardPayment() {
				super();
				this.cardNumber = 247548555;
				this.cvv = 545;
				this.cardTpye = "Platinum";
			}
			   public CreditCardPayment(int payment_ID, double transaction_Amount, String payment_Date, String payer_Name,int cardNumber, int cvv, String cardTpye) {
				super(payment_ID,transaction_Amount,payment_Date,payer_Name);
				this.cardNumber = cardNumber;
				this.cvv = cvv;
				this.cardTpye = cardTpye;
			}
			   public int getCardNumber() {
				   return cardNumber;
			   }
			   public void setCardNumber(int cardNumber) {
				   this.cardNumber = cardNumber;
			   }
			   public int getCvv() {
				   return cvv;
			   }
			   public void setCvv(int cvv) {
				   this.cvv = cvv;
			   }
			   public String getCardTpye() {
				   return cardTpye;
			   }
			   public void setCardTpye(String cardTpye) {
				   this.cardTpye = cardTpye;
			   }
	           
			   void display() {
				   super.display();
				    System.out.println("Card Number: " + this.cardNumber);
				    System.out.println("CVV: " + this.cvv);
				    System.out.println("Card Type: " + this.cardTpye);
				}

}//creditCard class ends here

class UPIPayment extends Payment{
	     int upi_ID;
	     String appName;
	     int utrNumber;
	     
	     
	     
		 public UPIPayment() {
			super();
			this.upi_ID = 457852452;
			this.appName = "Phone Pay";
			this.utrNumber = 45785452;
		}
		 public UPIPayment(int payment_ID, double transaction_Amount, String payment_Date, String payer_Name,int upi_ID, String appName, int utrNumber) {
				super(payment_ID,transaction_Amount,payment_Date,payer_Name);
			this.upi_ID = upi_ID;
			this.appName = appName;
			this.utrNumber = utrNumber;
		}
		 public int getUpi_ID() {
			 return upi_ID;
		 }
		 public void setUpi_ID(int upi_ID) {
			 this.upi_ID = upi_ID;
		 }
		 public String getAppName() {
			 return appName;
		 }
		 public void setAppName(String appName) {
			 this.appName = appName;
		 }
		 public int getUtrNumber() {
			 return utrNumber;
		 }
		 public void setUtrNumber(int utrNumber) {
			 this.utrNumber = utrNumber;
		 }
	     
		 void display() {
			 super.display();
			    System.out.println("UPI ID: " + this.upi_ID);
			    System.out.println("App Name: " + this.appName);
			    System.out.println("UTR Number: " + this.utrNumber);
			}
		 

}// UPI Payment classs Ends here

class CashPayment extends Payment{
	              int recieptNo;
	              String cashierName;
	              String currencyType;
	              
	              
	              
				  public CashPayment() {
					super();
					this.recieptNo = 457886662;
					this.cashierName = "Default Name";
					this.currencyType = "INR";
				}
				  public CashPayment(int payment_ID, double transaction_Amount, String payment_Date, String payer_Name,int recieptNo, String cashierName, String currencyType) {
						super(payment_ID,transaction_Amount,payment_Date,payer_Name);
					this.recieptNo = recieptNo;
					this.cashierName = cashierName;
					this.currencyType = currencyType;
				}
				  public int getRecieptNo() {
					  return recieptNo;
				  }
				  public void setRecieptNo(int recieptNo) {
					  this.recieptNo = recieptNo;
				  }
				  public String getCashierName() {
					  return cashierName;
				  }
				  public void setCashierName(String cashierName) {
					  this.cashierName = cashierName;
				  }
				  public String getCurrencyType() {
					  return currencyType;
				  }
				  public void setCurrencyType(String currencyType) {
					  this.currencyType = currencyType;
				  }
				  void display() {
					  super.display();
					    System.out.println("Receipt No: " + this.recieptNo);
					    System.out.println("Cashier Name: " + this.cashierName);
					    System.out.println("Currency Type: " + this.currencyType);
					}

}// CashPayment class ends here

class RegisterPayment{
	public static void main(String[] args) {
		CreditCardPayment c1 = new CreditCardPayment(101, 2500.75, "12-11-2025", "Yogeshwar", 987654321, 123, "Visa");
             c1.display();
            System.out.println("\n\n");
        UPIPayment u1 = new UPIPayment(102, 1500.50, "12-11-2025", "Yogeshwar", 987654, "Google Pay", 123456789);
            u1.display();
            System.out.println("\n\n");
        CashPayment cs1 = new CashPayment(103, 2000.00, "12-11-2025", "Yogeshwar", 501, "Ramesh", "INR");
        cs1.display();      
        
	}
}


