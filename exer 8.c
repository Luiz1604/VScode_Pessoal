#include <stdio.h>
int main()
{
    int num;
    int fatonum = 1;

    printf("Digite um numero: ");
    scanf("%d", &num);

    for(int i=num; i>1; i--)
    {
        fatonum *= i;
        printf("\n%d ", fatonum);
    }
    printf("\n\nFatorial: %d ", fatonum);

    return 0;
}