#include<stdio.h>
void main(){
	
	for(int k=10;k<=15;k++){
	int no=k;
	printf("%d=",k);
	for(int i=1;i<=no;i++){
		if(no%i==0){
			printf("%d ",i);
		}
	}printf("\n");
	}
	
	}
