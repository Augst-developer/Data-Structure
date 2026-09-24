import java.util.Scanner;

public class Exerc12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a qtd de alunos: ");
        int qtdAlunos = sc.nextInt();

        System.out.print("Digite a qtd de avaliacoes: ");
        int qtdAvaliacoes = sc.nextInt();

        Aluno[] alunos = new Aluno[qtdAlunos];
        double[][] notas = new double[qtdAlunos][qtdAvaliacoes];

        for (int i = 0; i < qtdAlunos; i++) {

            System.out.println("Aluno " + (i + 1));

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Matricula: ");
            String matricula = sc.next();

            alunos[i] = new Aluno(nome, matricula);

            System.out.println("Digite as notas:");

            for (int j = 0; j < qtdAvaliacoes; j++) {
                notas[i][j] = sc.nextDouble();
            }
        }

        Turma turma = new Turma(alunos, notas);

        System.out.println();

        turma.relatorio();

        sc.close();
    }
}