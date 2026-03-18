package Teste;

import java.util.Random;
import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numero = rand.nextInt(10) + 1;
        int tentativa;

        System.out.println("Adivinhe o número de 1 a 10:");

        tentativa = sc.nextInt();

        if (tentativa == numero)
            System.out.println("Você acertou, parabens!");
        else
            System.out.println("Errou, perdeu! O número era " + numero);
    }


}


