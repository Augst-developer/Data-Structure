import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da matriz: ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        System.out.println("Digite os valores:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz rotacionada:");

        for (int j = 0; j < n; j++) {
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}