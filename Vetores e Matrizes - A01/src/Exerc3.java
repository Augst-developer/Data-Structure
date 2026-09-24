import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a qtd de eventos:");
        int n = sc.nextInt();

        int[] v = new int[n];

        System.out.println("Digite os eventos:");
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        //inversão
        int inicio = 0;
        int fim = n - 1;

        while (inicio < fim) {
            int temp = v[inicio];
            v[inicio] = v[fim];
            v[fim] = temp;

            inicio++;
            fim--;
        }

        // exibe o vetor invertido
        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + " ");
        }

        sc.close();
    }
}