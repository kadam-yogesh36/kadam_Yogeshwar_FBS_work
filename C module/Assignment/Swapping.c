// Write a C program to swap two numbers using a temporary third variable. 
#include<stdio.h>
void main(){
	int a=10,b=20,temp;
	temp=a;
	a=b;
	b=temp;
	printf("A is%d\n B is %d",a,b);
	
	
}