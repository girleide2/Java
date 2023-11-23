package P001;

import java.util.Scanner;

public class Calculadora {
	private double  num1, num2;
	
	public double soma() {
	
		double Soma = num1 + num2;
		return Soma;
	}
	
	public double multi() {
		
		double Multi = num1 * num2;
		return Multi;
	}
	
	public double subtrai() {
		
		double Subtrai = num1 - num2;
		return Subtrai;
	}
	public double divide() {
		
		double Divide = num1 / num2;
		return Divide;
	}
	

    public Calculadora(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public static void main(String[] args) {
    	
    	int opcao;
    	double resultado = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double num2 = sc.nextDouble();
        Calculadora calculadora = new Calculadora(num1, num2);
        System.out.println("----Escolha a operacao----");
        System.out.println("1 ---Adicao");
        System.out.println("2 ---Subtracao");
        System.out.println("3 ---Multiplicacao");
        System.out.println("4 ---Divisao");

        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                resultado = calculadora.soma();
                break;
            case 2:
                resultado = calculadora.subtrai();
                break;
            case 3:
                resultado = calculadora.multi();
                break;
            case 4:
            	resultado = calculadora.divide();
                break;
        }
        System.out.println("O resultado da operação é: " + resultado);
   }
	
}