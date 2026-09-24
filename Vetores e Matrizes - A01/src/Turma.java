public class Turma {

    private Aluno[] alunos;
    private double[][] notas;

    public Turma(Aluno[] alunos, double[][] notas) {
        this.alunos = alunos;
        this.notas = notas;
    }

    public double mediaAluno(int aluno) {
        double soma = 0;

        for (int j = 0; j < notas[aluno].length; j++) {
            soma += notas[aluno][j];
        }

        return soma / notas[aluno].length;
    }

    public int alunoMaiorMedia() {
        int maior = 0;

        for (int i = 1; i < alunos.length; i++) {
            if (mediaAluno(i) > mediaAluno(maior)) {
                maior = i;
            }
        }

        return maior;
    }

    public double mediaAvaliacao(int avaliacao) {
        double soma = 0;

        for (int i = 0; i < alunos.length; i++) {
            soma += notas[i][avaliacao];
        }

        return soma / alunos.length;
    }

    public int quantidadeAprovados() {
        int aprovados = 0;

        for (int i = 0; i < alunos.length; i++) {
            if (mediaAluno(i) >= 6.0) {
                aprovados++;
            }
        }

        return aprovados;
    }

    public void relatorio() {

        System.out.println("RELATORIO DA TURMA");

        for (int i = 0; i < alunos.length; i++) {
            System.out.println(
                    alunos[i].getNome() + " - " +
                            alunos[i].getMatricula() +
                            " - Media: " + mediaAluno(i)
            );
        }

        int maior = alunoMaiorMedia();

        System.out.println();
        System.out.println("Maior media: "
                + alunos[maior].getNome());

        System.out.println("Media das avaliacoes:");

        for (int j = 0; j < notas[0].length; j++) {
            System.out.println("Avaliacao " + (j + 1) + ": "
                    + mediaAvaliacao(j));
        }

        System.out.println("Quantidade de aprovados: "
                + quantidadeAprovados());
    }
}