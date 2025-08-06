#include<stdio.h>
void main(){
	
	int no;
	printf("enter the number:");
	scanf("%d",&no);
	if(no>0)
	printf("positive number");
	else if(no<0)
	printf("negative number");
	else
	printf("neutral number");
	}