

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TesteCarrinho {

    public static ArrayList<Produto> carregarProdutos(String arquivo)
            throws IOException {

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");

                int codigo = Integer.parseInt(dados[0]);
                String descricao = dados[1];
                double preco = Double.parseDouble(dados[2]);

                Produto produto = new Produto(codigo, descricao, preco);
                listaProdutos.add(produto);
            }
        }

        return listaProdutos;
    }

    public static Produto buscarProduto(ArrayList<Produto> listaProdutos,
                                        int codigo) {

        for (Produto produto : listaProdutos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }

        return null;
    }

    public static int lerInteiro(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = scanner.nextLine();

            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Digite um número inteiro válido.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            ArrayList<Produto> listaProdutos =
                    carregarProdutos("produtos.txt");

            ArrayList<ItemCompra> listaItens = new ArrayList<>();

            System.out.println("Produtos carregados: "
                    + listaProdutos.size());

            while (true) {
                int codigo = lerInteiro(scanner,
                        "\nDigite o código do produto (0 para finalizar): ");

                if (codigo == 0) {
                    break;
                }

                Produto produto = buscarProduto(listaProdutos, codigo);

                if (produto == null) {
                    System.out.println("Produto não encontrado.");
                    continue;
                }

                System.out.println("Produto: " + produto.getDescricao());
                System.out.printf("Preço: R$ %.2f%n", produto.getPreco());

                int quantidade;

                do {
                    quantidade = lerInteiro(scanner,
                            "Digite a quantidade: ");

                    if (quantidade <= 0) {
                        System.out.println(
                                "A quantidade deve ser maior que zero.");
                    }
                } while (quantidade <= 0);

                ItemCompra item = new ItemCompra(produto, quantidade);
                listaItens.add(item);

                System.out.println("Produto adicionado ao carrinho.");
            }

            Carrinho carrinho = new Carrinho(listaItens, 10);
            carrinho.mostrar();

        } catch (IOException e) {
            System.out.println("Erro ao carregar o arquivo de produtos.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Erro no formato dos dados do arquivo.");
        }

        scanner.close();
    }
}