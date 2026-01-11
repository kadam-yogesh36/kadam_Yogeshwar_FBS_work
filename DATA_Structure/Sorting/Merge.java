package Ds_06_MergeSort;

import java.util.Arrays;

public class Merge {

	public static void mergeSort(int[] arr, int start, int end) {
		if (start <end) {
			int mid = (start + end) / 2;

			mergeSort(arr, start, mid); //recursive function call
			mergeSort(arr, mid + 1, end);//recursive function call
			combineArray(arr, start, mid, end); //call Combine array function
		}

	}

	public static void combineArray(int[] arr, int start, int mid, int end) {

		int i = start;
		int j = mid + 1;
		int k = 0;

		int[] n_arr = new int[end - start + 1];// create new array

		while (i <= mid && j <= end) {
			if (arr[i] < arr[j]) {
				n_arr[k++] = arr[i];
				i++;
			} else {
				n_arr[k++] = arr[j];
				j++;
			}
		}

		while (i <= mid) { // add remaining element from array one
			n_arr[k++] = arr[i];
			i++;
		}

		while (j <= end) { // add remaining element from array two
			n_arr[k++] = arr[j];
			j++;
		}
		int y =start;

		for (int l = 0; l < n_arr.length; l++) { //add element in original array 
			arr[y++] = n_arr[l];
		}

	}

}

class SortArray {
	public static void main(String[] args) {
		int[] arr = { 9,10,7,20};
		Merge.mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
