package aulaCondicional2;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
			int a;
			int b;
			int c;
			
			System.out.println("Informe a medida da base do triângulo: ");
			a= ler.nextInt();
			
			System.out.println("Informe a medida do lado esquerdo do triângulo: ");
			b= ler.nextInt();
			
			System.out.println("Informe a medida do lado direito do triângulo: ");
			c= ler.nextInt();
			
			if (a == b && b == c) {
			    System.out.println("Triângulo equilátero.");
			} else if (a == b || a == c || b == c) {
			    System.out.println("Triângulo isósceles.");
			} else if (a != b && b != c && c != a){
			    System.out.println("Triângulo escaleno.");
			}
		

	}

}
