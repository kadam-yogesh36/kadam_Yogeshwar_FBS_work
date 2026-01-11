package Ds_04_bubbleSort;

import java.util.Scanner;

public class SelectionSort {
	
	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			int min=arr[i];
			int min_idx=i;
			for (int j = i+1; j < arr.length; j++) {
				if(min>arr[j]) {
					min=arr[j];
					min_idx=j;
					
				}
				
			}
			arr[min_idx]=arr[i];
			arr[i]=min;
			
		}
		
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
		selectionSort(arr);
		System.out.println("After Sorting:");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		
		
	}
}
