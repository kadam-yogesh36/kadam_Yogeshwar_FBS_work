//Sum of numbers in given range.
//Find sum of numbers from start to end.
//Input: start = 1, end = 5
//Output: 15
#include<stdio.h>
void FindSum(int* );
void main(){
	int no;
	printf("Enter the number:");
	scanf("%d",&no);
	FindSum(&no);
	
}
void FindSum(int* no){
int i=1,sum=0;
	while(i<=*no){
		sum=sum+i;
		i++;
	}
	printf("sum is: %d",sum);
}