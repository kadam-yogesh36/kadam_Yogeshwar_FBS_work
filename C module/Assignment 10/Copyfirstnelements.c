#include<stdio.h>
#include<string.h>
void main(){
	char  str[40];
	printf("Enter string:\n");
	scanf("%[^\n]s",str);
	printf("String in the Str: %s\n",str);
	char  str1[40];
	
	strncpy(str1,str,3);
	printf("String in the Str1: %s",str1);
}