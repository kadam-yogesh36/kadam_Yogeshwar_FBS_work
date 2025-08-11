#include <stdio.h>
int LeapYear(int);
int main() {
    int year;

    printf("Enter a year: ");
    scanf("%d", &year);
    if(LeapYear(year)==1)
     printf("%d is a Leap Year.\n", year);
     else
     printf("%d is NOT a Leap Year.\n", year);
}
int LeapYear(int year){
	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
       return 1;
    } else {
        return 0;
    }
}
