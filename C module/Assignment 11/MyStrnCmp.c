//mystrncpy
#include<stdio.h>
int  MyStrncmp(char* ,char*,int );
void main(){
	char str[25]="Appml";
	 char ptr[25]="Appmecation";
	 int n;
	  printf("Enter number of characters to compare: ");
    scanf("%d", &n);
	 
int res= MyStrncmp(str,ptr,n);

     if (res == 0)
        printf("First %d characters are equal.\n", n);
    else if (res > 0)
        printf("First %d characters: str is greater.\n", n);
    else
        printf("First %d characters: str is smaller.\n", n);

    
}


int MyStrncmp(char *str, char *ptr,int n) {
    int i = 0;

    while (i<n && str[i] != '\0' && ptr[i] != '\0') {  
        if (str[i] != ptr[i]) {
        	return str[i]-ptr[i];
			}
			i++;
		}
		if(i==n)
		return 0;
		
		return (str[i]-ptr[i]);
             
}

