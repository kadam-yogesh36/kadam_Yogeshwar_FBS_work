#include <stdio.h>


struct Book {
    char bname[50];
    int id;
    char author[50];
    float price;
};

void main() {
    struct Book b;

    
    printf("Enter Book Name: ");
    fgets(b.bname, sizeof(b.bname), stdin);  

    printf("Enter Book ID: ");
    scanf("%d", &b.id);

    getchar(); 

    printf("Enter Author Name: ");
    fgets(b.author, sizeof(b.author), stdin);

    printf("Enter Book Price: ");
    scanf("%f", &b.price);

    // Display values
    printf("\n--- Book Details ---\n");
    printf("Book Name   : %s", b.bname);
    printf("Book ID     : %d\n", b.id);
    printf("Author Name : %s", b.author);
    printf("Book Price  : %.2f\n", b.price);

  
}
