package Teste;

import java.util.Scanner;
import java.util.Random;

public class Luta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int vidaPlayer = 100;
        int vidaPC = 67;

        while (vidaPlayer > 0 && vidaPC > 0) {
            System.out.println("\nSua vida: " + vidaPlayer + " | PC: " + vidaPC);
            System.out.print("Atacar (1) ou Curar (2): ");
            int escolha = sc.nextInt();

            if (escolha == 1) {
                int dano = r.nextInt(20) + 1;
                vidaPC -= dano;
                System.out.println("Você causou " + dano);
            } else {
                int cura = r.nextInt(15) + 1;
                vidaPlayer += cura;
                System.out.println("Você curou " + cura);
            }

            int danoPC = r.nextInt(20) + 1;
            vidaPlayer -= danoPC;
            System.out.println("PC causou " + danoPC);
        }

        if (vidaPlayer > 0) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Você morreu!");
        }
    }
}


