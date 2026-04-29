package Teste;

import java.util.Scanner;
import java.util.Random;

public class Main {
    static volatile boolean apertou = false;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int tempoMax = 5;
        int alvo = r.nextInt(tempoMax) + 1; // gera de 1 até tempoMax

        System.out.println(alvo);

        // Thread para detectar ENTER
        new Thread(() -> {
            sc.nextLine();
            apertou = true;
        }).start();

        for (int i = 1; i <= tempoMax; i++) {
            if (i == alvo) {
                System.out.println("Tempo: " + i);
            } else {
                System.out.println("Tempo: " + i);
            }

            Thread.sleep(70);

            if (apertou) {
                if (i == alvo) {
                    System.out.println("Acertou");
                } else {
                    System.out.println("Errou");
                }
                return;
            }
        }

        System.out.println("Lil bro tu nem tentou");
    }
}