//Write a program to check whether a given character is uppercase or lowercase.
#include<stdio.h>
int UpperLowercase();
void main(){
	int res=UpperLowercase(); 
	if(res==1)
	printf("Uppercase Character");
	else if( res==2)
	printf("Lowercase character");
	else
	printf("The character is not an alphabet letter");
}

int UpperLowercase(){
	char ch;
	printf("Enter character: ");
	scanf("%c",&ch);
	
	if(ch>='A' && ch<='Z'){
	return 1;
	}else if(ch>='a' && ch<='z'){
	
		return 2;
		
	}else{
	return 3;
	}
}
	