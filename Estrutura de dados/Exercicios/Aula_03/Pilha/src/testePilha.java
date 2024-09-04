import javax.sound.sampled.SourceDataLine;

public class testePilha {

    public static void main(String[] args) {
        PilhaVetor minhaPilha = new PilhaVetor(10);
        System.out.println("pilha esta vazia?: " + minhaPilha.pilhaVazia());

        System.out.println("pilha esta Cheia?: " + minhaPilha.pilhaCheia());

        for (int i = 0; i < 10; i++) {
            minhaPilha.empilhar(i);
            System.out.println(i);
        }

        System.out.println("\n===================");
        System.out.print(minhaPilha.desempilha());

    }
}
