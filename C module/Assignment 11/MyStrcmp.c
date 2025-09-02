//mystrcpy
#include<stdio.h>
int  MyStrcmp(char* ,char* );
void main(){
	char str[25]="Application";
	 char ptr[25]="Application";
	 
int res=	MyStrcmp(str,ptr);
      printf("%d",res);

}
int MyStrcmp(char *str, char *ptr) {
    int i = 0;

    while (str[i] != '\0' && ptr[i] != '\0') {  
        if (str[i] != ptr[i]) {
            if (str[i] > ptr[i])
                return 1; 
            else
                return -1; 
        }
        i++;
    }

   
    if (str[i] == '\0' && ptr[i] == '\0')
        return 0;   
    else if (str[i] == '\0')
        return -1;  
    else
        return 1;  
}

