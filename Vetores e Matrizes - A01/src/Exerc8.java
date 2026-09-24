import java.util.Scanner;

class Assentos {

    private int[][] matriz;

    public Assentos(int[][] matriz) {
        this.matriz = matriz;
    }

    public int[] reservarBloco(int qtd) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j <= matriz[i].length - qtd; j++) {

                boolean encontrou = true;

                for (int k = 0; k < qtd; k++) {
                    if (matriz[i][j + k] != 0) {
                        encontrou = false;
                    }
                }

                if (encontrou) {

                    for (int k = 0; k < qtd; k++) {
                        matriz[i][j + k] = 1;
                    }

                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}

public class Exerc8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a qtd de linhas: ");
        int linhas = sc.nextInt();

        System.out.print("Digite a qtd de colunas: ");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os assentos (0 livre / 1 ocupado):");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite a qtd de assentos para reservar: ");
        int qtd = sc.nextInt();

        Assentos assentos = new Assentos(matriz);

        int[] resultado = assentos.reservarBloco(qtd);

        System.out.println("Resultado: {" + resultado[0] + ", "
                + resultado[1] + "}");

        System.out.println("\nMapa final da sala: ");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}