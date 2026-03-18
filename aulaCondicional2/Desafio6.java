package aulaCondicional2;

import java.util.Scanner;

public class Desafio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int senha;
		long cpf;
		int sacar;
		int saldo = 50190;

		System.out.println("Informe sua senha meu sigma: ");
		senha = ler.nextInt();

		System.out.println("Informe agora seu CPF meu city boy: ");
		cpf = ler.nextLong();

		if (senha == 12345 && cpf == 44447603896L) {
			System.out.println("Acesso permitido!");

			System.out.println("Quanto dinheiro deseja sacar? (saldo: " + saldo + ")");
			sacar = ler.nextInt();

		if (sacar <= saldo) {
			saldo = saldo - sacar;
		    System.out.println("Saque realizado com sucesso meu compa!");
		    System.out.println("Saldo restante: " + saldo);
		} else {
			System.out.println("Saldo insuficiente seu betinha!");
		    }

		} else {
			System.out.println("Acesso negado seu beta.");
		    }
		}
}
