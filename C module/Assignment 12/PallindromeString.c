//Write a program to check the string is palindrome or not.
#include<stdio.h>
#include<string.h>
void main(){
	char str[20];

	
	printf("Enter the String: ");
	scanf("%s",str);
	
	
      int len=strlen(str);
          int flag=0;
      for(int i=0,j=len-1;i<=j;i++,j--){
      	if(str[i]!=str[j])
      	flag=1;
      	break;
      	
	  }
	  if(flag==0)
	  printf("String is Pallindrome");
	  else
	  printf("string not pallindrome");
	  
}