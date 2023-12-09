package Atividade2;

import java.util.Scanner;

class Veiculo {
		private String modelo;
	    private double preco;

	    public Veiculo(String modelo, double preco) {
	    	this.modelo = modelo;
	        this.preco = preco;
	    }

	    public double getPreco() {
	        return preco;
	    }
	    
	    public void setPreco(double preco) {
	        this.preco = preco;
	    }
	    
	    public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public void inserirDados() {
	        Scanner scanner = new Scanner(System.in);	        
	        System.out.println("Modelo: ");
	        this.setModelo(scanner.nextLine());
	        
	        System.out.print("Preço: ");
	        this.setPreco(scanner.nextDouble());
	    }
	    
}


	

