//WAP to Calculate the Number of Words Present in a String
#include <stdio.h>
#include <string.h>

int main() {
    char str[200];
    int i, words = 0;

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin); 

    int length = strlen(str);

    for (i = 0; i < length; i++) {
        
        if ((str[i] != ' ' && str[i] != '\n' && str[i] != '\t') &&
            (i == 0 || str[i-1] == ' ' || str[i-1] == '\n' || str[i-1] == '\t')) {
            words++;
        }
    }

    printf("Number of words = %d\n", words);

    return 0;
}
