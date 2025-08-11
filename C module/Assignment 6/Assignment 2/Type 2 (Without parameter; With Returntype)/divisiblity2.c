//Accept a number and check if it is divisible by 3, 5, or both.
//(Print "Divisible by 3 but not by 5" or "Divisible by 5 but not by 3" or "Divisible by
//both" or” Divisible by None”)
#include<stdio.h>
int Divisiblity();
void main(){
 int res =Divisiblity();
 if(res==1)
 printf("Divisible by both");
 else if(res==2)
 	printf("divisible by 3 but not 5");
 	else if(res==3)
 		printf("Divisible by 5 but not by 3");
 		else
 		printf("Divisible by  none");
}
int Divisiblity(){
		int num;
	printf("Enter the number:");
	scanf("%d",&num);
	if(num%3==0&&num%5==0){
		return 1;
	}else if(num%3==0&&num%5!=0){
	return 2;
	}else if(num%5==0&&num%3!=0){
	return 3;
	}else{
		return 4;
	}
}