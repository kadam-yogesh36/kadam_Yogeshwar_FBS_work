//Accept three sides of a triangle from the user and determine whether the triangle is
//equilateral, isosceles, or scalene.
#include<stdio.h>
void Triangle(int* ,int* ,int* );
void main(){
	int a,b,c;
	printf("Enter Side A:");
	scanf("%d",&a);
printf("Enter Side B:");
	scanf("%d",&b);
	printf("Enter Side C:");
	scanf("%d",&c);
	
Triangle(&a,&b,&c);

}//main end

void Triangle(int* a,int* b,int* c){
		if(*a==*b&&*b==*c){
		printf("Equilateral triangle");
	}else if (*a==*b||*b==*c||*c==*a){
		printf("Isosceles Triangle");
	}else{
		printf("scalene Triagles");
	}
}