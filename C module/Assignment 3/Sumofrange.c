//Sum of numbers in given range.
//Find sum of numbers from start to end.
//Input: start = 1, end = 5
//Output: 15
#include<stdio.h>
void main(){
	int i=1,no,sum=0;
	printf("Enter the number:");
	scanf("%d",&no);
	while(i<=no){
		sum=sum+i;
		i++;
	}
	printf("sum is: %d",sum);
	
}