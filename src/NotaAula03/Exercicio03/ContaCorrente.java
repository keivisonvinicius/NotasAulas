package NotaAula03.Exercicio03;

public class ContaCorrente extends ContaBancaria{
    private double chequeEspecial;

    public ContaCorrente(String titular) {
        super(titular);
        this.chequeEspecial = 1000.0;
    }

    public void usarChequeEspecial(double valor) {
        if (valor <= saldo + chequeEspecial) {
            saldo -= valor;
            System.out.println("Cheque especial utilizado com sucesso.");
        } else {
            System.out.println("Valor excede o limite do cheque especial.");
        }
    }
}
