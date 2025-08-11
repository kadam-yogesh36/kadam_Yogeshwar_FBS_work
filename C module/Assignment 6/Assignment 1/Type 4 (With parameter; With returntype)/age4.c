//Write a program to check whether a person is eligible to vote (age = 18).
#include<stdio.h>
int GetAge(int);
void main() {
	int Age;
	printf("Enter Age: ");
	scanf("%d",&Age);
if(GetAge(Age)==1)
	printf("Eligible for voting");
	else
	printf("Not eligible for vote");
}

int GetAge(int Age){
		if(Age>=18) {
	return 1;
	} else {
		return 0;
	}
}