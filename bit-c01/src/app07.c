/* ������ �������� - �迭
 * => ���� Ÿ���� �޸𸮸� ���� �� ���� �� ����Ѵ�.
 */

#include <stdio.h>
#include <stdlib.h>

int main07(void) {
	int scores[5];
	int a = 100;

	scores[0] = 100;
	scores[1] = 90;
	scores[2] = 80;
	scores[3] = 70;
	scores[4] = 60;

	printf("%d, %d, %d, %d, %d\n",
			scores[0], scores[1], scores[2], scores[3], scores[4]);

	// �迭�� ũ�⸦ �����?
	// => ������ OK.
	// => ���൵ ���� OK! �̰� ������!
	//    �޸��� ��� ������ ����� �����ϰ� ó������ �ʴ´�.
	//
	scores[5] = 50; // ���� �� �ڵ�� ������ �Ǿ�� �Ѵ�. ���� �̷��� �ڵ����� ����!
	printf("%d\n", scores[5]);

	printf("%d\n", a);

	return EXIT_SUCCESS;
}



