import java.util.Scanner;

public class Exercicio8
{
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = ler.nextInt();

        int fatorial = 1;

        for(int i = 1; i <= num; i++)
        {
            fatorial *= i;
        }

        System.out.printf("O fatorial de %d é: %d", num, fatorial);

        ler.close();
    }
}
