#include<stdio.h>
int getarmstrong();
int power();
void main(){
	
int result= getarmstrong();
 if(result==1)
 printf("Number is armstrong");
 else
 printf("Number not an armstrong");
}//main ends here

int getarmstrong(){
    int no;
printf("Enter the number:");
scanf("%d",&no);
int temp=no,digits=0;
while(no>0){
    no=no/10;
    digits++;
}
no=temp;
	int sum=0;
	while(no>0){
	
	int digit=no%10;
	sum=sum+power(digit,digits);
	no=no/10;	
}if(temp==sum)
     return 1;
     else
     return 0;

}//getarmstrong ends here

int power(int digit,int digits){
	int res=1;
	for(int i=1;i<=digits;i++){
		res=res*digit;}
		return res;
}//power end here