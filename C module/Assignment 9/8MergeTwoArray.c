//8. Merge two arrays

#include<stdio.h>
void MergeTwoArray(int arr[],int brr[],int crr[],int ,int ,int );
void main(){
	int arr[5],brr[5],crr[10];
	int s1=sizeof(arr)/sizeof(int);
	int s2=sizeof(brr)/sizeof(int);
	int s3=sizeof(crr)/sizeof(int);
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
	printf("\b ]\n");

    MergeTwoArray(arr,brr,crr,s1,s2,s3);
    
	
	
}//main ends here

void MergeTwoArray(int arr[],int brr[],int crr[],int s1,int s2,int s3){
		
	int i,j;
	for(i=0;i<s1;i++){
		crr[i]=arr[i];
	
	}
	for( j=0;j<s2;j++){
		crr[i+j]=brr[j];
		
	}
	
	printf("Merged array: \n");
	printf("Crr : [");
    for (i = 0; i < s3; i++) {
        printf(" %d,", crr[i]);
    }
  printf("\b ]\n");	
}