//mystrlen
#include<stdio.h>
int MyStrlen(char*);
void main(){
	char str[25]="Yogesh Kadam";
	
int res=MyStrlen(str);
	 printf("%d",res);
}
int MyStrlen(char* ptr){
	int i=0;
	int count=0;
      for(int i=0;ptr[i]!=0;i++){
      	count++;
	  }
	  return count;
}

