//Write a C program to input marks of five subjects, find the total marks, and calculate 
//the percentage.
#include<stdio.h>
void main(){
	float sub1,sub2,sub3,sub4,sub5;
	float total,percentage;
	
	printf("Enter the marks of sub1 :");
	scanf("%f",&sub1);
	printf("Enter the marks of sub2 :");
	scanf("%f",&sub2);
	printf("Enter the marks of sub3 :");
	scanf("%f",&sub3);
	printf("Enter the marks of sub4 :");
	scanf("%f",&sub4);
	printf("Enter the marks of sub5 :");
	scanf("%f",&sub5);
	
	total=sub1+sub2+sub3+sub4+sub5;
	printf("Total Marks: %.2f\n",total);
	percentage=total/500*100;
	printf("The percentage is : % .2f %%",percentage );
	
	
}