//Check the given number is Armstrong number or not..
//Input: n = 153
//Output: Armstrong
#include<stdio.h>
#include<math.h>
void main(){
	int no,digits=0,sum=0;
	printf("Enter the number:");
	scanf("%d",&no);
	int temp=no;
	while(temp>0){
	  temp=temp/10;
		digits++;
	}
	temp=no;
while(temp>0){
	int digit=temp%10;
	sum=sum+pow(digit,digits);
	temp=temp/10;
}
if(sum==no){
	printf("%d is An Armstrong number",no);
}else{
	printf("%d is not An Armstrong number",no);
}

}