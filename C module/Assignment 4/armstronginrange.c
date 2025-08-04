#include<stdio.h>
void main(){
	int num;
	printf("enter the range:");
	scanf("%d",&num);
	for(int k=1;k<=num;k++)
	  {
		int no=k;
		
		int temp=no;
		int count=0;
		while(no>0)
		{
			count++;
			no=no/10;
		}
		no=temp;
		int sum=0,rem;
		while(no>0)
		{    
			rem=no%10;
		
			int res=1;
			for(int i=1;i<=count;i++){
			
			
			
				res=res*rem;}
				sum=sum+res;
				no=no/10;
			
			
			
		}
		if(sum==temp)
			
			printf("%d is an armstrong number\n",temp);
		
	

}
}  
