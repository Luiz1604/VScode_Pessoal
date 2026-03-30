#include <stdio.h>
int main()
{
    float salario;
    printf("Digite o salario do funcionario: ");
    scanf("%f", &salario);

    float reajuste = 5.0/100.0 * salario;
    float salariofinal = salario + reajuste;

    if(salariofinal < 850)
    {
        salariofinal += 100;
    }
    
    printf("Salario final: %.2f", salariofinal);
    
    return 0;
}
