//Accept three sides of a triangle from the user and determine whether the triangle is equilateral, isosceles, or scalene.
#include<stdio.h>
int findtriangle(int,int,int);
void main()
{
	int a,b,c;
	printf("Enter a first side: ");
	scanf("%d",&a);
	printf("Enter a first second: ");
	scanf("%d",&b);
	printf("Enter a first third:");
	scanf("%d",&c);
int res=findtriangle(a,b,c);
		if(res==0){
			printf("equilateral");
		}
		else if(res==1){
			printf(" triangle");
		}
		else if(res==2){
		printf("scalene");	
		}
}
// start 
int findtriangle(int a,int b,int c)
{
	

	if(a==b&&b==c) 
	{
		return 0;
    }
    else
    {
    	if(a==b || b==c || c==a)
    	{
    		return 1;
		}
		else
		{
			 return 2;
		}
	}

}