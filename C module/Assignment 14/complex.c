#include <stdio.h>


struct Complex {
    float real;
    float imag;
};


struct Complex inputComplex() {
    struct Complex c;
    printf("Enter real part: ");
    scanf("%f", &c.real);
    printf("Enter imaginary part: ");
    scanf("%f", &c.imag);
    return c;
}


void displayComplex(struct Complex c) {
    if(c.imag >= 0)
        printf("Complex Number: %.2f + %.2fi\n", c.real, c.imag);
    else
        printf("Complex Number: %.2f - %.2fi\n", c.real, -c.imag);
}

void main() {
    struct Complex c1, c2;

    printf("Enter first complex number:\n");
    c1 = inputComplex();

    printf("\nEnter second complex number:\n");
    c2 = inputComplex();

    printf("\nFirst ");
    displayComplex(c1);

    printf("Second ");
    displayComplex(c2);

    
}
