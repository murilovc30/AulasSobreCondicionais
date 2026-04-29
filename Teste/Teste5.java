package Teste;

import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Teste5 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String[] opcoes = {"pedra", "papel", "tesoura"};
        String pc = opcoes[r.nextInt(3)];

        System.out.print("Escolha (pedra/papel/tesoura): ");
        String player = sc.nextLine();

        System.out.println("PC escolheu: " + pc);

        if (player.equals(pc)) {
            System.out.println("Empate!");
        } else if (
            (player.equals("pedra") && pc.equals("tesoura")) ||
            (player.equals("papel") && pc.equals("pedra")) ||
            (player.equals("tesoura") && pc.equals("papel"))
        ) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Você perdeu!");
        }
    }
}
        
    

		
    


	
	




