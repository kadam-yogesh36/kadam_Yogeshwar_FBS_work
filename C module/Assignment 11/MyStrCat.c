//MyStrCat
#include<stdio.h>
char* MyStrCat(char* ,char* );
void main(){
	char str[20]="Yogesh";
	char str1[20]="kadam_";

    char* res=MyStrCat(str1,str);
    printf("%s",res);
}//main ends here

char* MyStrCat(char* str1,char* str){
     int size=0;
     for(int i=0;str1[i]!='\0';i++){
     	size++;
	 }
	 
	 
	 int i=0;
	 while(str1[i]!='\0'){
	 	str1[size]=str[i];
	 	i++;
	 	size++;
	 	
	 }
	 str1[i]='\0';
	return str1;
	
	 
}