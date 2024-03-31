package NotaAula04.Exercicio03;

public class Carro {
    private String marca;
    private String modelo;

    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    public void mostrarDetalhes(){
        System.out.println("Fabricante: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
    }
}
