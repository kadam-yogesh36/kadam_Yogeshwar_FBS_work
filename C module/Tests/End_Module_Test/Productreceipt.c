#include <stdio.h>
typedef struct Product {
    int id;
    char name[50];
    float price;
}Product;
void storeProduct( Product *p) {
    printf("Enter Product ID: ");
    scanf("%d", &p->id);

    printf("Enter Product Name: ");
    scanf("%s", p->name);

    printf("Enter Product Price: ");
    scanf("%f", &p->price);
}


float getBill(float price) {
    float discount, discountedPrice, gst, finalPrice;

    if (price>500)
        discount = price*0.20;   
    else
        discount = price*0.05;  
    discountedPrice = price-discount;
    gst = discountedPrice*0.18;
    finalPrice = discountedPrice + gst;

    return finalPrice;
}


void displayProduct(struct Product p) {
    float discount, discountedPrice, gst, finalPrice;

    if (p.price>500)
        discount=p.price*0.20;
    else
        discount =p.price*0.05;

    discountedPrice = p.price-discount;
    gst = discountedPrice*0.18;
    finalPrice = discountedPrice+gst;

    printf("\n--- Product Bill ---\n");
    printf("Product ID      : %d\n", p.id);
    printf("Product Name    : %s\n", p.name);
    printf("Original Price  : %f\n", p.price);
    printf("Discount Applied: %f\n", discount);
    printf("Price After Disc: %f\n", discountedPrice);
    printf("GST (18%%)       : %f\n", gst);
    printf("Final Price     : %f\n", finalPrice);
}

void main() {
    int n, i;
    printf("Enter number of products: ");
    scanf("%d", &n);

    struct Product products[n];
    float Total = 0;

    
    for (i = 0; i < n; i++) {
        printf("\nEnter details for Product %d\n", i + 1);
        storeProduct(&products[i]);
    }

    printf("\n=========== BILL DETAILS ===========\n");

    for (i = 0; i < n; i++) {
        displayProduct(products[i]);
        Total += getBill(products[i].price);
    }

    printf("\n=========== GRAND TOTAL ===========\n");
    printf("Total Amount to Pay: %.2f\n",Total);

    
}
