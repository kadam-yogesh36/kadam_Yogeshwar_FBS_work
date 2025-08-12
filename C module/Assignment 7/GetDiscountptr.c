//Accept the price from user. Ask the user if he is a student (user may say y or n). If he
//is a student and he has purchased more than 500 than discount is 20% otherwise
//discount is 10%.But if he is not a student then if he has purchased more than 600
//discount is 15% otherwise there is not discount.
#include<stdio.h>
void GetDiscount(double* ,char *);
void main() {
	double price;
	char ch;

	printf("Enter the Price:");
	scanf("%lf",&price);
	printf("are you student ? (y/n):");
	scanf(" %c",&ch);
	GetDiscount(&price,&ch);
}//main end

void GetDiscount(double* price,char *ch){
	double discount,netprice;
	if(*ch=='y') {
		printf("User is Student\n");
		if(*price>500) {
			discount=*price*0.20;
			netprice=*price-discount;
			printf(" Total Discount: %lf\n",discount);
			printf("Net Price: %lf",netprice);
		} else {
			discount=*price*0.10;
			netprice=*price-discount;
			printf(" Total Discount: %lf\n",discount);
			printf("Net Price: %lf",netprice);

		}

	} else {
		printf("User not Student\n");
		if(*price>600) {
			discount=*price*0.15;
			netprice=*price-discount;
			printf(" Total Discount: %lf\n",discount);
			printf("Net Price: %lf",netprice);
		} else {
			printf("Discount not awailable");
		}
	}
}

