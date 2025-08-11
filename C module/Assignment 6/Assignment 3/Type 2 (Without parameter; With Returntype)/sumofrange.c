#include<stdio.h>

int getSumofrange();
void main(){


   
     printf(" sum is = %d",getSumofrange());
	
}//main ends here

int getSumofrange(){
		int no;
	printf("Enter the number:");
	scanf("%d",&no);
	int sum=0;
	int i=1;
	while(i<=no){
	sum=sum+i;
		i++;
	}
return sum;
}