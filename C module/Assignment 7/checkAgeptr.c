//Write a program to check whether a person is eligible to vote (age = 18).
#include<stdio.h>
void checkAge(int *);
void main() {
	int age;
	printf("Enter Age: ");
	scanf("%d",&age);

   checkAge(&age);
}//main end
void checkAge(int *age){
		if(*age>=18) {
		printf("Eligible for voting");
	} else {
		printf("Not eligible for vote");
	}
}