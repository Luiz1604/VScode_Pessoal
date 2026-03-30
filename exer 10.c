#include <stdio.h>

int main()
{
    int n;
    int a = 1, b = 1, c;

    printf("Digite n (n >= 3): ");
    scanf("%d", &n);

    while(n < 3)
    {
        printf("Valor invalido. Digite n (n >= 3): ");
        scanf("%d", &n);
    }

    for(int i = 3; i <= n; i++)
    {
        c = a + b;
        a = b;
        b = c;
    }

    printf("O %d termo da serie de Fibonacci eh: %d\n", n, b);

    return 0;
}