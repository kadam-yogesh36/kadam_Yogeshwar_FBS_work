//6. Accept array and print only prime numbers of array.
#include<stdio.h>
//int isprime(int );
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
	printf("Prime Elemets are:\n");
	for(int i=0;i<size;i++){
		int flag=1;
		if(arr[i]<2){
					flag=0;
				}
			for(int j=2;j<=arr[i]-1;j++){
				
			if (arr[i]%j==0){
					flag=0;
				}
			}	if(flag==1){
				printf("%d ",arr[i]);	}
	}
	printf("\n");
	
}//main ends here

//int isprime(int num){
//	
//	if(num<2)
//	return 0;
//for(int i=2;i<num;i++){
//	if(num%i==0)
//	return 0;
//	}
//	return 1;
//	
//
//}