//Write a program to check whether a person is eligible to vote (age = 18).
#include<stdio.h>
void main() {
	int Age;
	printf("Enter Age: ");
	scanf("%d",&Age);

	if(Age>=18) {
		printf("Eligible for voting");
	} else {
		printf("Not eligible for vote");
	}
}