#include <stdio.h>
int Leapyear();
int main() {
	if(Leapyear()==1)
	printf("Leap Year");
	else
    printf("Not Leap Year");
}
int Leapyear(){
	 int year;

    printf("Enter a year: ");
    scanf("%d", &year);
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
       return 1;
    } else {
        return 0;
    }
}
