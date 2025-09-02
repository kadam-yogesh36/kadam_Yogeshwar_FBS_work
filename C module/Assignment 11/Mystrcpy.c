//mystrcpy
#include<stdio.h>
char* MyStrcpy(char* ,char* );
void main(){
	char str[25]="Yogesh Kadam";
	 char ptr[25];
	 
	char* res=MyStrcpy(ptr,str);
	printf("%s",res);
}
char* MyStrcpy(char* ptr ,char* str){
	 int i=0;
	 while(str[i]!='\0'){
	 	ptr[i]=str[i];
	 	i++;
	 }
	 ptr[i]='\0';
	 return ptr;
}
