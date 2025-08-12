#include<stdio.h>
void checkpallindrome(int* );
void main(){
	int number;
	printf("Enter the number:");
	scanf("%d",&number);
    checkpallindrome(&number);
}//main end

void checkpallindrome(int* number){
	int r1,r2,r3,q1;
		r1=*number%10;
	q1=*number/10;
	r2=q1%10;
	r3=q1/10;
	
if(r1==r3){
	printf("%d  is palindrome number",*number);
}else{
	printf("%d is Not palindrome number",*number);
}
}