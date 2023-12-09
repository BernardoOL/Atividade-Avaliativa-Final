package Atividade2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    	
        List<Veiculo> veiculos = new ArrayList<>();

        while (true) {
        	System.out.println("MENU - ");
            System.out.println("1. Inserir moto");
            System.out.println("2. Inserir carro");
            System.out.println("3. Calcular relatório");
            System.out.println("4. Sair");
        
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a opção desejada: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                Moto moto = new Moto();
                moto.inserirDados();
                veiculos.add(moto);
            } else if (opcao == 2) {
                Carro carro = new Carro();
                carro.inserirDados();
                veiculos.add(carro);
            } else if (opcao == 3) {
                double total = 0;

                for (Veiculo veiculo : veiculos) {
                    if (veiculo instanceof Moto) {
                        Moto moto = (Moto) veiculo;
                        if (moto.getAno() >= 2008) {
                            moto.setPreco(moto.getPreco() * 1.1);
                        }

                        total += moto.getPreco();
                    } else if (veiculo instanceof Carro) {
                        Carro carro = (Carro) veiculo;
                        if (carro.getKm() > 100000) {
                            carro.setPreco(carro.getPreco() * 0.92);
                        }

                        total += carro.getPreco();
                    }
                }

                System.out.println("Total de preços: R$" + total);
            } else if (opcao == 4) {
                break;
            }
        }
    }
}