//Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the desired operations.

#include<stdio.h>
double calculater(double,double,char);
void main()
{
	double num1,num2;
	char operators;
	printf("enter a num1 : ");
	scanf("%lf",&num1);
	printf("enter a num2 : ");
	scanf("%lf",&num2);
	printf("enter an operator (+, -, *, /,%): ");
	scanf(" %c", &operators);
 	double res=calculater(num1,num2,operators);
	printf("%lf",res);
}

// start 
double calculater(double num1,double num2,char operators) 
{
	double result;
	
	if( operators=='+') {
		result= num1+num2;
		return result;
	} else if( operators=='-') {
		result= num1-num2;
		return result;
	} else if(operators=='*'){
		result=num1*num2;
		return result;
	}else if( operators== '/') {
		if(num2!=0)
			result= num1/num2;
		return result;
	} else if( operators== '%') {

		result= (int)num1%(int)num2;
		return result;
	}
}
