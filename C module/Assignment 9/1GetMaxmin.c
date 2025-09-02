//1. Find minimum and maximum number in array.
#include<stdio.h>
void GetMaxMin(int arr[],int );
void main(){
	int arr[7];
	int size=sizeof(arr)/sizeof(int);
	
	printf("Enter elements of Array:");
	for(int i=0;i<size;i++){
		scanf("%d",&arr[i]);
	} 
	printf("Array Displays:\n");
	for(int i=0;i<size;i++){
	
		printf("%d\t",arr[i]);
	}printf("\n");
	
  GetMaxMin(arr,size);
	
	
}//main ends here

void GetMaxMin(int arr[],int size){
	
		int max=arr[0];
	for(int  i=0;i<size;i++){
		if(arr[i]>max)
		max=arr[i];
	}
	printf("Maximun element in the array: %d\n",max);
	
	int min=arr[0];
	for( int i=0;i<size;i++){
		if(arr[i]<min)
		min=arr[i];
	}
	printf("Minimun element in the array: %d",min);
	
	
}