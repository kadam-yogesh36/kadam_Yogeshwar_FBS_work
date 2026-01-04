
package Ds_08_Stack;

import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter size of Stack");
	  int size=sc.nextInt();
	  Stack obj=new Stack(size);
	  
	  int choice;
	  do {
		  System.out.println("1.Push");
		  System.out.println("2.Pop");
		  System.out.println("3.Peek");
		  System.out.println("0.Exit...");
		  System.out.println("Enter Choice");
		   choice=sc.nextInt();
		  switch(choice) {
		  
		  case 1:
			  System.out.println("Enter Element");
			  int ele=sc.nextInt();
			  
			  obj.push(ele);
			  break;
		  case 2:
			  System.out.println("Popped Element : "+obj.pop());
			  break;
		  case 3:
			  System.out.println("Peeked Element: "+obj.peek());
		   
		  }
		
	} while (choice !=0);
}
}
