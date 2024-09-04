package aula1;

public class Exercicio_06 {

	public static void imprimirMatriz(char[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				System.out.print("|" + "\t" + matriz[i][j] + "\t");
			}
			System.out.println("|");
		}
	}

	public static void main(String[] args) {
		char[][] matriz = {
				{ 'X', 'X', 'X' },
				{ 'Y', 'Y', 'Y' },
				{ 'Z', 'Z', 'Z' }
		};

		imprimirMatriz(matriz);
	}
}
