#include<stdio.h>
#include<string.h>
void main(){
	char str[25];
	
	scanf("%[^\n]s",str);
	
	printf("%s\n",str);
	
	int size=strlen(str);
	
	printf("%d",size);	
	
}