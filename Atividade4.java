import java.util.Scanner;
public class Atividade4
{
    public static void main(String[] args)
    {
        Scanner leitorOperacao = new Scanner(System.in);

        System.out.print("Escolha a operação (1 - Perímetro, 2 - Área, 3 - Volume): ");
        int operacao = leitorOperacao.nextInt();

        System.out.print("Digite o raio: ");
        double raio = leitorOperacao.nextDouble();

        if (operacao == 1) {
            double perimetro = 2 * Math.PI * raio;
            System.out.println("Perímetro do círculo: " + perimetro);
        } else if (operacao == 2) {
            double area = Math.PI * Math.pow(raio, 2);
            System.out.println("Área do círculo: " + area);
        } else if (operacao == 3) {
            double volume = (4 / 3.0) * Math.PI * Math.pow(raio, 3);
            System.out.println("Volume da esfera: " + volume);
        } else {
            System.out.println("Operação inválida.");
        }
        leitorOperacao.close();
    }
}