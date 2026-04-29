package Teste;

import java.util.Scanner;

public class Teste6 {

	public static void main(String[] args) throws InterruptedException {
		Scanner ler = new Scanner(System.in);
		String enter;
		String[] anim = {"|", "|", "|", "|"};

        for (int i = 0; i < 20; i++) {
            System.out.print("\r|Carregando, não desligue sua máquina" + anim[i % 4]);
            Thread.sleep(200);
        }

        System.out.println("\n|Carregamento concluído! Aperte enter para cotinuar|");
        enter = ler.nextLine();
        System.out.println("Bem vindo, você pode acessar: Navegador, Configurações, Explorador de Arquivos e Armazenamento");
        enter = ler.nextLine();
        
        if (enter.equalsIgnoreCase("Navegador")) {
        	System.out.println("Pesquisar: ");
        	enter = ler.nextLine();
        	
        }
        
        if (enter.equalsIgnoreCase("Configurações")) {
        	System.out.println("Configurações: Lixeira");
        	
        	enter = ler.nextLine();
        }

	}

}
