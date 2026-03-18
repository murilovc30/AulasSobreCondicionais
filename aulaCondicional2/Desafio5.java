package aulaCondicional2;

import java.util.Scanner;

public class Desafio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int valor1;
		int valor2;
		int valor3;
		
		System.out.println("Informe o primeiro valor: ");
		valor1 = ler.nextInt();

		System.out.println("Informe o segundo valor: ");
		valor2 = ler.nextInt();
		
		System.out.println("Informe o terceiro valor: ");
		valor3 = ler.nextInt();
		
		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println("O maior valor dos valores é: " + valor1);
		} else if (valor2 > valor1 && valor2 > valor3) {
			System.out.println("O maior valor dos valores é: " + valor2);
		} else if (valor3 > valor1 && valor3 > valor2) {
			System.out.println("O maior valor dos valores é: " + valor3);
		}}}
		


