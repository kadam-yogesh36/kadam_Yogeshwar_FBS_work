package Ds_03_Binarysearch;

import java.util.Scanner;

public class BinarySearching {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size Of Array:");
		int size=sc.nextInt();
		
		int arr[] =new int[size];
		System.out.println("Enter Elements:");
		
		//scan elements 
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		
		//print elements
		for(int i:arr) {
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println("Enter elemet you want to Find");
		int x=sc.nextInt();
		
		
		int result=binarySearch(arr, x);
		
		if(result!= -1) {
			System.out.println(x+" Element found at "+ result+ " index");
			
		}
		else
			System.out.println("Element Not Found!....");
		
		
		
		
		
		
		
		
		
	}
	
	
	static int binarySearch(int[] arr , int x) {
		
		int start=0;
		int end=arr.length-1;
		
		while(start <= end) {
			int mid= ( start + end ) / 2;
			
			if(arr[mid]==x) {
				return mid;
				
			}
			else if(arr[mid]> x) {
				end=mid-1;
			}
			else
				start=mid+1;
		}
		
		return -1;
		
		
	}

}
