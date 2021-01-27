package Hitss.Treinamento.Apresentacao;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("          Hitss Treinamento");
		System.out.println("");
		System.out.println("Digite um número em binário:");
		System.out.println("");
		try {
			
		
		Scanner teclado = new Scanner(System.in);
		String bin = teclado.next();
		int numero = Integer.parseInt(bin, 2);//Nome da variavel e tipo, 2 = binary. Converte o binario para int
		System.out.println("");
		System.out.println("O resultado do número em binário é : " + numero);
		} catch (Exception e) {
			System.out.println("Erro de processamento: " + e.getMessage());
		}
		}
}
