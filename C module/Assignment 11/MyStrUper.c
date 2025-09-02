//MyStrUpr
#include<stdio.h>
char* MyStrUpr(char* );

void main(){
	char str[]="Yogesh 1234";
	
	char* res=MyStrUpr(str);
	printf("%s",res);
	
}//main ends  here

char* MyStrUpr(char* str){
	int i=0;
	while(str[i]!='\0'){
		if(str[i]>='a'&&str[i]<='z'){
			str[i]=str[i]-32;
			
		}
		i++;	
	}
return str;
}