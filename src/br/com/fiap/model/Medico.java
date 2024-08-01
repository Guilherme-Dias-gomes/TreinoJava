package br.com.fiap.model;

public class Medico extends Pessoa{
    private int crm;
    private String especialidade;


    public Medico(String nome, int idade, String cpf, char genero, int crm, String especialidade) {
        super(nome, idade, cpf, genero);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public void operar(){
        //...
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
