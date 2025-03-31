import java.util.Scanner;
public class Atividade2
{
    public static void main(String[] args) {
        Scanner leitorPagamento = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        int valorCompra = leitorPagamento.nextInt();

        System.out.print("Digite o valor pago: R$ ");
        int valorPago = leitorPagamento.nextInt();

        if (valorPago < valorCompra) {
            System.out.println("Quantia insuficiente para realizar a compra.");
        } else {
            int troco = valorPago - valorCompra;
            int[] notas = {50, 20, 10, 5, 2, 1};

            System.out.println("Troco: R$ " + troco);

            for (int nota : notas) {
                int quantidade = troco / nota;
                if (quantidade > 0) {
                    System.out.println("Notas de R$ " + nota + ": " + quantidade);
                }
                troco %= nota;
            }
        }

        leitorPagamento.close();
    }
}
