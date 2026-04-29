package aulaRepetição;

import java.util.Scanner;

public class XD2 {

	public static void main(String[] args) {
		int numero, resultado;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe o número para ver na tabuada");
		numero = ler.nextInt();
		
		for (int i =1; i<=10; i++) {
			resultado = numero * i;
			System.out.println(numero + " X " + i + " = " + resultado + "\n");
		}
		ler.close();
	}

}
