package NotaAula02.Exercicio03;
import java.util.Scanner;
public class TrianguloMain {
    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro lado:");
        t.setR1(sc.nextDouble());

        System.out.println("Segundo lado:");
        t.setR2(sc.nextDouble());

        System.out.println("Terceiro lado:");
        t.setR3(sc.nextDouble());

        String verifica = t.verifica();
        String tipo = t.tipoTriangulo();

        System.out.println(verifica);
        System.out.println(tipo);

    }
}

