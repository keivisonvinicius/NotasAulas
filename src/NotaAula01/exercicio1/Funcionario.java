package NotaAula01.exercicio1;

public class Funcionario {
    int matricula;
    String nomeCompleto;
    double salarioBruto;
    public void descontoInss(){
        System.out.println(salarioBruto * 0.15);
    }
    public void liquido(){
        System.out.println(salarioBruto - (salarioBruto * 0.15));
    }
}
