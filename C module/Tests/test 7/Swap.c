#include<stdio.h>
int* Exchangepos(int arr[],int ,int );
void main(){
	int arr[7]={11,23,30,4,21,45,50};
	      
	      
	int* res=Exchangepos(arr,3,5);
  for(int i=0;i<7;i++){
  	printf("%d ",res[i]);
  }
}//main ends here

int* Exchangepos(int arr[],int x,int y){
	
	for(int i=0;i<7;i++){
			int temp=arr[x-1];
			arr[x-1]=arr[y-1];
			arr[y-1]=temp;
		}
	
	return arr;
	
}