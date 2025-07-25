// Write a C program to convert given minutes into hours and remaining minutes. 
#include<stdio.h>
void main(){
	int min;
	printf("Enter the minutes:");
	scanf("%d",&min);
	int hours=min/60;
	int minutes=min%60;
printf(" %d :Hours",hours);
printf(" %d :Minutes ",minutes);
	
	
}