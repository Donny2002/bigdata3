/* ������ �������� - ������ ������ �迭 II
 * => ������ ������ �ּҿ� ���� ����� ������ �� �ִ�.
 *    �̸� ���� �޸𸮸� ���ƴٴϴ� ���� ���� �����ϴ�.
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void) {
	int a1[] = {101, 102, 103, 104, 105};

	int *p = a1;

	// �����͸� �迭ó�� ����ϱ�
	for (int i = 0; i < 5; i++) {
		printf("%d,", p[i]);
	}
	printf("\n");

	// �������� �ּҸ� ����Ͽ� �迭�� �׸��� ã��
	for (int i = 0; i < 5; i++) {
		printf("%d,", *(p + i));
	}
	printf("\n");


	return EXIT_SUCCESS;
}









