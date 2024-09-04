
public class Exercicio_01 {
    public static int[] inverterVetor(int[] vetor) {

        int[] vetorInvertido = new int[8];
        for (int i = 0; i < vetor.length; i++) {
            vetorInvertido[i] = vetor[vetor.length - 1 - i];
        }
        return vetorInvertido;
    }

    public static void main(String[] args) {

        int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] vetorInvertido = inverterVetor(vetor);

        for (int i : vetorInvertido) {
            System.out.print(i + " ");
        }
    }
}
