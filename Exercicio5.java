import java.util.Scanner;

public class Exercicio5
{
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = ler.nextInt();

        boolean primo = true;

        if(num <= 1)
        {
            primo = false;
        }
        else
        {
            for(int i = 2; i < num; i++)
            {
                if(num % i == 0)
                {
                    primo = false;
                    break;
                }
            }
        }

        if(primo == true)
        {
            System.out.println("O número é primo!");
        }
        else
        {
            System.out.println("O número não é primo!");
        }

        ler.close();
    }
}
