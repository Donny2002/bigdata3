/* scanf() - Ű���� �Է� �ޱ� III
 * => scanf(���˹��ڿ�, ���� ���� �޸��� �ּ�, ...);
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void) {
	char name[50];
	int age;

	printf("name age?");
	scanf("%s %d", name, &age);

	printf("%s, %d\n", name, age);

	return EXIT_SUCCESS;
}







