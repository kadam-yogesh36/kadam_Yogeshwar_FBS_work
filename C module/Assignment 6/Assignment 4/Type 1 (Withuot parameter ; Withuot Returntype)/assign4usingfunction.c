#include<stdio.h>
void	armstrong();
void	perfect();
void	menudriven();
void	strong();
void	prime();


void main(){
	armstrong();
	perfect();
	menudriven();
	strong();
	prime();
	
}


void armstrong(){
	printf("find armstrong in given range:\n");
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
}  //pallindrome ends here

//perfect start here
void perfect() {
printf("Find perfect in given range:\n");
	int no;
	printf("enter the range:");
	scanf("%d,",&no);
	for(int k=1;k<=no;k++){
	
	int num=k,i=1,sum=0;
	
	while(i<=num/2){
		
		if(num%i==0){
			sum=sum+i;
		}i++;
		
	}
	
	if(sum==num){
		printf("%d\n",k);
	}
}
}
//perfect ends here


//menudriven start here
void menudriven(){
	
	int sum=0;
	printf("<------------Menu Card---------->\n");
	printf("Enter 1----->Even or odd\n");
	printf("Enter 2----->Prime or Not\n");
	printf("Enter 3----->Pallindrome or Not\n");
	printf("Enter 4----->Positive negative or zero \n");
	printf("Enter 5----->Reverse a Number \n");
	printf("Enter 6----->Sum of digits \n \n ");
	int choice;
	int no;
		printf("Enter the Number:");
		scanf("%d",&no);
		printf("Enter your choice code:");
		scanf("%d",&choice);
	if(choice==1){
		
		if(no%2==0)
		
			printf("%d is Even",no);
			else
		     printf("%d is Odd",no);
		}
		else if(choice==2){
		
		int i=2,isprime=1;
		while(i<no){
			if(no%i==0)
		isprime=0;
			i++;
		}
		if(isprime==1)
		printf("%d is prime",no);
		else
		printf("%d Not prime",no);
		
	}else if(choice==3){
		int temp=no;
		while(no>0){
			int rem=no%10;
			sum=sum*10+rem;
			no=no/10;	
		}
		if(sum==temp)
		printf("%d is an pallindrome number",temp);
		else
			printf("%d is Not an pallindrome number",temp);
	}else if(choice==4)	{
	
		if(no>0)
		printf("%d is positive Number",no);
		else if(no<0)
		printf("%d is Negative Number",no);
		else
		printf("%d is zero",no);
	}	else if(choice==5){
	
		int temp=no;
		while(no>0){
			int rem=no%10;
			sum=sum*10+rem;
			no=no/10;
			
		}printf("%d Reverse is %d",temp,sum);
		
	}else if(choice==6){
	
		int temp=no;
		while(no>0){
			int rem;
			rem=no%10;
			sum=sum+rem;
			no=no/10;
			
			
		}printf("%d's sum of digits %d",temp,sum);
	}else
	printf("Invalid Choice");
	
}
	//menudriven ends here
	
	//strong start here
	
	void strong(){
		printf("Find strong in given range:\n");
	int num;
	printf("enter the range:");
	scanf("%d",&num);
	for(int k=1;k<=num;k++){
	
	int no=k,fact,digit=0,sum=0;

	
	int temp=no;
	while(temp>0){
		
		digit=temp%10;
		fact=1;
		
		for(int i=1;i<=digit;i++){
			
			fact = fact*i;
		}
		sum=sum+fact;
		temp=temp/10;
	}

	if(no == sum){
		printf("%d\n",k);
		
	}
}
}
//strong ends here

//prime start here
void prime() {
	printf("Find prime in given range:\n");
	int no;
	printf("enter the range:");
	scanf("%d",&no);
	for(int k=2; k<=no; k++) {

		int num=k;
		int isprime=1;
//	printf("Enter the number:");
//	scanf("%d",&num);

//


		for(int i=2; i<=num/2; i++) {
			if(num%i==0)
				isprime=0;
		}

		if(isprime==1) {
			printf("%d \n",k);
		} //else {
		//	printf("Not prime");
		//}
	}

}
//prime ends here