#include<stdio.h>
int power(int ,int);
void main(){
	int b,c;
 printf("ENter base:");
 scanf("%d",&b);
 printf("ENter exponent:");
 scanf("%d",&c);
 printf("power of %d^%d = %d",b,c,power(b,c));
 
}
int power(int b,int c){
	int pow=1;
	for(int i=1;i<=c;i++){
	 pow=pow*b;
	}
	return pow;
}