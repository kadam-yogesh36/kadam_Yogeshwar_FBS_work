package Ds_05_InsertionSort;

import java.util.Scanner;

public class InsertionSort {
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
		insertionSort(arr);
		System.out.println("before Sorting:");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		
		
	}
	
	static void insertionSort(int[] arr) {
		
		for (int i = 1; i < arr.length; i++) {
			int x=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>x) {
				
					arr[j+1]=arr[j];
					j--;
				
				
			}
			arr[j+1]=x;
			
		}
	}

}
