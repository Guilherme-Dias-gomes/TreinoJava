package br.com.fiap;

public class Media {
    public static void main(String[] args) {
        int provaSemestral = 7;
        int trabalhoConclusao = 5;
        int prova1 = 10;
        int prova2 = 6;
        int media1 = (prova1 + prova2)/2;
        double resul = provaSemestral * 0.5 + trabalhoConclusao * 0.3 + media1 * 0.2;

        System.out.println("Resultado: " + resul);
    }
}
