import java.util.Scanner;

class EstatisticaVetor {

    private int[] vetor;

    public EstatisticaVetor(int[] vetor) {
        this.vetor = vetor;
    }

    public int maior() {
        int maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }

    public int menor() {
        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        return menor;
    }

    public double media() {
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        return (double) soma / vetor.length;
    }
}

public class Exerc6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a qtd de dias: ");
        int n = sc.nextInt();

        int[] passos = new int[n];

        System.out.println("Digite os passos:");

        for (int i = 0; i < n; i++) {
            passos[i] = sc.nextInt();
        }

        EstatisticaVetor estatistica = new EstatisticaVetor(passos);

        System.out.println("Maior: " + estatistica.maior());
        System.out.println("Menor: " + estatistica.menor());
        System.out.println("Media: " + estatistica.media());

        sc.close();
    }
}