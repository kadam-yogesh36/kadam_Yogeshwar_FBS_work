//Print table for given number.
//Input: n = 5
//Output: 5 10 15 20 25 30 35 40 45 50;
#include<stdio.h>
void table(int*);
void main(){
	int no;
printf("Enter the table:");
scanf("%d",&no);
table(&no);

	
	
}
void table(int* no){
	int i=1;
		printf("Table of %d:\n",*no);
		while(i<=10){
		printf("%d * %d = %d\n",*no,i,*no*i);
		i++;
}
}