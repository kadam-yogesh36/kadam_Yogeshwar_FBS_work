#include<stdio.h>
int getperfect();
void main() {
	
	if(getperfect()==1)
	printf("Number is perfect");
	else
		printf("Number is not perfect");
	
}//main end here

int getperfect(){
		int num;
	
	printf("Enter the number:");
	scanf("%d",&num);
	int i=1,sum=0;
	int temp=num;
	while(i<=num/2){
		
		if(num%i==0){
			sum=sum+i;
		}i++;
		
	}
	if (sum==temp)
	return 1;
	else
	return 0;
}
