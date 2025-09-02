//WAP to Form a New String where the First Character and the Last Character have
//been Exchanged
#include<stdio.h>
#include<string.h>
void main(){
	char str[45];
	
	printf("Enter the elements:");
	scanf("%s",&str);
	
	printf("Arr: %s\n",str);
	
	int size=strlen(str);
	
	if(size>1){
		int temp=str[0];
		str[0]=str[size-1];
		str[size-1]=temp;
	}
	
	printf("After Exchanged : %s",str);
}