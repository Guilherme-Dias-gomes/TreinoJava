package br.com.fiap;

public class App {
    public static void main(String[] args) {

        Fabricante fabricante = new Fabricante();

        Computador note = new Computador("Apple", "MacBook Pro", 5000, 16, 512, "i5", false, fabricante);

        System.out.println("Processador: " + note.processador);
        System.out.println("Preço: " + note.preco);
        System.out.println("Aramazenamento: " + note.armazenamento);
        System.out.println("Marca: " + note.marca);
        System.out.println("Modelo: " + note.modelo);
        System.out.println("Memória RAM: " + note.memoriaRam);
        System.out.println("Placa de Vídeo Dedicada: " + note.placaVideoDedicada);
        System.out.println("Fabricante: " + note.fabricante);

    }
}
