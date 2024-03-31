package NotaAula04.Exercicio04;

public class Leao extends Animal{
    private String pelo;
    public Leao(String classe, String locomocao, String pelo){
        super(classe,locomocao);
        this.pelo = pelo;
    }
    public void exibirInformacoes(){
        System.out.println(this.classe);
        System.out.println(this.locomocao);
        System.out.println(this.pelo);
    }


}
