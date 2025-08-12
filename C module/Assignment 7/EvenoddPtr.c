//Write a program to check whether a number is even or odd.
#include<stdio.h>
void CheckEvenodd( int*);
void main(){
	
	int Num;
	printf("Enter the number: ");
	scanf("%d",&Num);
     CheckEvenodd(&Num);
}//main end

void CheckEvenodd( int* no){
	if(*no%2==0){
  	printf(" %d is Even Number",*no);
  }
  else{
  		printf(" %d is Odd Number",*no);
  }
}