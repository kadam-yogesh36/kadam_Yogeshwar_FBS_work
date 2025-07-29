//Calculating total salary based on basic. If basic <=5000 da, ta and hra will be
//10%,20% and 25% respectively otherwise da, ta and hra will be 15%,25% and 30%
//respectively.
#include<stdio.h>
void main() {
	int Salary,TA,DA,HRA ,total;
	printf("Enter your basic Salary: ");
	scanf("%d",&Salary);

	if(Salary<=5000) {
		DA=((Salary*10)/100);
		TA=((Salary*20)/100);
		HRA=((Salary*25)/100);
		

	} else {
		DA=((Salary*15)/100);
		TA=((Salary*25)/100);
		HRA=((Salary*30)/100);
		

	}
	total=Salary+DA+TA+HRA;
	printf("DA: %d\n",DA);
    printf("TA: %d\n", TA);
    printf("HRA: %d\n", HRA);
    printf("Total Salary: %d\n", total);
	
}