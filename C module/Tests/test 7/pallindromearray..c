#include<stdio.h>
int Checkpallindrome(int arr[],int );
void main(){
	int arr[]={1,2,1,4,8};
	int size=sizeof(arr)/sizeof(int);
	      int res=Checkpallindrome(arr,size);
	      if(res==1)
	      printf("Array is Pallindrome");
	      else
	       printf("Array is Not  Pallindrome");
  }
//main ends here
int Checkpallindrome(int arr[],int size){
	int flag=0;
	for(int i=0,j=size-1;i<=j;i++,j--){
		if(arr[i]!=arr[j]){
	        flag=1;
	        return 0;
	        break;
	    
		}
	}
	return 1;

	
}