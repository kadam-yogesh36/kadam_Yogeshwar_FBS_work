#include<stdio.h>
struct student{
	int rollno;
	char name[20];
	int marks;
};
void main(){
	
	struct student s1,s2;
	
	s1.rollno=101;
    strcpy(s1.name,"yogesh");
      s1.marks=75;
      
      printf("Roll No= %d\nStudent Name:%s\nMarks:%d",s1.rollno,s1.name,s1.marks);
      
      printf("\nEnter  Details Student 2\n");
      printf("Roll No:");
      scanf("%d",&s2.rollno);
      printf("Student name :");
      scanf("%s",s2.name);
      printf("Student Marks:");
      scanf("%d",&s2.marks);
      
      printf("Roll No= %d\nStudent Name:%s\nMarks:%d",s2.rollno,s2.name,s2.marks);
}