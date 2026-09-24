public class Pilha {

    private char[] elementos;
    private int topo;

    public Pilha(int tamanho) {
        elementos = new char[tamanho];
        topo = -1;
    }

    public boolean vazia() {
        return topo == -1;
    }

    public void empilhar(char elemento) {
        topo++;
        elementos[topo] = elemento;
    }

    public char desempilhar() {
        char elemento = elementos[topo];
        topo--;
        return elemento;
    }

    public char topo() {
        return elementos[topo];
    }
}
