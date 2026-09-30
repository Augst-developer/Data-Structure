

public class ItemCompra {
    private Produto produto;
    private int quantidade;

    public ItemCompra(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double obterSubtotal() {
        return quantidade * produto.getPreco();
    }

    public void mostrar() {
        System.out.printf("%-40s R$ %8.2f %5d R$ %8.2f%n",
                produto.getDescricao(),
                produto.getPreco(),
                quantidade,
                obterSubtotal());
    }
}