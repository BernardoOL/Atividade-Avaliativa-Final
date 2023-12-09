package Atividade1;

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

	    public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
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
