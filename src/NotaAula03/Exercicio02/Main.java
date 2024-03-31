package NotaAula03.Exercicio02;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Televisao televisao = new Televisao();
        Smartphone smartphone = new Smartphone();

        televisao.setNome("Philco 32 polegadas");
        televisao.setPreco(889.90);
        televisao.setEstoque(500);

        smartphone.setNome("iphone 13");
        smartphone.setPreco(3800);
        smartphone.setEstoque(600);

        System.out.println("Especificações das compras:");
        System.out.println("Produto:"+televisao.getNome());
        System.out.println("Preço:"+televisao.getPreco());
        System.out.println("Estoque:"+televisao.getEstoque());

        System.out.println("--------------");
        System.out.println("Produto:"+smartphone.getNome());
        System.out.println("Preço:"+smartphone.getPreco());
        System.out.println("Estoque:"+smartphone.getEstoque());
    }
}
