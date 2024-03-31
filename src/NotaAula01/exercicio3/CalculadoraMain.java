package NotaAula01.exercicio3;
import java.util.Scanner;

public class CalculadoraMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        int repetir = 0;


        do {
            System.out.println("Digite o primeiro número: ");
            int a = sc.nextInt();
            System.out.println("Digite o segundo número: ");
            int b = sc.nextInt();
            System.out.println("Qual operação você quer fazer?" +
                    "\n1- adição" +
                    "\n2- subtração" +
                    "\n3- multiplicação" +
                    "\n4- divisão");

            int x = sc.nextInt();


            switch (x) {
                case 1:
                    calculadora.soma(a, b);
                    break;
                case 2:
                    calculadora.subtracao(a, b);
                    break;
                case 3:
                    calculadora.multiplicacao(a, b);
                    break;
                case 4:
                    calculadora.divisao(a, b);
                    break;
                default:
                    System.out.println("Opção inválida.Tente novamente");
                    continue;
            }
            System.out.println("Para fazer outra operação, digite 0.Para sair,digite qualquer outro número");
            repetir = sc.nextInt();

        }while(repetir == 0);
        System.out.println("Saindo...");
        sc.close();






}}
