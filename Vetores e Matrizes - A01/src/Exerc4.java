import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a qtd de alunos: ");
        int a = sc.nextInt();

        System.out.print("Digite a qtd de provas: ");
        int p = sc.nextInt();

        double[][] notas = new double[a][p];

        for (int i = 0; i < a; i++) {
            System.out.println("Notas do aluno " + (i + 1) + ":");

            for (int j = 0; j < p; j++) {
                notas[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < a; i++) {
            double soma = 0;

            for (int j = 0; j < p; j++) {
                soma += notas[i][j];
            }

            double media = soma / p;

            System.out.println("Media do aluno " + (i + 1) + ": " + media);
        }

        sc.close();
    }
}