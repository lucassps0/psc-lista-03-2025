import java.util.Scanner;
public class Atividade5 {
    public static void main(String[] args) {
        Scanner leitorOperacao = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = leitorOperacao.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = leitorOperacao.nextDouble();

        System.out.print("Digite a operação (+, -, *, /, ^): ");
        String operador = leitorOperacao.next();

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    operacaoValida = false;
                }
                break;
            case "^":
                resultado = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Operação inválida.");
                operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.println("Resultado: " + resultado);
        }
        leitorOperacao.close();
    }
}