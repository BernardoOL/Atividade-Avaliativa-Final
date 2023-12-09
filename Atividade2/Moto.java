package Atividade2;

import java.util.Scanner;

class Moto extends Veiculo {
    private int ano;

    public Moto(String modelo, double preco, int ano) {
        super(modelo, preco);
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public Moto() {
        super("", 0.0);
    } 
    
    public void inserirDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MOTO - ");
        System.out.print("Ano: ");
        this.setAno(scanner.nextInt());
        super.inserirDados();
    }
}
