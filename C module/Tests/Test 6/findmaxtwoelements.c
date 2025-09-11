#include<stdio.h>
void main(){
	int arr[7];
	printf("Enter the Elements:\n");
	for(int i=0;i<7;i++){
		scanf("%d",&arr[i]);
		
	}
	
	printf("Display Arr:[");
	for(int i=0;i<7;i++){
		printf("%d ",arr[i]);
		
	}
	printf("] ");
	printf("\n");
	
	
	int max=arr[0];
	for(int i=0;i<7;i++){
		if(arr[i]>max)
		max=arr[i];
	}
	printf("First Maximum element: %d\n",max);
	
	int smax=arr[0];

	for(int i=0;i<7;i++){
		if(arr[i]>smax&&arr[i]!=max)
		smax=arr[i];
	}
	printf("second Maximum element: %d",smax);
}