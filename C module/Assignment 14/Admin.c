//admin(id,name,salary,allowances)
#include<stdio.h>
struct admin{
	int id;
	char name[20];
	double salary;
	double awlnc;
	
};

void  Adminstoredata(struct admin data[],int n ){
	
	printf("<-------Create Admin Data Table------->\n");
	for(int i=0;i<n;i++){
		printf("Enter Details Admin %d",i+1);
		printf("\nEnter Id:");
		scanf("%d",&data[i].id);
		printf("Enter Name:");
		scanf("%s",data[i].name);
		printf("Enter salary:");
		scanf("%lf",&data[i].salary);
		printf("Enter Allowances:");
		scanf("%lf",&data[i].awlnc);
			
		printf("\n\n");
		
	}
	
}//store end 

void displaydata(struct admin data[],int n){
	printf("<-------Display Admin Data Table------->\n");
	for(int i=0;i<n;i++){
		printf("Display Details Admin %d",i+1);
		printf("\nId: %d",data[i].id);
		printf("\nName: %s",data[i].name);
		printf("\nSalary: %lf",data[i].salary);
		printf("\nAllowances: %lf",data[i].awlnc);
		
		printf("\n\n");
	}
	
}







void main(){
	 struct admin data[2];
	 Adminstoredata(data,2);
	 displaydata(data,2);
}