//Check the given number is prime or not.
//Input: n = 7
//Output: Prime
#include<stdio.h>
void main() {
	int num;
	int isprime=1;
	printf("Enter the number:");
	scanf("%d",&num);

//    while(i<num-1){
//
//    	if(num%i==0)
//    isprime=0;
//		i++;
//	}

	for(int i=2; i<=num/2; i++) {
		if(num%i==0)
			isprime=0;
	}

	if(isprime==1) {
		printf("Prime Number");
	} else {
		printf("Not prime");
	}

}