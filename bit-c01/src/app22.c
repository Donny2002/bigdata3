/* ������ - ���� �޸� ����
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int app22_f1() {
	// ���� �޸𸮸� �غ��Ѵ�.
	char* p = (char*) malloc(10000000);

	// ���� �޸𸮸� ����Ѵ�.
	// => ���� ���� �޸𸮿� ������ �о� ���̴� �ڵ尡 �ִٰ� ��������!
	// ...

	// => ���� �޸𸮿� ����� �����͸� ó���� �� �� ����� result�� �����ߴٰ� ��������!
	int result = 1;

	// �۾� ����� �����Ѵ�.
	return result;
}

int main(void) {

	char str[10];

	// ���� �ʿ��� ������ app22_f1()�� ȣ���Ͽ� �۾��� �����ϴ� ���� ǥ���غ��ڴ�.
	for (int i = 0; i < 10; i++) {
		printf("result=%d\n", app22_f1());

		puts("continue?(y/n)");
		scanf("%s", str);
		if (strcmp(str, "y") == 0)
			break;
	}

	return EXIT_SUCCESS;
}










