package Ds_04_bubbleSort;

import java.util.Scanner;

public class BubbleSort {

	static void bubbleSort(int[] arr) {

		int itration = 0;
		int swapcount = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean sorted = true;

			itration++;

			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapcount++;
					sorted = false;

				}

			}
			if (sorted) {
				break;
			}

		}

		System.out.println("Iteration :" + itration);
		System.out.println("SwapCount:" + swapcount);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of Array:");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter Elements:");

		// scan elements
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}

		// print elements
		System.out.println("before Sorting:");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		bubbleSort(arr);

		System.out.println("After Sorting:");
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
