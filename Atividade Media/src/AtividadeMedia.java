public class AtividadeMedia {

    static long tempoProcessamento;

    public static double calcularMediaETempo(int[] vetor) {
        long inicio = System.nanoTime();

        int soma = 0;

        for (int valor : vetor) {
            soma += valor;
        }

        double media = (double) soma / vetor.length;

        long fim = System.nanoTime();

        tempoProcessamento = fim - inicio;

        return media;
    }

    public static void main(String[] args) {

        for (int n = 1; n <= 100; n++) {

            int[] vetor = new int[n];

            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = i + 1;
            }

            double media = calcularMediaETempo(vetor);

            System.out.println("N: " + n +
                    " | Média: " + media +
                    " | Tempo: " + tempoProcessamento + " ns");
        }
    }
}