public class Exercicio1
{
    public static void main(String[] args)
    {
        int n1 = 7;
        int n2 = 4;
        int n3 = 10;

        int media = (n1 + n2 + n3) / 3;
        if(media >= 6)
        {
            System.out.println("Aprovado");
        }
        else if(media < 3)
        {
            System.out.println("Reprovado");
        }
        else
        {
            System.out.println("Recuperação");
        }
    }
}
