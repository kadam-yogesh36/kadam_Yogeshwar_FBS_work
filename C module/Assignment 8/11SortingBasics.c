//arr[]={3,6,2,1,8,7,4,5,3,1}
#include<stdio.h>
void BubbleSort(int arr[],int size){
	
	for(int i=0;i<size-1;i++){
		for(int j=0;j<size-1-i;j++){
			if(arr[j]>arr[j+1]){
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	
	
}//bubblesort ends here


void SelectionSort(int arr[],int size){
	for(int i=0;i<size-1;i++){
		int minpos=i;
		for(int j=i+1;j<size;j++){
			if(arr[minpos]>arr[j]){
				minpos=j;
			}
		}
		//swap
		int temp=arr[minpos];
		arr[minpos]=arr[i];
		arr[i]=temp;
	}
	
}

void printArr(int arr[],int size){
	for(int i=0;i<size;i++){
		printf("%d ",arr[i]);
	}
}

void main(){
	int arr[]={3,6,2,1,8,7,4,5,3,1};
	int size=sizeof(arr)/sizeof(int);
	SelectionSort(arr,size);
//	BubbleSort(arr,size);
	printArr(arr,size);
	
	
	
	
}//main ends 