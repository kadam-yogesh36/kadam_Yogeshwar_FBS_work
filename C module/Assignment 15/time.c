#include <stdio.h>


struct Time {
    int hrs;
    int min;
    int sec;
};


void display(struct Time t) {
    printf("%02d:%02d:%02d\n", t.hrs, t.min, t.sec);
}


struct Time addTime(struct Time t1, struct Time t2) {
    struct Time result;

    result.sec = t1.sec + t2.sec;
    result.min = t1.min + t2.min + result.sec / 60; 
    result.sec = result.sec % 60;

    result.hrs = t1.hrs + t2.hrs + result.min / 60;
    result.min = result.min % 60;

    return result;
}


int toSeconds(struct Time t) {
    return t.hrs * 3600 + t.min * 60 + t.sec;
}

void main() {
    struct Time t1, t2, sum;

   
    printf("Enter 1st Time (hrs min sec): ");
    scanf("%d %d %d", &t1.hrs, &t1.min, &t1.sec);

    
    printf("Enter 2nd Time (hrs min sec): ");
    scanf("%d %d %d", &t2.hrs, &t2.min, &t2.sec);

 
    printf("\nFirst Time  : ");
    display(t1);
    printf("Second Time : ");
    display(t2);

  
    sum = addTime(t1, t2);
    printf("\nSum of Times: ");
    display(sum);

  
    printf("\nFirst Time in Seconds  : %d\n", toSeconds(t1));
    printf("Second Time in Seconds : %d\n", toSeconds(t2));
    printf("Sum Time in Seconds    : %d\n", toSeconds(sum));

    
}
