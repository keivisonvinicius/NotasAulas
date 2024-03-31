package NotaAula03.Exercicio01;

public class Diretor extends Funcionario{
    private int acoes;
    public void imprime(){
        super.imprime();
        System.out.println(acoes);
    }
    public void setAcoes(int acoes){
        this.acoes = acoes;
    }
    public int getAcoes(){
        return acoes;
    }
}
