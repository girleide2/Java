package P002;

import java.util.Random;
import java.util.Scanner;

public class ManipulaArray {

	 public static int[] ArrayUsuario() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Escolha o tamanho do array: ");
	        int tamanho = sc.nextInt();

	        int[] array = new int[tamanho];

	        System.out.println("Digite os valores inteiros do array:");
	        for (int i = 0; i < tamanho; i++) {
	            array[i] = sc.nextInt();
	        }
	        return array;
	    }
	
	 public static int[] ArrayAleatorio(int tamanho, int limiteInferior, int limiteSuperior) {
	        Random rand = new Random();
	        int[] array = new int[tamanho];

	        for (int i = 0; i < tamanho; i++) {
	            array[i] = rand.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
	        }

	        return array;
	    }
	
	 public static void imprimirArray(int[] array) {
	        for (int elemento : array) {
	            System.out.print(elemento + " ");
	        }
	        System.out.println();
	    }
	 
	public static int SomaArray(int[] array) {
        int soma = 0;

        for (int elemento : array) {
            soma += elemento;
        }
        return soma;
    }
	
	public static int MenorValorArray(int[] array) {
        int menor = array[0];

        for (int elemento : array) {
            if (elemento < menor) {
                menor = elemento;
            }
        }
        return menor;
    }
	
	public static int MaiorValorArray(int[] array) {
        int maior = array[0];

        for (int elemento : array) {
            if (elemento > maior) {
                maior = elemento;
            }
        }
        return maior;
    }
	
	 public static void main(String[] args) {
		 int[] arrayUsuario = ArrayUsuario();
	        System.out.print("Array do usuário: ");
	        imprimirArray(arrayUsuario);

	        int[] arrayAleatorio = ArrayAleatorio(5, 1, 100);
	        System.out.print("Array aleatório: ");
	        imprimirArray(arrayAleatorio);

	        int somaUsuario = SomaArray(arrayUsuario);
	        System.out.println("A soma dos elementos do array do usuario e " + somaUsuario);

	        int somaAleatorio = SomaArray(arrayAleatorio);
	        System.out.println("A soma dos elementos do array aleatorio e: " + somaAleatorio);

	        int maiorUsuario = MaiorValorArray(arrayUsuario);
	        System.out.println("O maior valor no array do usuario e: " + maiorUsuario);

	        int menorUsuario = MenorValorArray(arrayUsuario);
	        System.out.println("O menor valor no array do usuario e: " + menorUsuario);

	        int maiorAleatorio = MaiorValorArray(arrayAleatorio);
	        System.out.println("o maior valor no array aleatorio e: " + maiorAleatorio);

	        int menorAleatorio = MenorValorArray(arrayAleatorio);
	        System.out.println("o menor valor no array aleatorio e: " + menorAleatorio);
	    }
}
