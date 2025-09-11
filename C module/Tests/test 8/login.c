#include<stdio.h>
#include<string.h>
#include<time.h>

void main(){
	char userid[20];
	char pass[20];
	char S_Userid[]="Admin";
	char S_Password[]="Yogesh";
	int randomnum,userinput;
	
	printf("Enter the User Id :");
	scanf("%s",&userid);
	printf("Enter the Paaword:");
	scanf("%s",&pass);
	
	
	if(strcmp(userid,S_Userid)==0&&strcmp(pass,S_Password)==0){
		
		
		time_t t;
		t=time(NULL);
		
		randomnum=(t%900)+100;
		
		printf("Verification number= %d\n",randomnum);
		
		printf("Enter Verification Number ");
		scanf("%d",&userinput);
		if(randomnum==userinput){
			printf("Login Successful!");
		}		
		else
		printf("Verification Failed");
	}
	else
	printf("Enter valid Username and Password");	
	
}

