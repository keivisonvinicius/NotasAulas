package NotaAula02.Exercicio01;
import java.util.Scanner;

public class MacaMain {
    public static void main(String[] args){
        Maca m = new Maca();
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas maças vão ser compradas?");
        m.setQuantidadeMaca(sc.nextInt());

        m.calcularImprimir(m.getQuantidadeMacas());
    }
}
