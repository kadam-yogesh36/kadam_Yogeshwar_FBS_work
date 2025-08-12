//Check the given number is Armstrong number or not..
//Input: n = 153
//Output: Armstrong
#include<stdio.h>
void getArmstrong(int* );
void main() {

	int no;
	printf("Enter the number:");
	scanf("%d",&no);
	getArmstrong(&no);
}//main end
void getArmstrong(int* no){
		int digits=0,digit,sum=0;

	int temp=*no;
	while(*no>0) {
		*no=*no/10;
		digits++;
	}
	*no=temp;
	while(*no>0) {
		int res=1;
		int digit=*no%10;
		for(int i=1; i<=digits; i++) {
			res=res*digit;
		}
		sum=sum+res;

		*no=*no/10;
	}
	if(sum==temp) {
		printf("%d Armstrong number\n",temp);
	} else {
		printf(" %d not  Armstrong number\n",temp);
	}
}
