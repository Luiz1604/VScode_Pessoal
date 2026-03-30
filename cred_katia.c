/*Uma empresa de energia precisa analisar o consumo mensal de eletricidade de algumas residências.

Leia  a quantidade de casas que serão analisadas (máximo 50). Exemplo, N.
Utilize um array para armazenar o consumo de cada residência em kWh (somente valores positivos).
O programa deve garantir consistência: caso o usuário informe um valor negativo ou zero, solicitar nova entrada.

Crie funções para:
void lerConsumo(float consumo[], int n) -> responsável por ler os dados com validação.
float calcularMedia(float consumo[], int n) -> retorna o consumo médio.
float maiorConsumo(float consumo[], int n) -> retorna o maior valor.
float menorConsumo(float consumo[], int n) -> retorna o menor valor.
int acimaDaMedia(float consumo[], int n, float media) -> retorna quantas casas ficaram acima da média.

Após a leitura, o programa deve exibir:
O consumo médio das residências.
O maior e o menor consumo registrados.
Quantas casas consumiram acima da média.*/

#include <stdio.h>
#define MAX 50

void LerConsumo(float consumo[], int n)
{
	for(int i=0; i<n; i++)
	{
		printf("digite o consumo de energia da %d casa em kwh: ", i+1);
		scanf("%f", &consumo[i]);
		
		while(consumo[i] <= 0)
		{
			printf("\n\n == valor invalido! == redigite: ");
			scanf("%f", &consumo[i]);
		}
	}
}

float CalcularMedia(float consumo[], int n)
{
	float media = 0;
	
	for(int i=0; i<n; i++)
	{
		media += consumo[i];
	}
	
	media /= n;
	
	return media;
}

float MaiorConsumo(float consumo[], int n)
{
	float maior = consumo[0];
	
	for(int i=0; i<n; i++)
	{
		if(consumo[i] > maior)
		{
			maior = consumo[i];
		}
	}
	
	return maior;
}

float MenorConsumo(float consumo[], int n)
{
	float menor = consumo[0];
	
	for(int i=0; i<n; i++)
	{
		if(consumo[i] < menor)
		{
			menor = consumo[i];
		}
	}
	
	return menor;
}

int AcimaDaMedia(float consumo[], int n, float media)
{
	int cont = 0;
	
	for(int i=0; i<n; i++)
	{
		if(consumo[i] > media)
		{
			cont++;
		}
	}
	
	return cont;
}

int main()
{
	int n;
	
	printf("\ndigite a quantidade de casas para a analise: ");
	scanf("%d", &n);
	
	while(n > MAX || n <= 0)
	{
		printf("\n\n == Valor invalido! == redigite: ");
		scanf("%d", &n);
	}
	
	float consumo[n];
	
	LerConsumo(consumo, n);
	
	float media = CalcularMedia(consumo, n);
	float maior = MaiorConsumo(consumo, n);
	float menor = MenorConsumo(consumo, n);
	int acima = AcimaDaMedia(consumo, n, media);
	
	 printf("\n--- Relatorio De Consumo ---\n");
    printf("Consumo medio: %.2f kWh\n", media);
    printf("Maior consumo: %.2f kWh\n", maior);
    printf("Menor consumo: %.2f kWh\n", menor);
    printf("Casas acima da media: %d\n", acima);
	
	return 0;
}