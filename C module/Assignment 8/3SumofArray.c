//3. Find sum of all numbers
#include<stdio.h>
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
	
	int sum=0;
	for(int i=0;i<size;i++){
		sum=sum+arr[i];
	}
	printf("Sum of all elements in  the given array: %d",sum);
}