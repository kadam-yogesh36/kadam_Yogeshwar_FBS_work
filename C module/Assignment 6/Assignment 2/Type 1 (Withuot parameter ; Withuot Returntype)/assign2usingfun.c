#include<stdio.h>


void 	Age();
void 	calculator();
void	discount();
void	divisiblity();
void	larger();
void	result();
void	triangle();
void main(){
	Age();
	calculator();
	discount();
	divisiblity();
	larger();
	result();
	triangle();}

// age start here
void Age(){
	printf("you check age:\n");
	int age;
	printf("Enter the Age:");
	scanf("%d",&age);
	if(age<12){
		printf("Child\n");
	}else if (age>=12&&age<=19){
		printf("teenager");
	}else if(age>=20&&age<=59){
		printf("Adult\n");
		
	}else{
		printf("Senior\n");
	}
}//age end here
//calculator start here
void calculator() {
		printf("Calculator using operator:\n");
	double num1,num2;
	char op;
	printf("Enter the first number:");
	scanf("%lf",&num1);
	printf("Enter an operator(+,-,*,/,%):");
	scanf(" %c",&op);
	printf("Enter the Second number:");
	scanf("%lf",&num2);

	if(op=='+') {
		printf("Result=%lf\n",num1+num2);
	} else {
		if(op=='-') {
			printf("Result=%lf\n",num1-num2);
		} else {
			if(op=='*') {
				printf("Result=%lf\n",num1*num2);
			} else {
				if(op=='/') 
				{
					if(num2!=0)
					 {
						printf("Result=%lf\n",num1/num2);
					}
				} else
				 {
					if(op=='%') 
					{
						if(num2!=0) 
						{
							printf("Result=%d\n",(int)num1%(int)num2);
						}
					} else {
						printf("Invalid Operator\n");
					}
				}
			}
		}
	}
}//calculator ends here

//discount start here

void discount() {
		printf("you check discount or net price:\n");
	double price,discount,netprice;
	char ch;

	printf("Enter the Price:");
	scanf("%lf",&price);
	printf("are you student ? (y/n):");
	scanf(" %c",&ch);
	if(ch=='y') {
		printf("User is Student\n");
		if(price>500) {
			discount=price*0.20;
			netprice=price-discount;
			printf(" Total Discount: %lf\n",discount);
			printf("Net Price: %lf\n",netprice);
		} else {
			discount=price*0.10;
			netprice=price-discount;
			printf(" Total Discount: %lf\n",discount);
			printf("Net Price: %lf\n",netprice);

		}

	} else {
		printf("User not Student\n");
		if(price>600) {
			discount=price*0.15;
			netprice=price-discount;
			printf(" Total Discount: %lf\n",discount);
			printf("Net Price: %lf\n",netprice);
		} else {
			printf("Discount not awailable\n");
		}
	}
}

//discount ends here

//divisiblity start here
void divisiblity(){
		printf("you check divisiblity:\n");
	int num;
	printf("Enter the number:");
	scanf("%d",&num);
	if(num%3==0&&num%5==0){
		printf("Divisible by both\n");
	}else if(num%3==0&&num%5!=0){
		printf("divisible by 3 but not 5\n");
	}else if(num%5==0&&num%3!=0){
		printf("Divisible by 5 but not by 3\n");
	}else{
		printf("Divisible by  none\n");
	}
} //divisiblity ends here

//larger start here
void larger() {
		printf("you find which no is greater:\n");

	int a,b,c;
	printf("Enter A:");
	scanf("%d",&a);
	printf("Enter B:");
	scanf("%d",&b);
	printf("Enter C:");
	scanf("%d",&c);
	if(a>b) {
		if(a>c){
		
		printf("A is Greater\n");
}
	} else {
		if(b>c) {
			printf("B is Greater\n");
		} else {
			printf("C is Greater\n");
		}
	}
}
//larger ends here
//result start here
void result() {
		printf("you check student result:\n");
	int marks;
	printf("Enter Marks:");
	scanf("%d",&marks);
	if(marks>65) {
		printf("First Class\n");
	} else {
		if(marks>55) {
			printf("Second class\n");
		} else {
			if(marks>=40) {
				printf("Pass\n");

			} else {
				printf("Fail\n");
			}
		}
	}
}
//result ends here

void triangle(){
		printf("you check which type of triangle :\n");
	int a,b,c;
	printf("Enter Side A:");
	scanf("%d",&a);
printf("Enter Side B:");
	scanf("%d",&b);
	printf("Enter Side C:");
	scanf("%d",&c);
	
	if(a==b&&b==c){
		printf("Equilateral triangle\n");
	}else if (a==b||b==c||c==a){
		printf("Isosceles Triangle\n");
	}else{
		printf("scalene Triagles\n");
	}
}
//triangle ends here