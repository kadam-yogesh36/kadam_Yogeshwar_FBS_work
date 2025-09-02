//3. Find sum of all numbers
#include<stdio.h>
int  GetSum(int arr[], int );
void main(){
	int arr[6];
	int size=sizeof(arr)/sizeof(int);
	
	printf("Enter elements of Array:");
	for(int i=0;i<size;i++){
		scanf("%d",&arr[i]);
	} 
	printf("Array Displays:\n");
	for(int i=0;i<size;i++){
	
		printf("%d\t",arr[i]);
	}printf("\n");
	
  printf("Sum of all elements in  the given array: %d",GetSum(arr,size));
}//main ends here

int  GetSum(int arr[], int size){
		int sum=0;
	for(int i=0;i<size;i++){
		sum=sum+arr[i];
	}
	return sum;
}