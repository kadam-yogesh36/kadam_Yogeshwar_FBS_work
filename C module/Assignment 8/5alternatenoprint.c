//5. Print alternate elements in array.
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
	
	for(int i=0;i<size;i=i+2){
		printf("arr[%d] = %d\n",i,arr[i]);
	}
	
	
}