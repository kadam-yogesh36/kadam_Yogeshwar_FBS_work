#include<stdio.h>
#include<string.h>
void main(){
	char  str1[10];
    char  str2[10];
	printf("Enter first String: ");
	scanf("%s",str1);
	
	printf("Enter Second String: ");
	scanf("%s",str2);
	
	printf("\nYou entered :\n");
	printf("String 1:%s\n",str1);
	printf("String 2:%s",str2);
	
	printf("\n<--Compare two strings of n characters -->\n");
  int res=strncmp(str1,str2,3);
  
  printf("Res = %d\n",res);
  if(res==0){
  	printf("Both Strings Are Equal");
  	
  }else if(res>0){
  	printf("Str1  is Greater");
  	
  }else
  printf("Str2 is Greater");
	

}