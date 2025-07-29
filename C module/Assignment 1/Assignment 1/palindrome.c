#include<stdio.h>
void main(){
	int number,r1,r2,r3,q1;
	printf("Enter the number:");
	scanf("%d",&number);
	r1=number%10;
	q1=number/10;
	r2=q1%10;
	r3=q1/10;
	
if(r1==r3){
	printf("%d  is palindrome number",number);
}else{
	printf("%d is Not palindrome number",number);
}
}