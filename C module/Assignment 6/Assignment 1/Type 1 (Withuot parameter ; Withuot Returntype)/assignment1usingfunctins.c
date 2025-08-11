#include<stdio.h>


void 	Evenodd();
void 	yearleapornot();
void 	pallindrome();
void 	salaryslip();
void 	loweruppercase();
void 	vote() ;
void 	vowelorcon();

void main() {
	Evenodd();
	yearleapornot();
	pallindrome();
	salaryslip();
	loweruppercase();
	vote() ;
	vowelorcon();

}

//evenodd start here
void Evenodd() {
printf("you check no is even or odd\n");
	int Num;
	printf("Enter the number: ");

	scanf("%d",&Num);

	if(Num%2==0) {
		printf("Even Number\n");
	} else {
		printf("Odd Number\n");
	}
}//evenodd end here



// leapyear start here
void yearleapornot() {
	printf("you check year is leap or not\n");
	int year;

	printf("Enter a year: ");
	scanf("%d", &year);
	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		printf("%d is a Leap Year.\n", year);
	} else {
		printf("%d is NOT a Leap Year.\n", year);
	}
}//leap end here

//pallindrome start here
void pallindrome() {
	printf("you check no pallindrome or not\n");
	int number,r1,r2,r3,q1;
	printf("Enter the number:");
	scanf("%d",&number);
	r1=number%10;
	q1=number/10;
	r2=q1%10;
	r3=q1/10;

	if(r1==r3) {
		printf("%d  is palindrome number\n",number);
	} else {
		printf("%d is Not palindrome number\n",number);
	}
}// pallindrome ends here

//salaryslip start here
void salaryslip() {
	printf("you print your salaryslip\n");
	int Salary,TA,DA,HRA,total;
	printf("Enter your basic Salary: ");
	scanf("%d",&Salary);

	if(Salary<=5000) {
		DA=((Salary*10)/100);
		TA=((Salary*20)/100);
		HRA=((Salary*25)/100);


	} else {
		DA=((Salary*15)/100);
		TA=((Salary*25)/100);
		HRA=((Salary*30)/100);


	}
	total=Salary+DA+TA+HRA;
	printf("DA: %d\n",DA);
	printf("TA: %d\n", TA);
	printf("HRA: %d\n", HRA);
	printf("Total Salary: %d\n", total);

}
//salaryslip ends here

//loweruppercase start
void loweruppercase() {
	printf("you check character is uppercase or lowercase\n");
	char ch;
	printf("Enter character: ");
	scanf(" %c",&ch);

	if(ch>='A' && ch<='Z') {
		printf("Upeercase character\n");
	} else if(ch>='a' && ch<='z') {

		printf("Lowercase character\n");

	} else {
		printf("The character is not an alphabet letter\n.");
	}
}
//loweruppercase ends here


//vote start here
void vote() {
	printf("you  check age eligible for voting yes or not\n");
	int Age;
	printf("Enter Age: ");
	scanf("%d",&Age);

	if(Age>=18) {
		printf("Eligible for voting\n");
	} else {
		printf("Not eligible for vote\n");
	}
}
//vote end here

//vowelorcon start here
void vowelorcon() {
	printf("you check character is vowel or consonant\n");
	char cha;
	fflush(stdin);
	printf("Enter character: ");
	scanf("%c",&cha);
	fflush(stdin);

	if(cha=='a'||cha=='e'||cha=='i'||cha=='o'||cha=='u'||cha=='A'||cha=='E'||cha=='I'||cha=='O'||cha=='U') {
		printf("Vowel\n");
	} else {
		printf("Consonant\n");
	}

}
//vowelorcon end here