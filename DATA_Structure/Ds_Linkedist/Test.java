package Ds_Linkedist;

import java.util.Scanner;

public class Test {									
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.Insert At End");
			System.out.println("2.Insert At Begining");
			System.out.println("3.Insert at position");
			System.out.println("4.Display");
			System.out.println("5.delete at postion");
			System.out.println("6.Delete From Front..");
			System.out.println("7.Delete From End..");
			System.out.println("8.Existing.");
			
			
			
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Element");
				l.insertAtEnd(sc.nextInt());
				break;
			case 2:
				System.out.println("Enter Element");
				l.insertAtBegining(sc.nextInt());
				break;
			case 3:
				
				System.out.println("Enter Position");
				int pos=sc.nextInt();
				System.out.println("Enter Element");
				int ele=sc.nextInt();
				l.insertAt(pos ,ele);
				break;
				
			case 4:
				l.display();
				break;
			case 5:
				System.out.println("enter Position");
				l.deletePosition(sc.nextInt());
				break;
			case 6:
				l.deleteFromFront();
				break;
			case 7:
				l.deleteFromEnd();
				break;
				
			case 8:
				System.out.println("Exiting!..");
				return;
			}
		}
	}

}
