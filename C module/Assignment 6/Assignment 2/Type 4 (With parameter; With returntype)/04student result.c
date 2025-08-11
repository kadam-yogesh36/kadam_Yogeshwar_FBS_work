//Ask the user to enter marks. Then show the result based on these rules:
//If marks are more than 75 ? show "Distinction"
//If marks are more than 65 ? show "First Class"
//If marks are more than 55 ? show "Second Class"
//If marks are 40 or more ? show "Pass Class"
//If marks are less than 40 ? show "Fail"

#include<stdio.h>
int studentresult(int);
void main()
{
	int marks;
	printf("enter a marks: ");
	scanf("%d",&marks);
int res=studentresult(marks);
		if(res==0){
			printf("Distinction");
		}
		else if(res==1){
			printf("First Class");
		}
		else if(res==2){
			printf("Second Class");
		}
		else if(res==3){
			printf("pass");
		}
		else if(res==4){
			printf("fail");
		}
	
}
// start 
int studentresult(int marks)
{
	
	if(marks>75){
		 return 0;
	}
	else
	{
		if(marks>65){
			 return 1;
		}
		else
		{
			if(marks>55){
				 return 2;
			}
			else
			{
				if(marks>40){
					 return 3;
				}
				else
				{
					return 4;
				}
			}
		}
	}
	
}