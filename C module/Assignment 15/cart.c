#include <stdio.h>
#include <string.h>

#define MAX_PRODUCTS 5
#define MAX_CART 20


struct Product {
    char name[50];
    float price;
    int quantity;
};


void displayProducts(struct Product products[], int n) {
    printf("\n--- Available Products ---\n");
    for (int i = 0; i < n; i++) {
        printf("%d. %s - Rs. %.2f (Stock: %d)\n", 
                i + 1, products[i].name, products[i].price, products[i].quantity);
    }
}

void main() {
    struct Product products[MAX_PRODUCTS] = {
        {"Apple", 50.0, 20},
        {"Banana", 10.0, 50},
        {"Milk", 40.0, 30},
        {"Bread", 25.0, 15},
        {"Eggs (Dozen)", 60.0, 10}
    };

    struct Product cart[MAX_CART];
    int cartCount = 0;
    float total = 0;
    int choice, qty;

    printf("=== Simple Point of Sale System ===\n");

    while (1) {
        displayProducts(products, MAX_PRODUCTS);

        printf("\nEnter product number to add to cart (0 to checkout): ");
        scanf("%d", &choice);

        if (choice == 0) break;  

        if (choice < 1 || choice > MAX_PRODUCTS) {
            printf("Invalid choice! Try again.\n");
            continue;
        }

        printf("Enter quantity: ");
        scanf("%d", &qty);

        if (qty <= 0 || qty > products[choice - 1].quantity) {
            printf("Invalid quantity! Available stock: %d\n", products[choice - 1].quantity);
            continue;
        }

      
        strcpy(cart[cartCount].name, products[choice - 1].name);
        cart[cartCount].price = products[choice - 1].price;
        cart[cartCount].quantity = qty;
        cartCount++;

        
        products[choice - 1].quantity -= qty;

        printf("Added %d x %s to cart.\n", qty, products[choice - 1].name);
    }


    printf("\n=== Checkout ===\n");
    if (cartCount == 0) {
        printf("Cart is empty. No items purchased.\n");
    } else {
        for (int i = 0; i < cartCount; i++) {
            float cost = cart[i].price * cart[i].quantity;
            printf("%d. %s x %d = Rs. %.2f\n", i + 1, cart[i].name, cart[i].quantity, cost);
            total += cost;
        }
        printf("\nTotal Amount: Rs. %.2f\n", total);
    }

    printf("Thank you for shopping!\n");
    
}
