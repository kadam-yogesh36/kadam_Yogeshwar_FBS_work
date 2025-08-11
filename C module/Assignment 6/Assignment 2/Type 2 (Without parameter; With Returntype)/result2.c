//Ask the user to enter marks.
//Then show the result based on these rules:
//If marks are more than 75 ? show "Distinction"
//If marks are more than 65 ? show "First Class"
//If marks are more than 55 ? show "Second Class"
//If marks are 40 or more ? show "Pass Class"
//If marks are less than 40 ? show "Fail"
#include<stdio.h>
int getResult();
void main() {
 int res =getResult();
 if(res==1)
 printf("First class");
 else if(res==2)
 printf("Second class");
 else if (res==3)
 printf("Pass");
 else
 printf("Fail");
 
 
 
 
}
int getResult(){
		int marks;
	printf("Enter Marks:");
	scanf("%d",&marks);
	if(marks>65) {
	return 1;
	} else {
		if(marks>55) {
			return 2;
		} else {
			if(marks>=40) {
			return 3;

			} else {
				return 4;
			}
		}
	}
}