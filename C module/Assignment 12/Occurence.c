//WAP Replace all Occurrences of ‘a’ with $ in a String
#include<stdio.h>
void main(){
	char str[6];
	char ch;
    
    printf("Enter String:");
    scanf("%s",str);
    
    printf("Displays Array: %s\n",str);
    
    printf("Enter character to Search:");
    scanf(" %c",&ch);
    
    int i=0;
    while(str[i]!='\0'){
    	
    	if(str[i]==ch){
    		str[i]='$';
    			
		}
		i++;	
	}
	printf("Realced Array : %s",str);
	
   
	
}