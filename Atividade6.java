import java.util.Scanner;
import java.util.Random;
public class Atividade6 {
    public static void main(String[] args) {
        Scanner leitorNumeros = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = leitorNumeros.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = leitorNumeros.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        Random sorteador = new Random();
        int numeroSorteado = sorteador.nextInt(maior - menor + 1) + menor;

        System.out.println("Número sorteado: " + numeroSorteado);

        if (numeroSorteado % 2 == 0) {
            System.out.println("O número sorteado é par.");
        } else {
            System.out.println("O número sorteado é ímpar.");
        }
        leitorNumeros.close();
    }
}
