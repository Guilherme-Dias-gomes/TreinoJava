package br.com.fiap.model;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private char genero;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String cpf, char genero) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.genero = genero;
    }

    public void validarNome(){
        //...
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }


}
