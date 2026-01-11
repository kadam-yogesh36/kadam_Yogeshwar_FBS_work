package Ds_07_QuickSort;

import java.util.Arrays;

public class QuickSort {
	
	public static void main(String[] args) {
		int [] arr= {10,15,8,2,45,7};
		
		
		quickSort(arr, 0, arr.length-1);
		
		System.out.println("hello");
		System.out.println(Arrays.toString(arr));
	}
	
	static int dividingPoint(int [] arr,int start ,int end) {
		
		
		int pivot=arr[start];
		int i=start+1;
		int j=end;
		
		while(i<=j) {
			
			while(i<=end && arr[i] <= pivot) {
				i++;
			}
			
			while(j>start && arr[j] > pivot) {
				j--;
			}
			
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		
		arr[start] = arr[j];
        arr[j] = pivot;
        
		return j;
		
	}
	
	
	static void quickSort(int [] arr,int start,int end) {
		
		if(start<end) {
			int d=dividingPoint(arr, start, end);
			
			quickSort(arr, start, d-1);
			quickSort(arr, d+1, end);
			
			
		}
	}

	
}
