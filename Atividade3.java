import java.util.Scanner;
public class Atividade3
{
    public static void main(String[] args) {
        Scanner leitorEquacao = new Scanner(System.in);

        System.out.print("Digite o coeficiente a: ");
        double a = leitorEquacao.nextDouble();
        System.out.print("Digite o coeficiente b: ");
        double b = leitorEquacao.nextDouble();
        System.out.print("Digite o coeficiente c: ");
        double c = leitorEquacao.nextDouble();

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) {
            double raiz = -c / b;
            System.out.println("Essa é uma equação de primeiro grau. Raiz: " + raiz);
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            } else if (delta == 0) {
                double raiz = -b / (2 * a);
                System.out.println("Esta equação possui duas raízes reais iguais: " + raiz);
            } else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Esta equação possui duas raízes reais diferentes: " + raiz1 + " e " + raiz2);
            }
        }
        leitorEquacao.close();
    }
}