#include <stdio.h>
int reverse(int no, int rev) {
	if (no == 0)
		return rev;
			return reverse(no/10,rev*10+no%10);
}

void main() {
	int no;
	printf("Enter Number: ");
	scanf("%d", &no);
	int res = reverse(no, 0);
	printf("Reversed Number: %d\n", res);


}
