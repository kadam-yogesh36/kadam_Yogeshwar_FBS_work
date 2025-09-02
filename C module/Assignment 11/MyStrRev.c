//Mystrrev
#include<stdio.h>
#include<string.h>
 char* MyStrRev(char* );
void main(){
	 char str[]="Tejas Kadam";
	 printf("String Before Reverse: \n%s\n",str);
	 
	 
	char* res= MyStrRev(str);
	printf("String After Reverse: \n%s\n",res);
	 
}
//main ends here
 char* MyStrRev(char* str){
 	
 	int size=strlen(str);
  	int i,j;
  	for(i=0,j=size-1;i<j;i++,j--){
  		int temp=str[i];
  		str[i]=str[j];
  		str[j]=temp;
	  }
  	return str;
  }