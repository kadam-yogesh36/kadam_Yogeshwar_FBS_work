 //10. Sort the array.
#include<stdio.h>
void  main(){
	int arr[6];
	int size=sizeof(arr)/sizeof(int);
	
	printf("Enter elements of Array:");
	for(int i=0;i<size;i++){
		scanf("%d",&arr[i]);
	} 

		printf("Arr : [");
	for(int i=0;i<size;i++){
	
		printf(" %d,",arr[i]);
	}
		printf("\b ]");
		printf("\n");
		int temp,i,j;
		for( i=0;i<size-1;i++){
			for(j=0;j<size-i-1;j++){
			
	 	if(arr[j]>arr[j+1]){
		 
			temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}
		}
		
	}
	
	for (i=0;i<size;i++){
		printf("%d ",arr[i]);
	}
		
		
		
		
		
}