package aula1;

public class Exercicio_05 {

    public static int[] intercalarVetores(int[] vetor1, int[] vetor2) {

        int[] vetorIntercalado = new int[10];

        for (int i = 0; i < 5; i++) {
            vetorIntercalado[2 * i] = vetor1[i];
            vetorIntercalado[2 * i + 1] = vetor2[i];
        }

        return vetorIntercalado;
    }

    public static void main(String[] args) {
        int[] vetor1 = { 1, 3, 5, 7, 9 };
        int[] vetor2 = { 2, 4, 6, 8, 10 };

        int[] resultado = intercalarVetores(vetor1, vetor2);

        for (int numero : resultado) {
            System.out.print(numero + " ");
        }

    }
}
