package DoublyLinked_List;

import java.util.Scanner;

public class MenuDrivenDLL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    DoublyLinkedList dll = new DoublyLinkedList();
	    int choice, data, pos;

	    do {
	        System.out.println("\n--- Doubly Linked List Menu ---");
	        System.out.println("1. Insert at Beginning");
	        System.out.println("2. Insert at End");
	        System.out.println("3. Insert at Position");
	        System.out.println("4. Delete from Beginning");
	        System.out.println("5. Delete from End");
	        System.out.println("6. Delete from Position"); // New option
	        System.out.println("7. Display");
	        System.out.println("8. Check if Empty");
	        System.out.println("9. Size of List"); // New option
	        System.out.println("10. Get By Position");
	        System.out.println("0. Exit");
	        System.out.print("Enter choice: ");
	        choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.print("Enter data: ");
	                data = sc.nextInt();
	                dll.insertAtBeginning(data);
	                break;

	            case 2:
	                System.out.print("Enter data: ");
	                data = sc.nextInt();
	                dll.insertAtEnd(data);
	                break;

	            case 3: // Insert at position
	                System.out.print("Enter data: ");
	                data = sc.nextInt();
	                System.out.print("Enter position: ");
	                pos = sc.nextInt();
	                dll.insertAt(data, pos);
	                break;

	            case 4:
	                dll.deleteFromBeginning();
	                break;

	            case 5:
	                dll.deleteFromEnd();
	                break;

	            case 6: // Delete from position
	                System.out.print("Enter position: ");
	                pos = sc.nextInt();
	                dll.deleteFromPosition(pos);
	                break;
	            case 7:
	                dll.display();
	                break;

	            case 8:
	                System.out.println(dll.isEmpty() ? "List is Empty" : "List is NOT Empty");
	                break;

	            case 9: // Size
	                System.out.println("Size of list: " + dll.size);
	                break;
	            case 10:
	            	System.out.println("Enter Position:");
	            	pos=sc.nextInt();
	            	dll.getElement(pos);
	            	break;

	            case 0:
	                System.out.println("Exited");
	                break;

	            default:
	                System.out.println("Invalid choice");
	        }
	    } while (choice != 0);

	    sc.close();
	}
}
