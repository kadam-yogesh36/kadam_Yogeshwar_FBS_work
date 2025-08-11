#include<stdio.h>
int pallindrome();
void main(){
  if(pallindrome()==1)
  printf("No is pallindrome ");
  else
  printf("No is Not pallindrome ");
}
int pallindrome(){
		int number,r1,r2,r3,q1;
	printf("Enter the number:");
	scanf("%d",&number);
	r1=number%10;
	q1=number/10;
	r2=q1%10;
	r3=q1/10;
	
if(r1==r3){
	return 1;
	
}else{
	return 0;
}
}