#include<stdio.h>
void main() {
	double num1,num2;
	char op;
	printf("Enter the first number:");
	scanf("%lf",&num1);
	printf("Enter an operator(+,-,*,/,%):");
	scanf(" %c",&op);
	printf("Enter the Second number:");
	scanf("%lf",&num2);

	if(op=='+') {
		printf("Result=%lf",num1+num2);
	} else {
		if(op=='-') {
			printf("Result=%lf",num1-num2);
		} else {
			if(op=='*') {
				printf("Result=%lf",num1*num2);
			} else {
				if(op=='/') 
				{
					if(num2!=0)
					 {
						printf("Result=%lf",num1/num2);
					}
				} else
				 {
					if(op=='%') 
					{
						if(num2!=0) 
						{
							printf("Result=%d",(int)num1%(int)num2);
						}
					} else {
						printf("Invalid Operator");
					}
				}
			}
		}
	}
}

