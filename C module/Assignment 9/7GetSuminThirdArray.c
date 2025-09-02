//7. Take two array and add sum in third array
//Example
//arr[5]= {1,2, 3, 4,5}
//brr[5]={10,20,30, 40, 50}
//crr[5]={11,22,33,44,55}
#include<stdio.h>
void GetSum(int arr[],int brr[], int crr[],int s1 ,int s2,int s3);
void main(){
		int arr[5],brr[5],crr[5];
	int s1=5;
	int s2=5;
	int s3=5;
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
	
	GetSum(arr,brr,crr,s1,s2,s3);
	
}//main ends here

void GetSum(int arr[],int brr[],int crr[],int s1,int s2,int s3){
		printf("Sum of (Arr + Brr) store in Crr:\n\n");
			printf("Crr : [");
	for(int i=0;i<s3;i++){
		crr[i]=arr[i]+brr[i];
	printf("%d ",crr[i]);
	}
	printf("\b ]");


}
