//Find factorial of given number.
//Input: n = 5
//Output: 120
#include<stdio.h>
void getFactorial(int* );
void main() {
	int num;
	printf("Enter the number:");
	scanf("%d",&num);

  getFactorial(&num);
}//main end

void getFactorial(int* num){
	int i=1,fact=1;
		while(i<=*num) {
		fact=fact*i;
		i++;

	}
	printf("The factorial of %d is =%d",*num,fact);
}