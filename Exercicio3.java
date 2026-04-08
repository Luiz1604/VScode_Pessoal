import java.util.Scanner;

public class Exercicio3 
{
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num = ler.nextDouble();

        if(num > 0)
        {
            System.out.println("Seu número é positivo");
        }
        else if(num < 0)
        {
            System.out.println("Seu número é negativo");
        }
        else
        {
            System.out.println("Seu número é zero");
        }

        ler.close();
    }
}
