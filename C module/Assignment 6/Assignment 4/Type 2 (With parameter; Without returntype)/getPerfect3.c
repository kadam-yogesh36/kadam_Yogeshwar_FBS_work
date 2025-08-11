#include<stdio.h>
void getPerfect(int );
void main() {
	int no;
	printf("enter the range:");
	scanf("%d,",&no);
   getPerfect(no);
}
void getPerfect(int no){
for(int k=1;k<=no;k++){
	
	int num=k,i=1,sum=0;
	
	while(i<=num/2){
		
		if(num%i==0){
			sum=sum+i;
		}i++;
		
	}
	
	if(sum==num){
		printf("%d is Perfect Number\n",k);
	}
}
}