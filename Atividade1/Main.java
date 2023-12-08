package Atividade3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
		private static ArrayList<Midia> cadastro = new ArrayList<>();

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int escolha;
	        do {
	            System.out.println("Menu:");
	            System.out.println("1. Inserir Mídia");
	            System.out.println("2. Listar Mídias");
	            System.out.println("3. Deletar Mídia");
	            System.out.println("4. Alterar Mídia");
	            System.out.println("0. Sair");

	            System.out.print("Escolha uma opção: ");
	            escolha = scanner.nextInt();

	            switch (escolha) {
	                case 1:
	                    cadastrarMidia();
	                    break;
	                case 2:
	                    listarMidias();
	                    break;
	                case 3:
	                    deletarMidia();
	                    break;
	                case 4:
	                    alterarMidia();
	                    break;
	                case 0:
	                    System.out.println("Saindo do programa. Até logo!");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }

	        } while (escolha != 0);
	    }

	    private static void cadastrarMidia() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("1. CD\n2. DVD");
	        System.out.print("Escolha o tipo de mídia: ");
	        int tipo = scanner.nextInt();

	        Midia novaMidia;
	        if (tipo == 1) {
	            novaMidia = new CD();
	        } else if (tipo == 2) {
	            novaMidia = new DVD();
	        } else {
	            System.out.println("Tipo de mídia inválido.");
	            return;
	        }

	        novaMidia.inserirDados();
	        cadastro.add(novaMidia);
	        System.out.println("Mídia cadastrada com sucesso!");
	    }

	    private static void listarMidias() {
	        System.out.println("Listagem de Mídias:");
	        for (Midia midia : cadastro) {
	            midia.printDados();
	        }
	    }

	    private static void deletarMidia() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite o código da mídia a ser deletada: ");
	        int codigoDeletar = scanner.nextInt();

	        for (int i = 0; i < cadastro.size(); i++) {
	            if (cadastro.get(i).codigo == codigoDeletar) {
	                cadastro.remove(i);
	                System.out.println("Mídia deletada com sucesso!");
	                return;
	            }
	        }

	        System.out.println("Mídia não encontrada.");
	    }

	    private static void alterarMidia() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite o código da mídia a ser alterada: ");
	        int codigoAlterar = scanner.nextInt();

	        for (Midia midia : cadastro) {
	            if (midia.codigo == codigoAlterar) {
	                midia.inserirDados();
	                System.out.println("Mídia alterada com sucesso!");
	                return;
	            }
	        }

	        System.out.println("Mídia não encontrada.");
	    }
}
