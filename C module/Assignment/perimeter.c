//Write a C program to input the length and width of a rectangle and find its perimeter.
#include<stdio.h>
void main (){
	float len,wid,perimeter;
	printf("Enter the Length of the rectangle:");
	scanf("%f",&len);
		printf("Enter the Width  of the rectangle:");
	scanf("%f",&wid);
	
	perimeter=2*(len+wid);
	printf("The perimeter is: %f",perimeter);
	
}