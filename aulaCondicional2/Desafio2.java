package aulaCondicional2;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int valor;
		
		System.out.println("Informe o valor: ");
		valor = ler.nextInt();
		
		if (valor > 0) {
			System.out.println("Número positivo!");
		} else if (valor < 0) {
			System.out.println("Número negativo!");
		} else if (valor == 0) {
			System.out.println("É zero!");
		}
		ler.close();

	}

}
