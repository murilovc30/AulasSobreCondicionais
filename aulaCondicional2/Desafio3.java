package aulaCondicional2;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int valor;
		
		System.out.println("Informe o valor: ");
		valor = ler.nextInt();

		if (valor % 2 == 0) {
		    System.out.println("Número par!");
		} else {
		    System.out.println("Número ímpar!");
		}

	}

}
