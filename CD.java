package Atividade3;

import java.util.Scanner;

class CD extends Midia {
    int nMusicas;

    CD() {}

    CD(int codigo, double preco, String nome, int nMusicas) {
        super(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }

    String getTipo() {
        return "CD";
    }

    String getDetalhes() {
        return super.getDetalhes() + ", Número de Músicas: " + nMusicas;
    }

    void setMusica(int m) {
        nMusicas = m;
    }

    void inserirDados() {
    	System.out.println("CD --");
        super.inserirDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número de Músicas: ");
        nMusicas = scanner.nextInt();
    }
}