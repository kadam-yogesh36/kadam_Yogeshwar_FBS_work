//Calculating total salary based on basic. If basic <=5000 da, ta and hra will be
//10%,20% and 25% respectively otherwise da, ta and hra will be 15%,25% and 30%
//respectively.
#include<stdio.h>
void SalarySlip(double );
void main() {
	double Salary;
	printf("Enter your basic Salary: ");
	scanf("%lf",&Salary);

	
	SalarySlip(Salary);
}
void SalarySlip(double Salary){
	double TA,DA,HRA ,total;
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
	printf("DA: %lf\n",DA);
    printf("TA: %lf\n", TA);
    printf("HRA: %lf\n", HRA);
    printf("Total Salary: %lf\n", total);
}