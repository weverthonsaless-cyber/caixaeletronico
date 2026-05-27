import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String nome;
        double saldoInicial, saldoFinal, valor;
        int opcao;

        System.out.println("=== CAIXA ELETRÔNICO ===");

        // Nome do usuário
        System.out.print("Digite seu nome: ");
        nome = leia.nextLine();

        // Saldo inicial
        System.out.print("Digite o saldo da conta: ");
        saldoInicial = leia.nextDouble();

        saldoFinal = saldoInicial;

        // Menu
        System.out.println("\n1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.print("Escolha uma opção: ");
        opcao = leia.nextInt();

        // Saque
        if (opcao == 1) {

            System.out.print("Digite o valor do saque: ");
            valor = leia.nextDouble();

            if (valor <= saldoFinal) {
                saldoFinal = saldoFinal - valor;

                System.out.println("\n=== COMPROVANTE ===");
                System.out.println("Nome: " + nome);
                System.out.println("Saldo inicial: R$ " + saldoInicial);
                System.out.println("Valor sacado: R$ " + valor);
                System.out.println("Saldo final: R$ " + saldoFinal);

            } else {
                System.out.println("Saldo insuficiente!");
            }

        }

        // Depósito
        if (opcao == 2) {

            System.out.print("Digite o valor do depósito: ");
            valor = leia.nextDouble();

            saldoFinal = saldoFinal + valor;

            System.out.println("\n=== COMPROVANTE ===");
            System.out.println("Nome: " + nome);
            System.out.println("Saldo inicial: R$ " + saldoInicial);
            System.out.println("Valor depositado: R$ " + valor);
            System.out.println("Saldo final: R$ " + saldoFinal);
        }

        leia.close();
    }
}