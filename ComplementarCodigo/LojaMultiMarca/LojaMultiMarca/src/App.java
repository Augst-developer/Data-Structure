public class App {

    public static void main(String[] args) {

        TADVeiculos loja = new TADVeiculos();

        loja.simularLeituraDeDados();

        System.out.println("=== TODOS OS VEÍCULOS ===");
        loja.listarTodosOsVeiculosDaLoja();

        System.out.println();

        System.out.println("Quantidade de veículos da marca Toyota: "
                + loja.quantidadeDeVeiculosPorMarca("Toyota"));

        System.out.println("Quantidade de veículos da marca Honda: "
                + loja.quantidadeDeVeiculosPorMarca("Honda"));

        System.out.println();

        System.out.println("Média dos preços dos caminhões: R$ "
                + loja.mediaDosPrecosDosCaminhoesVendidos());

        System.out.println("Média dos preços dos automóveis: R$ "
                + loja.mediaDosPrecosDeUmTipoDeVeiculo("automovel"));

        System.out.println("Média dos preços das motos: R$ "
                + loja.mediaDosPrecosDeUmTipoDeVeiculo("moto"));

        System.out.println();

        Veiculo maisCaro = loja.veiculoMaisCaro();

        System.out.println("=== VEÍCULO MAIS CARO ===");
        System.out.println("Marca: " + maisCaro.getMarca());
        System.out.println("Modelo: " + maisCaro.getModelo());
        System.out.println("Preço: R$ " + maisCaro.getPreco());

        System.out.println();

        Veiculo maisBarato = loja.veiculoMaisBarato();

        System.out.println("=== VEÍCULO MAIS BARATO ===");
        System.out.println("Marca: " + maisBarato.getMarca());
        System.out.println("Modelo: " + maisBarato.getModelo());
        System.out.println("Preço: R$ " + maisBarato.getPreco());
    }
}