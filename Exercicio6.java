import java.util.Scanner;

public class Exercicio6
{
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num = ler.nextDouble();

        double tabuada;
        System.out.println("\n-- Tabuada --");

        for(int i = 1; i <= 10; i++)
        {
            tabuada = num * i;
            System.out.printf("\n%.2f x %d = %.2f\n", num, i, tabuada);
        }

        ler.close();
    }
}
