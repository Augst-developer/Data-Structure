import java.util.Scanner;

class Boletim {

    private double[][] notas;

    public Boletim(double[][] notas) {
        this.notas = notas;
    }

    public double mediaAluno(int a) {
        double soma = 0;

        for (int j = 0; j < notas[a].length; j++) {
            soma += notas[a][j];
        }

        return soma / notas[a].length;
    }

    public double mediaProva(int p) {
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i][p];
        }

        return soma / notas.length;
    }
}

public class Exerc7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a qtd de alunos: ");
        int a = sc.nextInt();

        System.out.print("Digite a qtd de provas: ");
        int p = sc.nextInt();

        double[][] notas = new double[a][p];

        System.out.println("Digite as notas:");

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < p; j++) {
                notas[i][j] = sc.nextDouble();
            }
        }

        Boletim boletim = new Boletim(notas);

        for (int i = 0; i < a; i++) {
            System.out.println("Media do aluno " + (i + 1) + ": "
                    + boletim.mediaAluno(i));
        }

        for (int j = 0; j < p; j++) {
            System.out.println("Media da prova " + (j + 1) + ": "
                    + boletim.mediaProva(j));
        }

        sc.close();
    }
}