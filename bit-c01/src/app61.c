/* ����ü - ��Ʈ �ʵ�
 * => ����ü ����� ũ�⸦ �����ϰ� ������ �� ����Ѵ�.
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void) {
	struct flag {
		unsigned int c;
		unsigned int cpp;
		unsigned int java;
		unsigned int python;
	} f1;

	printf("struct flag�� ũ��=%d\n", sizeof(struct flag));
	f1.c = 1;
	f1.cpp = 1;
	f1.java = 1;
	f1.python = 1;
	printf("%d,%d,%d,%d\n", f1.c, f1.cpp, f1.java, f1.python);

	// c, cpp, java, python ���α׷��� ���� ���θ� �����ϱ� ����
	// ������ ���� int ������ �����Ͽ���.
	// ���� ���� ������ ������ �����ؾ� �Ѵ�.
	// ������1 - �޸𸮸� �ʹ� ���� ���� �Ѵ�.
	// ������2 - 1�� 0���� ǥ���Ǵ� ���� �ְ� �����Ⱑ ���ŷӴ�.

	// �̷��� ���� ���� ���� ���� �ٷ�� �޸� ���� �����ϱ� ���� ������ ������ ��Ʈ �ʵ��̴�.
	struct flag {
		unsigned int c;
		unsigned int cpp;
		unsigned int java;
		unsigned int python;
	} f1;

	return EXIT_SUCCESS;
}







