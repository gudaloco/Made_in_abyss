package aula1;

public class Exercicio_04 {

	public static int[] converterParaBinario(int decimal) {

		int[] binario = new int[8];

		for (int i = 7; i >= 0; i--) {
			binario[i] = decimal % 2;
			decimal = decimal / 2;
		}

		return binario;
	}

	public static void main(String[] args) {
		int decimal = 200;
		int[] binario = converterParaBinario(decimal);

		for (int bit : binario) {
			System.out.print(bit);
		}
	}
}
