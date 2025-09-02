//4. Find odd and even among the numbers
#include<stdio.h>
void GetEvenOdd(int arr[],int );
void main(){
		int arr[10];
	int size=sizeof(arr)/sizeof(int);
	
	printf("Enter elements of Array:");
	for(int i=0;i<size;i++){
		scanf("%d",&arr[i]);
	} 
	printf("Array Displays:\n");
	for(int i=0;i<size;i++){
	
		printf("%d\t",arr[i]);
	}printf("\n");
	
	GetEvenOdd(arr,size);
	
}//main ends here

void GetEvenOdd(int arr[],int size){
	for(int i=0;i<size;i++){
		if(arr[i]%2==0)
		printf("arr[%d] = %d is Even Number\n",i,arr[i]);
	}
	printf("\n\n");
	for(int i=0;i<size;i++){
			if(arr[i]%2!=0)
			printf("arr[%d] = %d is odd Number\n",i,arr[i]);
	}
}
	
	
	
	
	