//Employee (id,name,salary)
#include<stdio.h>

struct Employee{
	int Id;
	char name[20];
	double salary;
};
void main(){
	
	struct Employee e1,e2;
	printf("Enter Data Employee e1\n");
	printf("Enter Id:");
	scanf("%d",&e1.Id);
	printf("Enter Name:");
	scanf("%s",&e1.name);
	printf("Enter Salary:");
	scanf("%lf",&e1.salary);
		printf("\nEnter Data Employee e2\n");
	printf("Enter Id:");
	scanf("%d",&e2.Id);
	printf("Enter Name:");
	scanf("%s",&e2.name);
	printf("Enter Salary:");
	scanf("%lf",&e2.salary);
	
	printf("Data of Employee e1\n");
	printf("Id: %d\nEmployee Name:%s\nSalary:%lf",e1.Id,e1.name,e1.salary);
		printf("\nData of Employee e2\n");
	
		printf("Id: %d\nEmployee Name:%s\nSalary:%lf",e2.Id,e2.name,e2.salary);
	
}
