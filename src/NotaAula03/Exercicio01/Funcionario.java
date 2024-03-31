package NotaAula03.Exercicio01;

public class Funcionario {
    protected String nome;
    protected double salario;
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.salario);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
}
