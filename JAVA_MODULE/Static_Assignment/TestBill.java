import java.util.Scanner;

class ElectricityBill {
   // attributes declared
   static double ratePerUnit;
   int consumer_id;
   String name;
   int unitsConsumed;

   static { // static Block

      ratePerUnit = 8;

   }

   ElectricityBill() { // default constructor

      this.consumer_id = 0;
      this.name = "Unknown Consumer";
      this.unitsConsumed = 0;

   }

   ElectricityBill(int id, String name, int t_unit) { // Parameterized constructor

      this.consumer_id = id;
      this.name = name;
      this.unitsConsumed = t_unit;

   }
   // setters
   
     static void setRateofUnit(double rate){ // static function SetrateperUnit
              ratePerUnit=rate;
           }
            

   void setConsumerId(int id) {
      this.consumer_id = id;
   }

   void setConsumerName(String name) {
      this.name = name;
   }

   void setUnitConsumed(int u_consumed) {
      this.unitsConsumed = u_consumed;
   }

   // getters

   int getConsumerId() {
      return this.consumer_id;
   }

   String getConsumerName() {
      return this.name;
   }

   int getUnitConsumed() {
      return this.unitsConsumed;

   }

   void billAmt() {
      double totalBill = this.unitsConsumed * ratePerUnit;
      System.out.print("Total Bill Amount :" + totalBill);
   }

   // Display
   void display() {
      System.out.println("\n-------------------------------------------------------");
      System.out.println("Consumer_ID : " + this.consumer_id);
      System.out.println("Consumer_Name : " + this.name);
      System.out.println("Total Units Of Consumed  : " + this.unitsConsumed);
      this.billAmt();
      System.out.println("\n-------------------------------------------------------");

   }

}// Electricity bill class ends here

class TestBill {
   public static void main(String[] x) {

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Number of Consumers:");
      int size = sc.nextInt();

      ElectricityBill[] consumers = new ElectricityBill[size];

      for (int i = 0; i < consumers.length; i++) {
         consumers[i] = new ElectricityBill();
         System.out.println("------------Enter Details of Consumer : " + (i + 1) + "---------------------------");
         System.out.print("Enter Consumer ID:");
         consumers[i].consumer_id = sc.nextInt();
         sc.nextLine();
         System.out.print("Enter Consumer Name:");
         consumers[i].name = sc.nextLine();
         System.out.print("Enter Total Consumed Units:");
         consumers[i].unitsConsumed = sc.nextInt();

      }

      for (int i = 0; i < consumers.length; i++) {
         consumers[i].display();
      }

   } // main ends here

} // TEstbill class ends here
