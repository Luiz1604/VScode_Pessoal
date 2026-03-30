#include <stdio.h>
int main()
{
    int num;
    int cont = 0;
    int soma = 0;

    printf("Digite um numero: ");
    scanf("%d", &num);

    int max = num + (num - 1);

    for(int i = 1; i <= max; i++)
    {
        cont++;
        if (cont % 2 != 0)
        {
            soma+=cont;
        }
    }

    printf("Seu numero ao quadrado: %d", soma);

    return 0;
}