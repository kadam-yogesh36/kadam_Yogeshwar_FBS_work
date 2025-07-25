//Write a C program to input the base and height of a triangle and calculate its area. 
#include<stdio.h>
void main (){
	float height,base,area;
	printf("Enter the base of triangle:");
	scanf("%f",&base);
		printf("Enter the height of triangle:");
	scanf("%f",&height);
	area=0.5*base*height;
	printf("Area od triangle is : %f",area);
	
}