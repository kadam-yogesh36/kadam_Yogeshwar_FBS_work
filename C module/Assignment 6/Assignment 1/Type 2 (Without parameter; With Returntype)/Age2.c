//Write a program to check whether a person is eligible to vote (age = 18).
#include<stdio.h>
int Age();
void main() {
	if(Age()==1)
	printf("Eligible for vote");
	else{
			printf(" NOT Eligible for vote");
	}
}

int Age(){
	int Age;
	printf("Enter Age: ");
	scanf("%d",&Age);

	if(Age>=18) {
	return 1;
	} else {
		return 0;
	}
}