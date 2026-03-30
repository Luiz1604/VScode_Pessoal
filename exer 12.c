#include <stdio.h>
int main()
{
    float nota1, nota2, media;
    printf("Digite a primeira nota do aluno: ");
    scanf("%f", &nota1);
    
    printf("Digite a segunda nota do aluno: ");
    scanf("%f", &nota2);

    media = (nota1 + nota2) / 2;

    if(media >= 5)
    {
        printf("Aluno aprovado com media: %.2f", media);
    }
    else if(media < 3)
    {
        printf("Aluno reprovado com media: %.2f", media);
    }
    else
    {
        printf("Aluno de recuperacao com media: %.2f", media);
    }
}