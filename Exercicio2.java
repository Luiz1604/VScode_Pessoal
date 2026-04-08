public class Exercicio2 
{
    public static void main(String[] args)
    {
        int peso = 60;
        float alt = 1.65f;
        float imc = peso / (alt * alt);

        System.out.printf("IMC: %.2f", imc);

        if(imc < 18.5)
        {
            System.out.println("\nAbaixo do peso");
        }
        else if(imc >= 18.5 && imc < 25)
        {
            System.out.println("\nPeso normal");
        }
        else if(imc >= 25 && imc < 30)
        {
            System.out.println("\nSobrepeso");
        }
        else
        {
            System.out.println("\nObesidade");
        }
    }
}
