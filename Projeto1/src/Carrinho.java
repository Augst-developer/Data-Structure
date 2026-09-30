

import java.util.ArrayList;

public class Carrinho {
    private ArrayList<ItemCompra> listaItens;
    private double porcentagemDesconto;

    public Carrinho(ArrayList<ItemCompra> listaItens,
                    double porcentagemDesconto) {
        this.listaItens = listaItens;
        this.porcentagemDesconto = porcentagemDesconto;
    }

    public double obterSubtotal() {
        double subtotal = 0;

        for (ItemCompra item : listaItens) {
            subtotal += item.obterSubtotal();
        }

        return subtotal;
    }

    public double obterValorDesconto() {
        return obterSubtotal() * porcentagemDesconto / 100;
    }

    public double obterTotal() {
        return obterSubtotal() - obterValorDesconto();
    }

    public void mostrar() {
        System.out.println("\n================ CARRINHO DE COMPRAS ================");
        System.out.printf("%-40s %12s %5s %12s%n",
                "Item", "Preço", "Qtd.", "Subtotal");

        System.out.println("------------------------------------------------------");

        int numero = 1;

        for (ItemCompra item : listaItens) {
            System.out.print(numero + ". ");
            item.mostrar();
            numero++;
        }

        System.out.println("------------------------------------------------------");
        System.out.printf("Subtotal:        R$ %.2f%n", obterSubtotal());
        System.out.printf("Desconto (%.0f%%):  R$ -%.2f%n",
                porcentagemDesconto, obterValorDesconto());
        System.out.printf("Total:           R$ %.2f%n", obterTotal());
        System.out.println("======================================================");
    }
}