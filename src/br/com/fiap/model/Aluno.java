package br.com.fiap.model;

public class Aluno extends Pessoa{
    private int rm;
    private String turma;

    public Aluno() {
    }

    public Aluno(String nome, int idade, String cpf, char genero, int rm, String turma) {
        super(nome, idade, cpf, genero);
        this.rm = rm;
        this.turma = turma;
    }

    public void estudar(){
        //...
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}
