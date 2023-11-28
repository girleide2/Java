package P002;

import java.util.Scanner;

public class ConversorMoedas {
	private float Quantidade, TxCambio;
	
	public float Converte() {
		float novoValor = Quantidade * TxCambio;
		return novoValor;
	}
	
	public ConversorMoedas(float quantidade, float txCambio) {
		super();
		Quantidade = quantidade;
		TxCambio = txCambio;
	}
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Digite o valor em dollar a ser convertida: ");
			float num1 = sc.nextFloat();
			System.out.print("Digite a taxa de cambio: ");
			float num2 = sc.nextFloat();
			ConversorMoedas conversorMoedas = new ConversorMoedas(num1, num2);
			
			System.out.print("o valor convertido é: "+ conversorMoedas.Converte() );
		}
	}
}
