//date(date,month,year)
#include<stdio.h>
typedef struct Date{
	int date;
	char month[20];
	int year;
	
}date;

void storedate(date* d1){
	printf("Enter Date Month Year.....\n");
	
	printf("Enter Date:");
	scanf("%d",&d1->date);
	printf("Enter Month:");
	scanf("%s",&d1->month);
	printf("Enter Year:");
	scanf("%d",&d1->year);
	
}//
void display(date d1){
	printf("----Date-----\n");
	printf("%d - %s - %d",d1.date,d1.month,d1.year);
}





void main(){
	
	date d1;
	
	storedate(&d1);
	display(d1);
	
}//main ends here