package NotaAula03.Exercicio01;
import java.util.Scanner;
public class CadastroMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario f = new Funcionario();
        Gerente g = new Gerente();
        Diretor d = new Diretor();

        System.out.println("Nome(gerente):");
        g.setNome(sc.nextLine());

        System.out.println("Salário(gerente):");
        g.setSalario(sc.nextDouble());
        sc.nextLine();

        System.out.println("Departamento(gerente)");
        g.setDepartamento(sc.nextLine());

        System.out.println("Nome(diretor):");
        d.setNome(sc.nextLine());

        System.out.println("Salário(diretor):");
        d.setSalario(sc.nextDouble());

        System.out.println("Ações(diretor):");
        d.setAcoes(sc.nextInt());

        g.imprime();
        System.out.println("------------");
        d.imprime();

    }
}
