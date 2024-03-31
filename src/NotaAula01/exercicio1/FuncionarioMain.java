package NotaAula01.exercicio1;
import java.util.Scanner;

public class FuncionarioMain {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua matricula: ");
        funcionario.matricula = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite seu nome completo: ");
        funcionario.nomeCompleto = sc.nextLine();

        System.out.println("Digite o seu salário bruto: ");
        funcionario.salarioBruto = sc.nextDouble();


        System.out.println("-----Contracheque-----");
        System.out.println("Matrícula: "+funcionario.matricula);
        System.out.println("Nome completo: "+funcionario.nomeCompleto);
        System.out.println("Salário Bruto: "+funcionario.salarioBruto);
        System.out.println("Dedução INSS(15%): ");
        funcionario.descontoInss();
        System.out.println("Salário líquido:");
        funcionario.liquido();
    }}
