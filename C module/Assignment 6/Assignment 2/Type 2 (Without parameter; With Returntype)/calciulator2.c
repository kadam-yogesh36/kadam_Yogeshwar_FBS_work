#include<stdio.h>
double Calculator();
void main() {
 printf("Result = %lf",Calculator());
 
 	
}

double Calculator(){
	
		double num1,num2;
	char op;
	printf("Enter the first number:");
	scanf("%lf",&num1);
	printf("Enter an operator(+,-,*,/,%):");
	scanf(" %c",&op);
	printf("Enter the Second number:");
	scanf("%lf",&num2);

	if(op=='+') {
	return num1+num2;
	} else {
		if(op=='-') {
		return num1-num2;
		} else {
			if(op=='*') {
			return num1*num2;
			} else {
				if(op=='/') 
				{
					if(num2!=0)
					 {
					return num1/num2;
					}
				} else
				 {
					if(op=='%') 
					{
						if(num2!=0) 
						{
							return num1/num2;
						}
					} else {
						printf("Invalid Operator\n");
					}
				}
			}
		}
	}
}

