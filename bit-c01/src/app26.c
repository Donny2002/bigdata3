/* ������ ��� ���� ���� II
 * => �۷ι� ���� :
 *    - .c ���Ͽ��� �Լ� �ٱ��� ����� ����
 *    - �� ������ ����� ���Ͽ����� ������ �� �ִ�.
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int app26_sum = 0;

// �۷ι� ������ ����ϴ� �Լ�
void app26_plus(int value) {app26_sum += value;}
void app26_minus(int value) {app26_sum -= value;}

int main(void) {
	app26_plus(100);
	app26_plus(27);
	app26_plus(37);
	app26_minus(5);
	app26_minus(6);

	printf("�հ�=%d\n", app26_sum);

	return EXIT_SUCCESS;
}







