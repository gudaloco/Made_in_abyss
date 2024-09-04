public class Recursivo_numeroINT {
    public static void main(String[] args) {
        System.out.println("potencia: " + pot(10,10));
    }

    public static long pot(int base, int potencia){
        if(potencia == 0){
            return 1;
        }else{
            return base * pot(base, potencia - 1);
        }
    }
}