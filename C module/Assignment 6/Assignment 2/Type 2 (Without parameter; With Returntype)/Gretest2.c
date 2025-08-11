#include<stdio.h>
int Gretest();
void main() {
int res =Gretest();
	if(res==1)
		printf("A is Greater");
		else if(res==2)
		printf("B is Greater");
		else
		printf("c is Greater");
		
}
int Gretest(){
	int a,b,c;
	printf("Enter A:");
	scanf("%d",&a);
	printf("Enter B:");
	scanf("%d",&b);
	printf("Enter C:");
	scanf("%d",&c);
	if(a>b) {
		if(a>c){
		
	return 1;
}
	} else {
		if(b>c) {
			return 2;
		} else {
			return 3;
		}
	}
}