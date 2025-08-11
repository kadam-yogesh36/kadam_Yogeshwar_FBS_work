//Write a program to check whether a number is even or odd.
#include<stdio.h>
int Evenodd();
void main(){
	

if(Evenodd()==1)
printf("Even Number");
else
printf("Odd Number");
}
int Evenodd(){
		int Num;
	printf("Enter the number: ");
	
  scanf("%d",&Num);
  
  if(Num%2==0){
  	return 1;
  }
  else{
  return 0;
  }
}
