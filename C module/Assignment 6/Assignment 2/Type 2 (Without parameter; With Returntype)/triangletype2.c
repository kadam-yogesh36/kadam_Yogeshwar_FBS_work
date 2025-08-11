//Accept three sides of a triangle from the user and determine whether the triangle is
//equilateral, isosceles, or scalene.
#include<stdio.h>
int triangletype();
void main(){
int res= triangletype();
  if (res==1)
  printf("Equilateral triangle");
  else if(res==2)
  	printf("Isosceles Triangle");
  	else
  		printf("scalene Triagles");
  
}
int triangletype(){
		int a,b,c;
	printf("Enter Side A:");
	scanf("%d",&a);
printf("Enter Side B:");
	scanf("%d",&b);
	printf("Enter Side C:");
	scanf("%d",&c);
	
	if(a==b&&b==c){
		return 1;
	}else if (a==b||b==c||c==a){
	return 2;
	}else{
	return 3;
	}
}