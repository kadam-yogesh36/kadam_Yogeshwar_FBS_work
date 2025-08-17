//7. Take two array and add sum in third array
//Example
//arr[5]= {1,2, 3, 4,5}
//brr[5]={10,20,30, 40, 50}
//crr[5]={11,22,33,44,55}
#include<stdio.h>
void main(){
		int arr[5],brr[5],crr[5];
	int s1=sizeof(arr)/sizeof(int);
	int s2=sizeof(arr)/sizeof(int);
	int s3=sizeof(arr)/sizeof(int);
	printf("Enter elements of Arr:");
	for(int i=0;i<s1;i++){
		scanf("%d",&arr[i]);
	} 
		printf("Enter elements of brr:");
	for(int i=0;i<s2;i++){
		scanf("%d",&brr[i]);
	} 
	
	
	printf("\n");
	printf("Arr : [");
	for(int i=0;i<s1;i++){
	
		printf(" %d,",arr[i]);
	}
	printf("\b ]");
	printf("\n");
	
	printf("Brr : [");
	
	for(int i=0;i<s2;i++){
	
		printf(" %d,",brr[i]);
	}
		printf("\b ]");
		printf("\n\n");
		printf("Sum of (Arr + Brr) store in Crr:\n\n");
			printf("Crr : [");
	for(int i=0;i<s3;i++){
		crr[i]=arr[i]+brr[i];
		printf(" %d,",crr[i]);
	}
	printf("\b ]");
	
	
}
