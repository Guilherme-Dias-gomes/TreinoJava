package br.com.fiap;

public class Computador {
    String marca;
    String modelo;
    double preco;
    int memoriaRam;
    int armazenamento;
    String processador;
    boolean placaVideoDedicada;
    Fabricante fabricante;

    public Computador(String marca, String modelo, double preco, int memoriaRam, int armazenamento, String processador, boolean placaVideoDedicada, Fabricante fabricante) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.processador = processador;
        this.placaVideoDedicada = placaVideoDedicada;
        this.fabricante = fabricante;
    }

    double calcDesconto(double desconto){
        return preco * desconto;
    }

    boolean addMemoriaRam(int qtd){
        if(qtd % 2 == 1){
            return false;
        }
        memoriaRam += qtd;
        preco += qtd * 150;
        return true;
    }

    void trocarProcessador(String novoProcessador){
        processador = novoProcessador;
    }

}
