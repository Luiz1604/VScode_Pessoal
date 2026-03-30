#include <stdio.h>
int main()
{
	float num;
	printf("Digite em numero: ");
	scanf("%f", &num);
	
	if(num<0)
	{
		num=num*(-1);
	}
	
	printf("Seu valor absoluto: %.2f", num);

    return 0;
}