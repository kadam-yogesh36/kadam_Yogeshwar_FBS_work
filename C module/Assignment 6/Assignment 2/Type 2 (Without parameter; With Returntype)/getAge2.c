//Accept the age and check if the person is:
//Child (age < 12),Teenager (12?19),Adult (20?59),Senior (60 and above)
#include<stdio.h>
int getAge();
void main(){
	
int res=	getAge();
   if(res==1)
   printf("Child");
   else if(res==2)
   printf("teenager");
   else if(res==3)
   printf("Adult");
   else
   printf("Senior");
}

int getAge(){
		int age;
	printf("Enter the Age:");
	scanf("%d",&age);
	if(age<12){
		return 1;
	}else if (age>=12&&age<=19){
		return 2;
	}else if(age>=20&&age<=59){
		return 3;
		
	}else{
		return 4;
		
	}
}