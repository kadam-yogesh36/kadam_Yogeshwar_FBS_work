//Write a C program to input five numbers and find their average. 
#include<stdio.h>
void main(){
	
	int n1,n2,n3,n4,n5;
	printf("Enter number:");
	scanf("%d\n %d\n %d\n %d\n %d",&n1,&n2,&n3,&n4,&n5);
	int sum =n1+n2+n3+n4+n5;
   float avg=sum/5;
	printf("Avg of 5 numbers %.2f",avg);
}