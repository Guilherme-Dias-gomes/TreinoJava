package br.com.fiap;

import br.com.fiap.model.Aluno;
import br.com.fiap.model.Pessoa;
import br.com.fiap.model.Produto;
import br.com.fiap.model.ProdutoEletronico;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto("Camiseta", 50);

        ProdutoEletronico eletronico = new ProdutoEletronico("Celular", 1200, true);

        System.out.println(produto);
        System.out.println(eletronico);

    }
}