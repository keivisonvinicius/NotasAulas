package NotaAula04.Exercicio01;

public class Informacoes {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Keivison",18,"12345678");
        Professor professor = new Professor("Vando", 42, 5500);

        aluno.imprime();
        System.out.println("----------");
        professor.imprime();
    }
}
