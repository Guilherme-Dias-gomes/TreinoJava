package br.com.fiap.model;

public class Produto {
    private String nome;
    protected double preco;

    public Produto(){}

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularDesc(int porcentagem){
        return preco - preco * porcentagem / 100;
    }

    public double calcularDesc(double valor){
        return preco - valor;
    }

    public double calcularDesc(int qtd, boolean promocao){
        double valorFinal = preco * qtd;
        if(promocao){
            if(qtd == 1){
                valorFinal *= 0.9;
            } else if(qtd < 5) {
                valorFinal *= 0.8;
            } else{
                valorFinal *= 0.7;
            }
        }
        return valorFinal;
    }

    @Override
    public String toString() {
        return "Nome= " + nome +  " Preço= " + preco;
    }

}
