import java.util.Scanner;

public class GrandeDeposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        if (valor > 0) {
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Saldo atual: R$ " + String.format("%.2f", valor));
            //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
        } else if (valor == 0) {
            System.out.println("Encerrando o programa...");
            //TODO: Imprimir a mensagem de valor inválido.
        } else {
            System.out.println("Valor invalido! Digite um valor maior que zero.");
            //TODO: Imprimir a mensagem de encerrar o programa.
        }
    }
}