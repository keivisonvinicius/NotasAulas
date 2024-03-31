package NotaAula04.Exercicio02;

public class ProdutoMain {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camisa",59.99,"Camisa basica preta");
        Produto produto2 = new Produto("Calça", 99.99,"Calça jeans azul");

        produto1.imprime();
        produto2.imprime();
    }
}
