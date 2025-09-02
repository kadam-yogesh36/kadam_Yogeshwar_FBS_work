//WAP to Take in a String and Replace Every Blank Space with special symbol.
#include<stdio.h>
void main(){
	char str[45];
	
	printf("Enter String:");
	scanf("%[^\n]",&str);
	
	printf("Arr: %s\n",str);
	
	for(int i=0;str[i]!='\0';i++){
		if(str[i]==' ')
		str[i]='@';
		
	}
	printf("%s",str);
	
}