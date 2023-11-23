package P001;

import java.util.Scanner;

public class Conversor {
	private float F, C, temp;
	
	public float CparaF() {
		F = (temp * 9f/5) + 32;
		return F;
	}
	public float FparaC(){
		C = (temp - 32)*(5f/9);
		return C;
	}
	public Conversor( float temp) {
		this.temp = temp;
	}
	
public static void main(String[] args) {
	
		int Unidade;
		float temperatura, resultado = 0;
	
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura: ");
        temperatura = sc.nextFloat();
        Conversor conversor = new Conversor(temperatura);

        System.out.println("Escolha o tipo de conversao");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para celsius");
        Unidade = sc.nextInt();

        switch (Unidade) {
            case 1:
                resultado = conversor.CparaF();
                System.out.println("A temperatura em Fahrenheit e: " + resultado);
                break;
            case 2:
                resultado = conversor.FparaC();
                System.out.println("A temperatura em Celsius e: " + resultado);
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
        }
    }	
}
    

