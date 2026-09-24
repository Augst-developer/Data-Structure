import java.util.Scanner;

class ControleEstoque {

    private int[][] estoque;

    public ControleEstoque(int[][] estoque) {
        this.estoque = estoque;
    }

    public int estoqueProduto(int produto) {
        int total = 0;

        for (int j = 0; j < estoque[produto].length; j++) {
            total += estoque[produto][j];
        }

        return total;
    }

    public int estoqueGeral() {
        int total = 0;

        for (int i = 0; i < estoque.length; i++) {
            for (int j = 0; j < estoque[i].length; j++) {
                total += estoque[i][j];
            }
        }

        return total;
    }
}

public class Exerc9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a qtd de produtos: ");
        int produtos = sc.nextInt();

        System.out.print("Digite a qtd de filiais: ");
        int filiais = sc.nextInt();

        int[][] estoque = new int[produtos][filiais];

        System.out.println("Digite o estoque:");

        for (int i = 0; i < produtos; i++) {
            for (int j = 0; j < filiais; j++) {
                estoque[i][j] = sc.nextInt();
            }
        }

        ControleEstoque controle = new ControleEstoque(estoque);

        System.out.print("Digite o produto para consultar: ");
        int produto = sc.nextInt();

        System.out.println("Estoque do produto: "
                + controle.estoqueProduto(produto));

        System.out.println("Estoque geral: "
                + controle.estoqueGeral());

        sc.close();
    }
}