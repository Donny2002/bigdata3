/* v03 => �ڵ带 �Լ��� �ɰ���.
 * v02 => �Է� ���� ���� ����Ͽ� ����� ����Ѵ�.
 * v01 => ����ڷκ��� ���� �Է� �޴´�.
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// �Լ� ������Ÿ�� ����
void prompt(char *);
void compute();

// ���� �Լ����� ����� �� �ֵ��� �۷ι� ������ �����.
int a, b;
char op;
float result;

int main(void) {

	prompt("input: ");

	compute();

	printf("result: %f\n", result);

	return EXIT_SUCCESS;
}

void prompt(char *message) {
	printf(message);
	scanf("%d %c %d", &a, &op, &b);
}

void compute() {
	switch (op) {
	case '+': result = a + b; break;
	case '-': result = a - b; break;
	case '*': result = a * b; break;
	case '/': result = a / (float)b; break;
	case '%': result = a % b; break;
	default:
		printf("'%c' �����ڴ� �������� �ʽ��ϴ�.", op);
	}
}






