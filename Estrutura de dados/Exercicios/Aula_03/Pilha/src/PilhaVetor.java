public class PilhaVetor {

    /*
     * Metodos Obrigatórios
     * Empilhar(Obj elemento)
     * Obj Desempilhar()
     * Booleano Pilha Vazia()
     * Booleano Pilha Cheia()
     */

    Object[] elementos;
    int indice;

    // ****** Construtor ******
    // tdd
    public PilhaVetor(int tamanho) {
        this.elementos = new Object[tamanho];
        indice = 0;
    }

    //Empilha o item no topo da pilha se não tiver cheia
    public void empilhar(Object item) {
        if (!pilhaCheia())
            elementos[indice] = item;
        indice++;
    }

    public Object desempilha() {
        // Desempilhar remove o item do topo da pilha e retorna o valor
        //se não estiver vazia
        if(!pilhaVazia()){
            i--;
            return elementos[indice];
        }
        else return null;
        
    }

    public boolean pilhaVazia() {
        if (indice == 0)
            return true;
        else
            return false;
    }

    public boolean pilhaCheia() {
        if (indice == elementos.length - 1)
            return true;
        else
            return false;
    }

}
