package Atividade3;

import java.util.Scanner;

class DVD extends Midia {
    int nFaixas;

    DVD() {}

    DVD(int codigo, double preco, String nome, int nFaixas) {
        super(codigo, preco, nome);
        this.nFaixas = nFaixas;
    }

    String getTipo() {
        return "DVD";
    }

    String getDetalhes() {
        return super.getDetalhes() + ", Número de Faixas: " + nFaixas;
    }

    void setFaixas(int f) {
        nFaixas = f;
    }

    void inserirDados() {
    	System.out.println("DVD --");
        super.inserirDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número de Faixas: ");
        nFaixas = scanner.nextInt();
    }
}