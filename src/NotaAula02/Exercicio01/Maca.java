package NotaAula02.Exercicio01;

public class Maca {
    private int quantidadeMacas;
    private double valorMacas;
    public void setQuantidadeMaca(int quantidadeMacas){
        this.quantidadeMacas = quantidadeMacas;
    }
    public int getQuantidadeMacas(){
        return quantidadeMacas;
    }
    public double getValorMacas(){
        return valorMacas;
    }
    public void calcularImprimir(int a){
        if(a < 12){
            valorMacas = 1.30;
        }else{
            valorMacas = 1;
        }
        System.out.println("O total da compra é: R$"+ quantidadeMacas * valorMacas);
    }

}
