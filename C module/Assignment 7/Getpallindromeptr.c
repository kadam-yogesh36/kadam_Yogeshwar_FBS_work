//Check the given number is Palindrome number or not.
//Input: n = 121
//Output: Palindrome
#include<stdio.h>
void Getpallindrome(int* );
void main(){
	int no;
	printf("Enter the Number:");
	scanf("%d",&no);
	Getpallindrome(&no);
}///main end 

void Getpallindrome(int* no){
	int i=1,rev=0;
	int temp=*no;
	while(*no>0){
		int rem=*no%10;
		rev=rev*10+rem;
		*no=*no/10;
		
	}
if(rev==temp){
	printf("%d is palindrome number",temp);
}else{
	printf("%d is not  palindrome number",temp);
}
}