//Accept the age and check if the person is:
//Child (age < 12),Teenager (12?19),Adult (20?59),Senior (60 and above)

#include<stdio.h>
int agecount(int);
void main()
{
	int age;
	printf("enter a age : ");
	scanf("%d",&age);
int res=agecount(age);
		if(res==0){
			printf("Child");
		}
		else if(res==1){
			printf("Teenager");
		}
		else if(res==2){
			printf("Adult");
		}
		else if(res==3){
			printf("Senior");
		}
}
// start
int agecount(int age)
{

	
	if(age<12){
		 return 0;
	}
	else
	{
		if(age<19){
			 return 1;
		}
		else
		{
			if(age<59){
				 return 2;
			}
			else
			{
				 return 3;
			}
		}
	}
}