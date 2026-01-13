package Stack_Using_DoublyLinked_List;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Stack stack=new Stack();
		 Scanner sc = new Scanner(System.in);
	        int choice, value;

	        do {
	            System.out.println("\n----- STACK USING DOUBLY LINKED LIST -----");
	            System.out.println("1. Push");
	            System.out.println("2. Pop");
	            System.out.println("3. Peek");
	            System.out.println("4. Is Empty");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");

	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter element to push: ");
	                    value = sc.nextInt();
	                    stack.push(value);
	                    System.out.println(value + " pushed into stack");
	                    break;

	                case 2:
	                    value = stack.pop();
	                    if (value != -1)
	                        System.out.println("Popped element: " + value);
	                    break;

	                case 3:
	                    value = stack.peek();
	                    if (value != -1)
	                        System.out.println("Top element: " + value);
	                    break;

	                case 4:
	                    if (stack.isEmpty())
	                        System.out.println("Stack is Empty");
	                    else
	                        System.out.println("Stack is NOT Empty");
	                    break;

	                case 5:
	                    System.out.println("Exiting program...");
	                    break;

	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }

	        } while (choice != 5);

	        sc.close();

	}

}
