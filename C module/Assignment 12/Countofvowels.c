//WAP to Count the Number of Vowels in a String
#include<stdio.h>
	void main(){
	char str[45];
	
	printf("Enter String:");
	scanf("%s",&str);
	
	printf("Arr: %s\n",str);
	char ch;
	int i=0,count=0;
	while(str[i]!='\0'){
		ch=str[i];
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
			printf("%c",ch);
			count++;
		}
		i++;
	}
	
	printf("\n Vowels in the String:%d",count);
}