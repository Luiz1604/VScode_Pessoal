
public class Exercicio9
{
    public static void main(String[] args)
    {
        int n = 10;

        int anterior = 0;
        int atual = 1;

        System.out.println("Sequência de Fibonacci:\n");

        for(int i = 1; i <= n; i++)
        {
            System.out.printf("%d \n", anterior);

            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
}
