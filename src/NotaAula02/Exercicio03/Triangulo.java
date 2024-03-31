package NotaAula02.Exercicio03;

public class Triangulo {
    private double r1;
    private double r2;
    private double r3;

    public void setR1(double r1){
        this.r1 = r1;
    }
    public void setR2(double r2){
        this.r2 = r2;
    }
    public void setR3(double r3){
        this.r3 = r3;
    }
    public double getR1(){
        return r1;
    }
    public double getR2(){
        return r2;
    }
    public double getR3(){
        return r3;
    }

    public String verifica(){
        if (r1 + r2 > r3 && r2 + r3 > r1 && r1 + r3 > r2){
            return "É possivel formar um triãngulo";
        }else{
            return "Não é possivel formar um triângulo";
        }
    }
    public String tipoTriangulo(){
        if(r1 == r2 && r2 == r3){
            return "Triângulo Equilátero";
        }else if(r1 == r2 || r1 == r3 || r2 == r3){
            return "Triângulo Isósceles";
        }else{
            return "Triângulo Escaleno";
        }
    }
}
