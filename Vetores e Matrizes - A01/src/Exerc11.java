import java.util.Scanner;

class ResultadoPesquisa {

    private int[] respostas;

    public ResultadoPesquisa(int[] respostas) {
        this.respostas = respostas;
    }

    public void mostrarResultados() {
        int[] quantidade = new int[6];

        for (int i = 0; i < respostas.length; i++) {
            quantidade[respostas[i]]++;
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Nota " + i + ": "
                    + quantidade[i]);
        }
    }
}

public class Exerc11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a qtd de respostas: ");
        int n = sc.nextInt();

        int[] respostas = new int[n];

        System.out.println("Digite as respostas de 1 a 5:");

        for (int i = 0; i < n; i++) {
            respostas[i] = sc.nextInt();
        }

        ResultadoPesquisa resultado =
                new ResultadoPesquisa(respostas);

        resultado.mostrarResultados();

        sc.close();
    }
}