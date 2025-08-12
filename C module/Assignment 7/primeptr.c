//Check the given number is prime or not.
//Input: n = 7
//Output: Prime
#include<stdio.h>
void prime(int* num);
void main() {
	int num;

	printf("Enter the number:");
	scanf("%d",&num);

   prime(&num);

}
void prime(int* num){
		int isprime=1,i=2;
	 while(i<*num-1){

    	if(*num%i==0)
    isprime=0;
		i++;
	}


	if(isprime==1) {
		printf("Prime Number");
	} else {
		printf("Not prime");
	}
}