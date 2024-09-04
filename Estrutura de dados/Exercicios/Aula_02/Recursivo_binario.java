public class Recursivo_binario {
    public static void main(String[] args) {
        binario(10);
    }

    public static void binario(int decimal){
        if(decimal <=2){
            System.out.print(decimal/2);
            System.out.print(decimal%2);
        }else{
            binario(decimal/2);
            System.out.print(decimal%2);
        }
    }
}