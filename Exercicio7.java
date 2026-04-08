import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);

        System.out.println("-- Conversor de Temperatura --");

        int opcao;

        do
        {
            System.out.println("\nEscolha a opção de conversão: \n1 - Celsius para Fahrenheit\n2 - Fahrenheit para Celsius");
            opcao = ler.nextInt();
                switch (opcao) 
                {
                    case 1:
                        System.out.println("Digite a temperatura em Celsius: ");
                        double celsius = ler.nextDouble();
                        double fahrenheit = (celsius * 9/5) + 32;
                        System.out.printf("\n%.2f °C é igual a %.2f °F", celsius, fahrenheit);
                        break;
                    case 2:
                        System.out.println("Digite a temperatura em Fahrenheit: ");
                        fahrenheit = ler.nextDouble();
                        celsius = (fahrenheit - 32) * 5/9;
                        System.out.printf("\n%.2f °F é igual a %.2f °C", fahrenheit, celsius);
                        break;
                    default:
                        System.out.println("\nOpção inválida, redigite!");
                }
        } while (opcao < 1 || opcao > 2);

        ler.close();
    }
}
