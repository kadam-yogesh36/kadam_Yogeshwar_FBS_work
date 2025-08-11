//Write a program to check whether a given character is a vowel or consonant
#include<stdio.h>
int VowelConsonant(char );
void main(){
	char cha;
	printf("Enter character: ");
	scanf("%c",&cha);
if (VowelConsonant(cha)==1)
printf("Vowel");
else
printf("consonant");
}
int VowelConsonant(char cha){
	if(cha=='a'||cha=='e'||cha=='i'||cha=='o'||cha=='u'||cha=='A'||cha=='E'||cha=='I'||cha=='O'||cha=='U'){
		return 1;
	}else{
	return 0;
	}
}