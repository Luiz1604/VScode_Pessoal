import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Calculadora Simples");

        System.out.println("Digite o primeiro número: ");
        double num1 = ler.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = ler.nextDouble();

        int operacao;

        do
        {
            System.out.println("\nSelecione a operação: \n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
            operacao = ler.nextInt();

            switch (operacao) 
            {
                case 1:
                    double soma = num1 + num2;
                    System.out.printf("\nA soma é: %.2f", soma);
                    break;
                case 2:
                    double sub = num1 - num2;
                    System.out.printf("\nA subtração é: %.2f", sub);
                    break;
                case 3:
                    double mult = num1 * num2;
                    System.out.printf("\nA multiplicação é: %.2f", mult);
                    break;
                case 4:
                    double div = num1 / num2;
                    System.out.printf("\nA divisão é: %.2f", div);
                    break;
                default:
                    System.out.println("\nOperação inválida, redigite!");
            }
        } while (operacao < 1 || operacao > 4);

        ler.close();
    }
}
