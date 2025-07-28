#include<stdio.h>
void main(){
	int hh,min,sec;
	printf("Enter hour:");
	scanf("%d",&hh);
	printf("Enter Minutes:");
		scanf("%d",&min);
	printf("Enter Second:");
	scanf("%d",&sec);
	
	int totalsec=(hh*3600)+(min*60)+(sec);
	printf("Total Sec:%d",totalsec);
}