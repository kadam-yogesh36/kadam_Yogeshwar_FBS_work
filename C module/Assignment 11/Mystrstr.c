#include <stdio.h>

char *mystrstr(char haystack[], char needle[]) {
    int i, j;
    if (needle[0] == '\0')
        return haystack;
    for (i = 0; haystack[i] != '\0'; i++) {
       
        if (haystack[i] == needle[0]) {
           
            for (j = 0; needle[j] != '\0'; j++) {
                if (haystack[i + j] != needle[j])
                    break;
            }


            if (needle[j] == '\0')
                return &haystack[i];   
        }
    }

    
    return NULL;
}

void main() {
    char text[] = "Hello World, Welcome!";
    char sub[] = "World";

    char *res = mystrstr(text, sub);
    if (res)
        printf("Found: %s\n", res);
    else
        printf("Not found\n");

}
