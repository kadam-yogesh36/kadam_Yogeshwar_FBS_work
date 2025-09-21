//hr (id,name,salay,commision)
#include<stdio.h>
struct Hr {
	int id;
     char name[20];
	double salary;
	double cmn;
	
};
void main(){
	 
	 struct Hr h1,h2;
	 	printf("Enter Data Hr H1\n");
	printf("Enter Id:");
	scanf("%d",&h1.id);
	printf("Enter Name:");
	scanf("%s",&h1.name);
	printf("Enter Salary:");
	scanf("%lf",&h1.salary);
	printf("Enter commision:");
	scanf("%lf",&h1.cmn);
	
		printf("\nEnter Data Hr H2\n");
	printf("Enter Id:");
	scanf("%d",&h2.id);
	printf("Enter Name:");
	scanf("%s",&h2.name);
	printf("Enter Salary:");
	scanf("%lf",&h2.salary);
	printf("Enter commision:");
	scanf("%lf",&h2.cmn);
	printf("\n\n");
	
	printf("Id:%d \nname:%s \nSalary:%lf \nCommision:%lf ",h1.id,h1.name,h1.salary,h1.cmn);
	printf("\n\nId:%d \nname:%s \nSalary:%lf \nCommision:%lf",h2.id,h2.name,h2.salary,h2.cmn);
	
	
}