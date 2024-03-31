package NotaAula02.Exercicio02;

public class Estoque {
    private int atualEstoque;
    private int maximoEstoque;
    private int minimoEstoque;

    public void setAtualEstoque(int atualEstoque){
        this.atualEstoque = atualEstoque;
    }

    public void setMaximoEstoque(int maximoEstoque){
        this.maximoEstoque = maximoEstoque;
    }

    public void setMinimoEstoque(int minimoEstoque){
        this.minimoEstoque = minimoEstoque;
    }

    public double media(){
        return (maximoEstoque + minimoEstoque)/2;
    }
    public String verificarCompra(){
        double media = media();
        if(atualEstoque >= media){
            return "Não efetuar compra.";
        }else{
            return "Efetuar compra.";
        }

    }
}
