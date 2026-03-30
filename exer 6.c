#include <stdio.h>
int main()
{
	int num;
	printf("Digite um numero: ");
	scanf("%d", &num);
	
	if(num % 2 == 0)
	{
		printf("Seu numero eh par!");
	}
	else
	{
		printf("Seu numero eh impar!");
	}
	return 0;
}