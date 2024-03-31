package NotaAula04.Exercicio02;

public class Produto {
    private String nome;
    private double preco;
    private String tipo;

    public Produto(String nome,double preco,String tipo){
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.preco);
        System.out.println(this.tipo);
    }
}
