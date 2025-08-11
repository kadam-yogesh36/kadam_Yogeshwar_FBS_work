#include<stdio.h>
void getLarger(int,int,int);
void main() {

	int a,b,c;
	printf("Enter A:");
	scanf("%d",&a);
	printf("Enter B:");
	scanf("%d",&b);
	printf("Enter C:");
	scanf("%d",&c);
	getLarger(a,b,c);
}
void getLarger(int a,int b,int c){
	if(a>b) {
		if(a>c){
		
		printf("A is Greater");
}
	} else {
		if(b>c) {
			printf("B is Greater");
		} else {
			printf("C is Greater");
		}
	}
}