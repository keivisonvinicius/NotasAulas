package NotaAula02.Exercicio02;
import java.util.Scanner;

public class EstoqueMain {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade atual em estoque:");
        estoque.setAtualEstoque(sc.nextInt());

        System.out.println("Quantidade máxima em estoque: ");
        estoque.setMaximoEstoque(sc.nextInt());

        System.out.println("Quantidade mínima em estoque: ");
        estoque.setMinimoEstoque(sc.nextInt());

        double media = estoque.media();
        String verifica = estoque.verificarCompra();
        System.out.println("Quantidade média: "+media);
        System.out.println(verifica);

    }
}
