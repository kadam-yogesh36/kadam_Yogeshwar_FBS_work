//SalesManager(id,name,salary,incentives,target)
#include<stdio.h>
struct SManager{
	int id;
	char name[20];
	double salary;
	int inc;
	int target;
	
};
void main(){
	
	struct SManager S1,S2;
		printf("Enter Data SalesManagers S1\n");
	printf("Enter Id:");
	scanf("%d",&S1.id);
	printf("Enter Name:");
	scanf("%s",&S1.name);
	printf("Enter Salary:");
	scanf("%lf",&S1.salary);
	printf("Enter incentives:");
	scanf("%d",&S1.inc);
	printf("Enter Target in Months;");
	scanf("%d",&S1.target);
	
	printf("\n\nEnter Data SalesManagers S2\n");
	printf("Enter Id:");
	scanf("%d",&S2.id);
	printf("Enter Name:");
	scanf("%s",&S2.name);
	printf("Enter Salary:");
	scanf("%lf",&S2.salary);
	printf("Enter incentives:");
	scanf("%d",&S2.inc);
	printf("Enter Target in Months:");
	scanf("%d",&S2.target);
		printf("\n\nId:%d \nname:%s \nSalary:%lf \nIncentives:%d \nTarget in Months: %d ",S1.id,S1.name,S1.salary,S1.inc,S1.target);
			printf("\n\nId:%d \nname:%s \nSalary:%lf \nIncentives:%d \nTarget in Months: %d ",S2.id,S2.name,S2.salary,S2.inc,S2.target);
	
}
