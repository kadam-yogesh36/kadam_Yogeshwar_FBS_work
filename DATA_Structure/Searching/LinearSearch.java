package Ds_02_linearsearch;

import java.util.LinkedList;
import java.util.Scanner;

public class LinearSearch {

	static int linearSearch(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return i;
			}

		}
		return -1;
	}

	
	//main 
public static void main(String[] args) {
	
            
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Size Of Array:");
	int size=sc.nextInt();//Scan Array Size
	
	int [] arr=new int[size];//declare array of reference
	//scanning elements from user 
	System.out.println("Enter Elements in array :");
	for (int i = 0; i < arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	
	//display array elements 
	for(int i:arr) {
		System.out.print(i+" ");
	}
	
	System.out.println();
	
	System.out.println("Enter Elelment You want to find: ");
	int x=sc.nextInt();//element for search
	
	
	int result=linearSearch(arr, x); //call function
      
	 if(result!= -1) {
		 System.out.println(x+" Found At "+result +"index");
		
	 }
	 else
		 System.out.println(x+ " is Not Found");
	
	}

}
