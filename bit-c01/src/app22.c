/* ������ - ���� �޸� ����
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int app22_f1() {
	// ���� �޸𸮸� �غ��Ѵ�.
	char* p = (char*) malloc(1000000);

	// ���� �޸𸮸� ����Ѵ�.
	// => ���� ���� �޸𸮿� ������ �о� ���̴� �ڵ尡 �ִٰ� ��������!
	// ...

	// => ���� �޸𸮿� ����� �����͸� ó���� �� �� ����� result�� �����ߴٰ� ��������!
	int result = 1;

	// �۾� ����� �����Ѵ�.
	return result;
}

int main(void) {

	// ���� �ʿ��� ������ app22_f1()�� ȣ���Ͽ� �۾��� �����ϴ� ���� ǥ���غ��ڴ�.
	printf("�۾����=%d\n", app22_f1());
	printf("�۾����=%d\n", app22_f1());
	printf("�۾����=%d\n", app22_f1());
	printf("�۾����=%d\n", app22_f1());
	printf("�۾����=%d\n", app22_f1());
	printf("�۾����=%d\n", app22_f1());

	return EXIT_SUCCESS;
}










