package br.com.fiap.model;

public class Cliente extends Pessoa{
    private int codigo;

    public Cliente(String nome, int idade, String cpf, char genero, int codigo) {
        super(nome, idade, cpf, genero);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
