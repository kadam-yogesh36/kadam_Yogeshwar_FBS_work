//MyStrUpr
#include<stdio.h>
char* MyStrlwr(char* );

void main(){
	char str[]="YOGESH KADAM";
	
	char* res=MyStrlwr(str);
	printf("%s",res);
	
}//main ends  here

char* MyStrlwr(char* str){
	int i=0;
	while(str[i]!='\0'){
		if(str[i]>='A'&&str[i]<='Z'){
			str[i]=str[i]+32;
			
		}
		i++;	
	}
return str;
}