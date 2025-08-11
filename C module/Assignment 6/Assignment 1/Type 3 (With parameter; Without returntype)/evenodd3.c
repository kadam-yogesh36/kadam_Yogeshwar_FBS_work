//Write a program to check whether a number is even or odd.
#include<stdio.h>
void Evenodd (int);
void main(){
	
	
	int Num;
	printf("Enter the number: ");
	
  scanf("%d",&Num);
  
 Evenodd(Num);
}

void Evenodd(int num){
	 if(num%2==0){
  	printf("Even Number");
  }
  else{
  	printf("Odd Number");
  }
}