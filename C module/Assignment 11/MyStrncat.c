//MyStrCat
#include<stdio.h>
char* MyStrCat(char* ,char* ,int );
void main(){
	char str[20]="Yogesh";
	char str1[20]="kadam_";
     int n;
     printf("Enter How many character concat:");
     scanf("%d",&n);
    char* res=MyStrCat(str1,str,n);
    printf("%s",res);
}//main ends here

char* MyStrCat(char* str1,char* str,int n){
     int size=0;
     for(int i=0;str1[i]!='\0';i++){
     	size++;
	 }
	 
	 
	 int i=0;
	 while( i<n &&str1[i]!='\0'){
	 	str1[size]=str[i];
	 	i++;
	 	size++;
	 	
	 }
	 str1[size]='\0';
	return str1;
	
	 
}