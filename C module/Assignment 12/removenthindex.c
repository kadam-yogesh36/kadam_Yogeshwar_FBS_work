//WAP to Remove the nth Index Character from a Non-Empty String
#include<stdio.h>
void main(){
	char str[100];
	int n;
    
    printf("Enter String:");
    scanf("%s",str);
    
    printf("Displays Array: %s\n",str);
    
    printf("Enter index to remove:");
    scanf(" %d",&n);
    
    int i=n;
    while(str[i]!='\0'){
    	str[i]=str[i+1];
    	i++;
	}
	str[i]='\0';
    printf("String After Remove %d nth index :%s",n,str);
    
	
}