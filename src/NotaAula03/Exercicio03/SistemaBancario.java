package NotaAula03.Exercicio03;
import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione o tipo de conta: ");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Conta Poupança");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Digite o nome do titular da conta corrente: ");
            String titular = scanner.next();
            ContaCorrente contaCorrente = new ContaCorrente(titular);

            // Menu de opções para Conta Corrente
            while (true) {
                System.out.println("\nMenu de opções:");
                System.out.println("1. Depositar");
                System.out.println("2. Sacar");
                System.out.println("3. Usar Cheque Especial");
                System.out.println("4. Exibir dados da conta");
                System.out.println("5. Sair");

                System.out.println("Escolha uma opção: ");
                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Digite o valor para depositar: ");
                        double valorDeposito = scanner.nextDouble();
                        contaCorrente.depositar(valorDeposito);
                        break;
                    case 2:
                        System.out.println("Digite o valor para sacar: ");
                        double valorSaque = scanner.nextDouble();
                        contaCorrente.sacar(valorSaque);
                        break;
                    case 3:
                        System.out.println("Digite o valor para usar o cheque especial: ");
                        double valorCheque = scanner.nextDouble();
                        contaCorrente.usarChequeEspecial(valorCheque);
                        break;
                    case 4:
                        contaCorrente.exibirDados();
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        System.exit(0);
                    default:
                        System.out.println("Opção inválida.");
                }
            }
        } else if (escolha == 2) {
            System.out.println("Digite o nome do titular da conta poupança: ");
            String titular = scanner.next();
            ContaPoupanca contaPoupanca = new ContaPoupanca(titular);

            // Menu de opções para Conta Poupança
            while (true) {
                System.out.println("\nMenu de opções:");
                System.out.println("1. Depositar");
                System.out.println("2. Sacar");
                System.out.println("3. Calcular Rendimento");
                System.out.println("4. Exibir dados da conta");
                System.out.println("5. Sair");

                System.out.println("Escolha uma opção: ");
                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Digite o valor para depositar: ");
                        double valorDeposito = scanner.nextDouble();
                        contaPoupanca.depositar(valorDeposito);
                        break;
                    case 2:
                        System.out.println("Digite o valor para sacar: ");
                        double valorSaque = scanner.nextDouble();
                        contaPoupanca.sacar(valorSaque);
                        break;
                    case 3:
                        System.out.println("Digite a taxa Selic: ");
                        double taxaSelic = scanner.nextDouble();
                        contaPoupanca.calcularRendimento(taxaSelic);
                        break;
                    case 4:
                        contaPoupanca.exibirDados();
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        System.exit(0);
                    default:
                        System.out.println("Opção inválida.");
                }
            }
        } else {
            System.out.println("Opção inválida.");
        }
    }
}


