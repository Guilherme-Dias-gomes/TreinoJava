package br.com.fiap;

import java.util.Scanner;

public class MediaTurma {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos: ");
        int qtd = leitor.nextInt();

        double somaNotas = 0;

        for(int i = 1; i <= qtd; i++){
            System.out.println("Digite a nota do aluno " + i);
            float nota = leitor.nextFloat();
            if(nota < 0 || nota > 10){
                System.out.println("Nota inválida!");
                i--;
            }
            else{
                somaNotas =+ nota;
            }

        }

        double media = somaNotas / qtd;
        System.out.println("A média da nota da turma é " + media);

    }
}
