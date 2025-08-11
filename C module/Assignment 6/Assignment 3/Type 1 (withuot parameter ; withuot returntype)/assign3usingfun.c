#include<stdio.h>

void armstong();
void factorial();
void fdldsum();
void pallindrome();
void perfect();
void prime();
void print1to10();
void rangesum();
void strong();
void table();

void main(){
    armstong();
    factorial();
    fdldsum();
    pallindrome();
     perfect();
     prime();
     print1to10();
     rangesum();
     strong();
      table();
}
//main ends here


void armstong(){
	printf("check no is armstrong or not:\n");

int no;
printf("Enter the number:");
scanf("%d",&no);
	int digits=0,digit,sum=0;
	
	int temp=no;
	while(no>0){
	  no=no/10;
		digits++;
	}
	no=temp;
while(no>0){
	int res=1;
	int digit=no%10;
	for(int i=1;i<=digits;i++){
		res=res*digit;}
		sum=sum+res;
	
	no=no/10;
}
if(sum==temp){
	printf("%d Armstrong number\n",temp);
}else{
	printf(" %d not  Armstrong number\n",temp);
}

}
//armstrong ends here


//factorial start here
void factorial() {
	printf("check factorial:\n");
	int i=1,num,fact=1;
	printf("Enter the number:");
	scanf("%d",&num);

	while(i<=num) {
		fact=fact*i;
		i++;

	}
	printf("The factorial of %d is =%d\n",num,fact);
}
//factorial start here

//fdldsum start here
void fdldsum(){
	printf("Sum of fd and ld:\n");
	int no,fd,ld;
	printf("Enter the Number:");
	scanf("%d",&no);
	ld=no%10;
	fd=no;
	while(fd>10){
		fd=fd/10;
		
	}
	int sum=fd+ld;
	printf("Sum of first and last digit of %d number is:%d\n",no,sum);
	
	
	
}
//fdld ends here

//pallinrome start here


void pallindrome(){
	printf("check no is pallindrome or not:\n");
	int no,i=1,rev=0;
	printf("Enter the Number:");
	scanf("%d",&no);
	int temp=no;
	while(temp>0){
		int rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
		
	}
if(rev==no){
	printf("%d is palindrome number\n",no);
}else{
	printf("%d is not  palindrome number\n",no);
}
}
//pallinrome start here

//perfect no ends here

void perfect() {
	printf("check no is perfect or not:\n");
	int num,i=1,sum=0;
	
	printf("Enter the number:");
	scanf("%d",&num);
	
	while(i<=num/2){
		
		if(num%i==0){
			sum=sum+i;
		}i++;
		
	}printf("sum is=%d\n",sum);
	
	if(sum==num){
		printf("%d is perfect number\n",num);
	}else{
		printf("%d is not perfect number\n",num);
	}
}
//perfect no ends here



//prime start here
void prime() {
	printf("check no is prime or not:\n");
	int num;
	int isprime=1,i=2;
	printf("Enter the number:");
	scanf("%d",&num);

    while(i<num-1){

    	if(num%i==0)
    isprime=0;
		i++;
	}

//	for(int i=2; i<=num/2; i++) {
//		if(num%i==0)
//			isprime=0;
//	}

	if(isprime==1) {
		printf("Prime Number\n");
	} else {
		printf("Not prime\n");
	}

}

//prime ends here
//printf range start here
void print1to10(){
	printf("print 1 to 10:\n");
	int i=1;
	while(i<=10){
		printf("%d \n",i);
		i++;
	}
}
//printrange ends here
//strong number start here

void strong(){
	printf("check no is strong or not:\n");
	int no,fact,digit=0,sum=0;
	printf("Enter the number:");
	scanf("%d",&no);
	
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
		printf("%d is an strong number\n",no);
		
	}else{
			printf("%d is not an strong number\n",no);
	}
	
}

//strong number end here
// sum of given range strat here
void rangesum(){
	printf("calculate sum of given range:\n");
	int i=1,no,sum=0;
	printf("Enter the number:");
	scanf("%d",&no);
	while(i<=no){
		sum=sum+i;
		i++;
	}
	printf("sum is: %d\n",sum);
	
}
// sum of given range strat here

//table start here
void table(){
	printf("print Table:\n");
	int no=5,i=1;
	printf("Table of 5:\n");
		while(i<=10){
		printf("5 * %d = %d\n",i,5*i);
		i++;
		
	}
}	// table ends here