#include<stdio.h>
#include<string.h>
char* myStr(char str[]);
void main(){
	char str[20];
	printf("Enter the String:");
	scanf("%s",&str);
	
char* res=myStr(str);
	printf("%s",res);
	
}//main ends here

char* myStr(char str[]){
	int len=strlen(str);
	int i,j;
	for(i=0,j=len-1;i<j;i++,j--){
		char temp=str[i];
		str[i]=str[j];
		str[j]=temp;
	}
	return str;		
		
}
	
	
