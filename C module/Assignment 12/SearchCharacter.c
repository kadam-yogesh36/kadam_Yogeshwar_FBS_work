//Write a program to scan string from user then scan a single character and search it
//in a accepted string.

#include<stdio.h>
void main(){
	char str[6];
	char ch;
    
    printf("Enter String:");
    scanf("%s",str);
    
    printf("Displays Array: %s\n",str);
    
    printf("Enter character to Search:");
    scanf(" %c",&ch);
    
    
    int found=0;
    for(int i=0;str[i]!='\0';i++){
    	if(str[i]==ch){
    		printf("character %c Found at index %d\n",ch,i);
    		found=1;
		}
    	
	}
	if(found==0)
	printf("Character %c Not Found In the String",ch);
    
	 
}