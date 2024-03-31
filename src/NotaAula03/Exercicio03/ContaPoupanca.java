package NotaAula03.Exercicio03;

public class ContaPoupanca extends ContaBancaria{
    private double rendimento;

    public ContaPoupanca(String titular) {
        super(titular);
        this.rendimento = 0.0;
    }

    public void calcularRendimento(double taxaSelic) {
        if (taxaSelic > 8.5) {
            rendimento = saldo * 0.005;
        } else {
            rendimento = saldo * (taxaSelic * 0.7 / 12);
        }
        saldo += rendimento;
        System.out.println("Rendimento calculado e adicionado ao saldo.");
    }
}

