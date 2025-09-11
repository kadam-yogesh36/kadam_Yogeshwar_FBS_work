#include<stdio.h>
void StoreArray(int* , int  );
void FindDuplicate(int* ,int*,int );
void display(int* ,int );
void main(){
	int arr[7];
	 int brr[7];
	 
	 StoreArray(arr,7);
	 StoreArray(brr,7);
	 display(arr,7);
	 display(brr,7);
	 
	FindDuplicate(arr,brr,7);
//	 display(res,7);
	 
}//main ends here

void StoreArray(int* arr, int n ) {
	printf("Enter Elements of Array:\n");
	for(int i=0; i<n; i++) {
		scanf("%d",&arr[i]);

	}
}//store end here

void display(int* arr,int n){
	printf("Dispay:[ ");
	for(int i=0;i<n;i++){
		printf("%d ",arr[i]);
	}printf("\b ]");
	printf("\n");
}
//display ends here
void FindDuplicate(int* arr,int*brr,int n){
 	printf("Common element in two Array:\n");
 	for(int i=0;i<n;i++){
 		
 	for(int j=0;j<n;j++){
 		if(arr[i]==brr[j]){
 		printf("%d ",arr[i]);
		 }
	 }
	 }
 }
 