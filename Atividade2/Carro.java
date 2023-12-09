package Atividade2;

import java.util.Scanner;

class Carro extends Veiculo {
    private double km;

    public Carro(String modelo, double preco, double km) {
        super(modelo, preco);
        this.km = km;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
    
    public Carro() {
        super("", 0.0);
    }
    public void inserirDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CARRO - ");
        System.out.print("Quilometragem: ");
        this.setKm(scanner.nextDouble());
        super.inserirDados();
    } 
}
