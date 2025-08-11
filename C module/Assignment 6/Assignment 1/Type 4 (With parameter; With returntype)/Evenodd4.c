//Write a program to check whether a number is even or odd.
#include<stdio.h>
int Evenodd(int );
void main(){
	
	int Num;
	printf("Enter the number: ");
	
  scanf("%d",&Num);
if (Evenodd(Num)==1)
printf("Even number");
else
printf("Odd Number");  
  
  
  
}
int Evenodd(int Num){
	if(Num%2==0){
  	return 1;
  }
  else{
  return 0;
  }
}