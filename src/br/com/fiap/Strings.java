package br.com.fiap;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome completo");
        String nome = leitor.nextLine();

        while (nome.indexOf(" ") != -1){
            String parteNome = nome.substring(0, nome.indexOf(" "));

            nome = nome.substring((nome.indexOf(" ") + 1));
            System.out.println(parteNome);
        }
        System.out.println(nome);

        leitor.close();
    }
}
