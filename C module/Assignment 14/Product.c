//product(id,name,quantity,price)
#include<stdio.h>
typedef struct Product{
	int id;
	char name[50];
	int qty;
	float price;
}product;
void storeProduct(product* );
void display(product );
void main(){
	
	product p1;
	
	storeProduct(&p1);
	display(p1);
	
}//main ends here

void storeProduct(product* p){
	
	printf("-----Store Product Details--------\n");
	printf("Enter Product Id:");
	scanf("%d",&p->id);
	printf("Enter Product Name:");
	scanf(" %[^\n]",&p->name);
	printf("Enter Product Quantity:");
	scanf("%d",&p->qty);
	printf("Enter Product Price:");
	scanf("%f",&p->price);
}// Store Ends here

void display(product p){
	printf("\n--------Product  Details------------\n");
	printf("Product Id= %d  |  Product Name= %s  | Product Quantity=%d  | Product Price=%f  ",p.id,p.name,p.qty,p.price);
}

