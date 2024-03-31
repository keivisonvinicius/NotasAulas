package NotaAula01.exercicio2;
import java.util.Scanner;

public class AlunoMain {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         Aluno aluno = new Aluno();

        System.out.println("Nome do aluno: ");
        aluno.nome = sc.nextLine();

        System.out.println("Primeira nota(0-100): ");
        aluno.nota1 = sc.nextInt();

        System.out.println("Segunda nota(0-100): ");
        aluno.nota2 = sc.nextInt();

        System.out.println("Terceira nota(0-100): ");
        aluno.nota3 = sc.nextInt();

        double media = (aluno.nota1 + aluno.nota2 + aluno.nota3)/3;
        if(media >= 70){
            System.out.println("Aluno aprovado");
        } else if (media < 40) {
            System.out.println("Aluno reprovado");
        }
        else{
            System.out.println("Aluno na final");
        }
    }
}
