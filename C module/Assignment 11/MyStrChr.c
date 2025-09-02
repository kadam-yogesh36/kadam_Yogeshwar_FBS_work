//MyStrChr
#include<stdio.h>
char* MyStrChr(char* ,char );
void main(){
	char str[]="hello yogesh";
   char ch;
   printf("Enter the Character:");
   fflush(stdin);
   scanf("%c",&ch);
  char* res=  MyStrChr(str,ch);
  if(res!=NULL)
  printf("Char Found at %d index",res-str);
  else
  printf("Char not Found");
    	
}//main ends here

char* MyStrChr(char* str,char ch){
	int i=0;
	while(str[i]!='\0'){
		if(str[i]==ch){
			return &str[i];
		}
		i++;
	}
}