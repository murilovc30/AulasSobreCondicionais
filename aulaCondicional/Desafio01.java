package aulaCondicional;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numero;
		int numero2;
		int numero3;
		int numero4;
		int media;
		
		System.out.println ("Informe a primeira nota: ");
		numero= ler.nextInt();
		
		System.out.println ("Informe a segunda nota: ");
		numero2= ler.nextInt();
		
		System.out.println ("Informe a terceira nota: ");
		numero3= ler.nextInt();
		
		System.out.println ("Informe a quarta nota: ");
		numero4= ler.nextInt();
		
		media = (numero + numero2 + numero3 + numero4) / 4;
		
		if (media > 6) {
			System.out.println("Você foi aprovado, sua média foi:" + media);
		}
		else {
			System.out.println("Você foi reprovado, sua média foi:" + media);
		}
		ler.close();
	}
}
