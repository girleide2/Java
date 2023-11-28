package P002;

import java.util.Random;

public class ManipulaArray {
	private int[] array;
	
	public static int[] ArrayAleatorio(int tamanho, int limInferior, int limSuperior) {
        Random rand = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = rand.nextInt(limSuperior - limInferior + 1) + limInferior;
        }

        return array;
    }
	
	public static int[] ArrayUsuario(int tamanho, int limInferior, int limSuperior) {
		
		System.out.print("Digite o tamanho do array: ");
        int tamanho = sc.nextInt();
        
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = rand.nextInt(limSuperior - limInferior + 1) + limInferior;
        }

        return array;
    }
}
