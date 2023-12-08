package Atividade3;

import java.util.Scanner;

public class Midia {

	    int codigo;
	    double preco;
	    String nome;

	    Midia() {}

	    Midia(int codigo, double preco, String nome) {
	        this.codigo = codigo;
	        this.preco = preco;
	        this.nome = nome;
	    }

	    String getTipo() {
	        return "Midia";
	    }

	    String getDetalhes() {
	        return "Código: " + codigo + ", Preço: " + preco + ", Nome: " + nome;
	    }

	    void printDados() {
	        System.out.println(getTipo() + ": " + getDetalhes());
	    }

	    void inserirDados() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Código: ");
	        codigo = scanner.nextInt();
	        System.out.print("Preço: ");
	        preco = scanner.nextDouble();
	        System.out.print("Nome: ");
	        scanner.nextLine(); // Consumir a quebra de linha pendente
	        nome = scanner.nextLine();
	    }

}
