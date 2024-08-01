package br.com.fiap.model;

public class ProdutoEletronico extends Produto{
    private boolean garantia;

    public ProdutoEletronico() {
    }

    public ProdutoEletronico(String nome, double preco, boolean garantia) {
        super(nome, preco);
        this.garantia = garantia;
    }

    @Override
    public double calcularDesc(int qtd, boolean promocao){
        double valorFinal = preco + qtd;
        if(qtd > 2 && promocao){
            valorFinal *= 0.95;
        }
        return valorFinal;
    }

    public boolean isGarantia() {
        return garantia;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }

    @Override
    public  String toString(){
        return super.toString() + " Garantia= " + garantia;
    }
}
