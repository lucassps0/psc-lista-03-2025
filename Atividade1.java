import java.util.Scanner;
public class Atividade1
{
    public static void main(String[] args) {
        Scanner leitorNumeros = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = leitorNumeros.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = leitorNumeros.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = leitorNumeros.nextInt();

        int maior = Math.max(numero1, Math.max(numero2, numero3));
        int menor = Math.min(numero1, Math.min(numero2, numero3));
        double media = (numero1 + numero2 + numero3) / 3.0;

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média: " + media);

        leitorNumeros.close();
    }
}