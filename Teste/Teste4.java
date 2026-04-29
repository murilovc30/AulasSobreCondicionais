package Teste;

import java.util.Scanner;

public class Teste4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String opcao2 = "esquerda";
		String opcao1 = "direita";
		String enter;
		
		
		
		System.out.println("Você se encontra em uma floresta a noite, você acordou na mata no meio de um caminho, você tem a opção de ir para a esquerda ou para a direita do caminho, qual você escolhe?: ");
		opcao1 = ler.nextLine();
		
		
		if (opcao2.equalsIgnoreCase("esquerda")) {
        System.out.println("Você caminha para a esquerda, depois de um tempo andando, uma sede chega em você, lá longe você consegue ver uma luz laranja como de uma fogueira, você tem a opção de ir até ela (ir) ou pegar um outro caminho (continuar): ");
        opcao1 = ler.nextLine();
            
        
        if (opcao1.equalsIgnoreCase("ir")) {
        System.out.println("Você chega no local da luz laranja, era mesmo uma fogueira. Em volta se tem tendas de acampamento, mas ninguém estava dentro de nenhuma, tudo estava bagunçado e abandonado, você pega uma garrafa de água que tinha e a bebe, mas quando você faz isso você ouve um barulho lá fora, voce vai checar (checar) ou ficar em silêncio e se esconder (esconder): ");
        opcao1 = ler.nextLine();
        
        if (opcao1.equalsIgnoreCase("checar")) {
        	System.out.println("Você sai da tenda em que estava, lá fora apenas se ouve o som da fogueira apagando aos poucos. Você não sabe o motivo, mas algo está errado, você não se sente bem estando ali, você pega uma mochila e guarda os suprimentos, você pode ir por uma nova trilha (novo) ou voltar para a mesma (mesma): ");
        	opcao1 = ler.nextLine();
        	
        if (opcao1.equalsIgnoreCase("novo")) {
        	System.out.println("Você andou...");
        	enter = ler.nextLine();
        	System.out.println("E andou...");
        	enter = ler.nextLine();
        	System.out.println("...");
        	enter = ler.nextLine();
        	System.out.println("Não o salve...");
        	enter = ler.nextLine();
        	System.out.println("Deixe-o queimar...");
        	enter = ler.nextLine();
        	System.out.println("...");
        	enter = ler.nextLine();
        	System.out.println("Você sabe oque ele fez, ele não merece perdão de ninguém...");
        	enter = ler.nextLine();
        	System.out.println("...");
        	enter = ler.nextLine();
        	System.out.println("Saia.");
        	enter = ler.nextLine();
        	System.out.println("...");
        	enter = ler.nextLine();
        	System.out.println("Após andar bastante, você achou algumas marcações nas árvores que faziam um caminho, você não reconhecia aquelas marcas. Você quer seguir essas marcas (seguir) ou continuar na sua trilha (continuar)?: ");
        	
        if (opcao1.equalsIgnoreCase("seguir")) {
        	System.out.println("Você");
        	opcao1 = ler.nextLine();
        	
        }       		      		        	
        }
        }
        } 
        
            } else if (opcao2.equalsIgnoreCase("continuar")) {
            	System.out.println("Você decidiu não ir até a luz, com medo de não serem pessoas de bom caráter. Caminhando você enontra folhas com escritas jogadas em um chão, algo estranho e você percebe que não está sozinho na floresta. Deseja ler as folhas escritas (folha) ou  ignorar e sair logo de perto antes que seja visto por alguém (sair): ");
            	
            	
        }else if (opcao1.equalsIgnoreCase("direita")) {
            System.out.println("Você anda e anda e anda e parece que a floresta é infinita, a fome bate enquanto anda e você começa a desesperar. Com fome, você pode escolher comer a primeira coisa que parecer na sua frente (comer) ou continuar na esperança de encontrar algo melhor (continuar), o que você faz?: ");
        } else {
            System.out.println("Você ficou parado.......Da floresta você ouve estalos estridentes ");
        }
		
		
		
	}

}
