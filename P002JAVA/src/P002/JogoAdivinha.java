package P002;

import java.util.Scanner;

public class JogoAdivinha {
	
	private static int numAleatorio = (int) (Math.random() * 100) + 1;
	
	private int numUsuario;
	
	
	public JogoAdivinha(int numAleatorio, int numUsuario) {
		super();
		this.numAleatorio = numAleatorio;
		this.numUsuario = numUsuario;
	}

	public static void Compara(int numUsuario, int numAleatorio) {
		
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro entre 1 e 100");
		numUsuario = sc.nextInt();
		
			if (numUsuario > numAleatorio) {
				System.out.println("muito alto");
			} else if (numUsuario < numAleatorio){
				System.out.println("muito baixo");
			}
		} while (numUsuario != numAleatorio);
		
		System.out.println("Acertou!!");
	}
	
	
	public static void main(String[] args) {
		
		try {
			JogoAdivinha.Compara(numAleatorio, numAleatorio);
		} catch (Exception e) {
			
			System.out.println("Não é um numero inteiro. Encerrando...");
		}
	}
}
	
	
	
