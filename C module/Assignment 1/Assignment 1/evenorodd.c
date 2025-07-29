//Write a program to check whether a number is even or odd.
#include<stdio.h>
void main(){
	
	int Num;
	printf("Enter the number: ");
	
  scanf("%d",&Num);
  
  if(Num%2==0){
  	printf("Even Number");
  }
  else{
  	printf("Odd Number");
  }
}