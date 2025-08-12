#include<stdio.h>
void getStronginRange(int *);
void main(){
	int num;
	printf("enter the range:");
	scanf("%d",&num);
  getStronginRange(&num);
}
void getStronginRange(int *num){
		for(int k=1;k<=*num;k++){
	
	int no=k,fact,digit=0,sum=0;

	
	int temp=no;
	while(temp>0){
		
		digit=temp%10;
		fact=1;
		
		for(int i=1;i<=digit;i++){
			
			fact = fact*i;
		}
		sum=sum+fact;
		temp=temp/10;
	}

	if(no == sum){
		printf("%d\n",k);
		
	}
}
}