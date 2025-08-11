//Write a program to check whether a given character is uppercase or lowercase.
#include<stdio.h>
char UpperLowerCase(char );
void main(){
	char ch;
	printf("Enter character: ");
	scanf("%c",&ch);
	if(UpperLowerCase(ch)==1)
	printf("Upeercase character");
	else if(UpperLowerCase(ch)==2){
	
		printf("Lowercase character");}
		else
		printf("The character is not an alphabet letter.");
	
	
	
}
char UpperLowerCase(char ch){
	if(ch>='A' && ch<='Z'){
		return 1;
	}else if(ch>='a' && ch<='z'){
	
	return 2;
		
	}else{
		return 3;
	}
}
	