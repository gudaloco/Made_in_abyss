package aula1;

public class Exercicio_03 {

    public static int converterParaDecimal(int[] binario) {

        int decimal = 0;
        for (int i = 0; i < binario.length; i++) {

            decimal += binario[i] * Math.pow(2, 7 - i);
        }

        return decimal;
    }

    public static void main(String[] args) {
        int[] binario = { 1, 1, 0, 0, 1, 0, 0, 0 };
        int decimal = converterParaDecimal(binario);

        System.out.println("O número decimal é: " + decimal);
    }
}
