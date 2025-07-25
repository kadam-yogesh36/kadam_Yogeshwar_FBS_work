//Write a C program to find the square and cube of a given number. 
#include<stdio.h>
void main(){
int num;
printf("Enter the number:");
scanf("%d",&num);

int square=num*num;
int cube=num*num*num;
printf("The Sqaure is: %d\n The Cube is : %d",square,cube);

}