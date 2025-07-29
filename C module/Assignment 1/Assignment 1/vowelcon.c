//Write a program to check whether a given character is a vowel or consonant
#include<stdio.h>
void main(){
	char cha;
	printf("Enter character: ");
	scanf("%c",&cha);
	
	if(cha=='a'||cha=='e'||cha=='i'||cha=='o'||cha=='u'||cha=='A'||cha=='E'||cha=='I'||cha=='O'||cha=='U'){
		printf("Vowel");
	}else{
		printf("Consonant");
	}

}