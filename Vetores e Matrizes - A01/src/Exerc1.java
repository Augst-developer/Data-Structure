import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a qtd de números recebidos:");
        int n = sc.nextInt();

        int[] v = new int[n];

        System.out.println("Digite os números:");
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        int pares = 0;

        int atual = v[0];
        int qtd = 1;

        for (int i = 1; i < n; i++) {
            if (v[i] == atual) {
                qtd++;
            } else {
                System.out.print("(" + atual + "," + qtd + ") ");
                pares++;

                atual = v[i];
                qtd = 1;
            }
        }

        // imprime o último par
        System.out.print("(" + atual + "," + qtd + ")");
        pares++;

        System.out.println();
        System.out.println("Pares: " + pares);

        sc.close();
    }
}