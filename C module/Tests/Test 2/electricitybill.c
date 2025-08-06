#include<stdio.h>
void main(){
	int unit,bill;
	
	printf("enter the unit :");
	scanf("%d",&unit);
	
	if(unit<=50){
	
	bill=unit*30;
}
	else 
	if(unit>50&&unit<=150){
	
	bill=unit*40;
	}
	else{
	
	bill=50*unit;
}
	printf("total bill :%d",bill);
}
