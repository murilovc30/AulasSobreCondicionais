package Teste;

import java.util.Random;

public class Teste1 {

	public static void main(String[] args) {
		String caracteres = ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789#$*");
		Random rand = new Random();
		String senha = ("");

		for (int i = 0; i < 8; i++) {
		senha += caracteres.charAt(rand.nextInt(caracteres.length()));
		}

		System.out.println("Senha gerada: " + senha);
		}
		

}


