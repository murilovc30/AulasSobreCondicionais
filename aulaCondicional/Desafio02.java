package aulaCondicional;

import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int dia;
		
		System.out.println("Informe um dia da semana (1-7): ");
		dia= ler.nextInt();
		
		if (dia == 1) {
			System.out.println("Domingo");
		}
		if (dia == 2) {
			System.out.println("Segunda-Feira");
		}
		if (dia == 3) {
			System.out.println("Terça-Feira");
		}
		if (dia == 4) {
			System.out.println("Quarta-Feira");
		}
		if (dia == 5) {
			System.out.println("Quinta-Feira");
		}
		if (dia == 6) {
			System.out.println("Sexta-Feira");
		}
		if (dia == 7) {
			System.out.println("Sábado");
		}
		if (dia < 1) {
			System.out.println("Dia inválido");
		}
		if (dia > 7) {
			System.out.println("Dia inválido");
		}
		ler.close();
	}

}
