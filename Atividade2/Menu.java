package Atividade2;

import java.util.Scanner;

class Menu {
	
    public static void exibirMenu() {
        System.out.println("1. Inserir moto");
        System.out.println("2. Inserir carro");
        System.out.println("3. Calcular relatório");
        System.out.println("4. Sair");
    }

    public static int lerOpcao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a opção desejada: ");
        return scanner.nextInt();
    }

 
}
