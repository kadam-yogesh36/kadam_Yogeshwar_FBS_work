package Ds_Stack_ps;

import java.util.Scanner;

public class Notepad {
	public static void main(String[] args) {
		TextEditor<String> te = new TextEditor<String>(20);
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1.Write");
			System.out.println("2.Undo");
			System.out.println("3.Display");
			System.out.println("0.Exit");
			System.out.println("Enter Choice:");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter Data:");
				sc.nextLine();
				String str = sc.nextLine();
				te.write(str);
				break;
			case 2:
				te.undo();
				break;
			case 3:
				te.display();
				System.out.println();
				break;
			case 4:
				return;

			}

		}

	}
}
