package NotaAula03.Exercicio01;

public class Gerente extends Funcionario{
    private String departamento;
    public double calcularBonus(){
        return 0.1 * salario;
    }
    public void imprime(){
        super.imprime();
        System.out.println(calcularBonus());
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    public String getDepartamento(){
        return departamento;
    }
}
