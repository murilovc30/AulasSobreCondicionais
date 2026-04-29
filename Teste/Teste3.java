package Teste;

import java.util.Scanner;

public class Teste3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 

		 

		String usuarioCorreto = "tuffinho"; 

		String senhaCorreta = "3456"; 

		 

		String usuario; 

		String senha; 

		 

		int tentativas = 3; 

		 

		while (tentativas > 0) { 

		 

		System.out.println("Digite o usuário:"); 

		usuario = entrada.next(); 

		 

		System.out.println("Digite a senha:"); 

		senha = entrada.next(); 

		 

		if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) { 

		System.out.println("Logou meu compa!"); 

		break; 

		}  

		else { 

		tentativas--; 

		System.out.println("Usuário ou senha incorretos"); 

		System.out.println("Tentativas restantes: " + tentativas); 

		} 

		} 

		 

		if (tentativas == 0) { 

		System.out.println("Sistema bloqueado!"); 

		} 

		 

		entrada.close(); 
} 



}


