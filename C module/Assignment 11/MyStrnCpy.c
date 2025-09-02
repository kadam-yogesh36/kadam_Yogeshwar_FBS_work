//mystrcpy
#include<stdio.h>
char* MyStrncpy(char* ,char* ,int );
void main(){
	char str[25]="Yogesh Kadam";
	 char ptr[25];
	 int n;
	 printf("Enetr the number for how many Characters are u copy:");
	scanf("%d",&n);
	 
	char* res=MyStrncpy(ptr,str,n);
	printf("%s",res);
}
char* MyStrncpy(char* ptr ,char* str,int n){
	 int i=0;
	 while(i<n &&str[i]!='\0' )
	 {
	 	ptr[i]=str[i];
	 	i++;
	 }
	
	 ptr[i]='\0';
	 return ptr;
}