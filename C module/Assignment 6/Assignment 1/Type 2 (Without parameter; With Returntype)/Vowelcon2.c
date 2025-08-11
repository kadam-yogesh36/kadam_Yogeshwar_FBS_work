//Write a program to check whether a given character is a vowel or consonant
#include<stdio.h>
int VowelCon();
void main(){
	if(VowelCon()==1)
	printf("Vowel");
	else
	printf("Consonant");
}

int VowelCon(){
	char cha;
	printf("Enter character: ");
	scanf("%c",&cha);
	
	if(cha=='a'||cha=='e'||cha=='i'||cha=='o'||cha=='u'||cha=='A'||cha=='E'||cha=='I'||cha=='O'||cha=='U'){
		return 1;
		
	}else{
		return 0;
	}

}