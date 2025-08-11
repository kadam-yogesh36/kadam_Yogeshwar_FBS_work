//Calculating total salary based on basic. If basic <=5000 da, ta and hra will be
//10%,20% and 25% respectively otherwise da, ta and hra will be 15%,25% and 30%
//respectively.
#include<stdio.h>
double salaryslip();
void main() {
printf("Total Salary= %lf",salaryslip());

	
}
double salaryslip(){
		double Salary,TA,DA,HRA ,total;
	printf("Enter your basic Salary: ");
	scanf("%lf",&Salary);

	if(Salary<=5000) {
		DA=((Salary*10)/100);
		TA=((Salary*20)/100);
		HRA=((Salary*25)/100);
			total=Salary+DA+TA+HRA;

	} else {
		DA=((Salary*15)/100);
		TA=((Salary*25)/100);
		HRA=((Salary*30)/100);
			total=Salary+DA+TA+HRA;

	}

	printf("DA: %lf\n",DA);
    printf("TA: %lf\n", TA);
    printf("HRA: %lf\n", HRA);
   return total;
}