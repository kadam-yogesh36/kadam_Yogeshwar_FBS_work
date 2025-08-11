#include<stdio.h>
int getprime();
void main() {
	
	
	if(getprime()==1)
	printf("Number is Prime");
	else
	printf("Number is not Prime");
	
	
}//main ends here

int getprime(){
		int num;
	printf("Enter the number:");
	scanf("%d",&num);
	for(int i=2;i<num;i++){
	
	if(num%i==0){
	return 0;

	}
	}return 1;
	
	
}