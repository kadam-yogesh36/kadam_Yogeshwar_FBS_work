#include<stdio.h>
#include<string.h>
void countVowels(char str[]){
int vcount=0,dcount=0,Ccount=0,scount=0;
  
  for(int i=0;i<=strlen(str)-1;i++){
  	   char ch=str[i];
  	   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
  	   	vcount++;
		 }else if(ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='0'){
		 	dcount++;
		 }else if(ch==' '){
		 		scount++;
			 }
			 
			 else{
			
			 Ccount++;
			 }
		
		 
  }
  
  printf("\nVowels are: %d",vcount);
  printf("\nDigits are: %d",dcount);
  printf("\nConsonant are: %d",Ccount);
  printf("\nSpaces are: %d",scount);
}

void main(){
	char str[30];
	printf("Enter String:");
	scanf("%[^\n]",&str);
  printf("String is : %s",str);
       
  
     countVowels(str);
}