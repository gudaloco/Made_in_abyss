package aula1;

public class Exercicio_07 {

	public static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("|" + "\t" + matriz[i][j] + "\t");
			}
			System.out.println("|");
		}
	}

	public static int[][] transporMatriz(int[][] matrizOriginal) {
		int linhas = matrizOriginal.length;
		int colunas = matrizOriginal[0].length;
		int[][] matrizTransposta = new int[colunas][linhas];

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matrizTransposta[j][i] = matrizOriginal[i][j];
			}
		}

		return matrizTransposta;
	}

	public static void main(String[] args) {
		int[][] matrizOriginal = {
				{ 1, 2 },
				{ 3, 4 },
				{ 5, 6 }
		};

		int[][] matrizTransposta = transporMatriz(matrizOriginal);

		System.out.println("Matriz Original [3x2]:");
		imprimirMatriz(matrizOriginal);

		System.out.println("Matriz Transposta [2x3]:");
		imprimirMatriz(matrizTransposta);
	}
}
