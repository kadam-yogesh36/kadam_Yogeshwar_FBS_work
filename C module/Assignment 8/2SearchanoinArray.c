//2. Search the given number in array.
#include<stdio.h>
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
		int i,n,found=0;
	printf("Enter the Number:");
	scanf("%d",&n);
		for( i=0;i<size;i++){
		if(arr[i]==n){
		
		printf("%d at %d index\n",n,i);
	    found=1;}
		
	}
	if(!found)
	printf("no not found");	
	

	
	
	
	
}