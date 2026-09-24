import java.util.ArrayList;

public class TADVeiculos {
    private ArrayList<Veiculo> veiculos;

    public TADVeiculos() {
        veiculos = new ArrayList<Veiculo>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public ArrayList<Veiculo> getTodosVeiculos() {
        return veiculos;
    }

    public int quantidadeDeVeiculosPorMarca(String marca) {
        int qte = 0;

        for (Veiculo veiculo : veiculos) {
            if (veiculo.getMarca().equalsIgnoreCase(marca)) {
                qte++;
            }
        }

        return qte;
    }

    public double mediaDosPrecosDosCaminhoesVendidos() {
        double soma = 0;
        int qte = 0;

        for (Veiculo veiculo : veiculos) {
            if (veiculo.getTipo().equalsIgnoreCase("caminhao")) {
                soma += veiculo.getPreco();
                qte++;
            }
        }

        if (qte == 0) {
            return 0;
        }

        return soma / qte;
    }

    public Veiculo veiculoMaisCaro() {
        Veiculo maisCaro = veiculos.get(0);

        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPreco() > maisCaro.getPreco()) {
                maisCaro = veiculo;
            }
        }

        return maisCaro;
    }

    public Veiculo veiculoMaisBarato() {
        Veiculo maisBarato = veiculos.get(0);

        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPreco() < maisBarato.getPreco()) {
                maisBarato = veiculo;
            }
        }

        return maisBarato;
    }

    public double mediaDosPrecosDeUmTipoDeVeiculo(String tipo) {
        double soma = 0;
        int qte = 0;

        for (Veiculo veiculo : veiculos) {
            if (veiculo.getTipo().equalsIgnoreCase(tipo)) {
                soma += veiculo.getPreco();
                qte++;
            }
        }

        if (qte == 0) {
            return 0;
        }

        return soma / qte;
    }

    public void listarTodosOsVeiculosDaLoja() {
        for (Veiculo veiculo : veiculos) {
            System.out.println("-----------------------------");
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println("Marca: " + veiculo.getMarca());
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Ano: " + veiculo.getAno());
            System.out.println("Preço: R$ " + veiculo.getPreco());
            System.out.println("Tipo: " + veiculo.getTipo());
        }
    }

    public void simularLeituraDeDados() {
        adicionarVeiculo(new Veiculo("ABC1D23", "Toyota", "Corolla", 2022, 135000, "automovel"));
        adicionarVeiculo(new Veiculo("DEF4G56", "Honda", "Civic", 2021, 128000, "automovel"));
        adicionarVeiculo(new Veiculo("HIJ7K89", "Volkswagen", "Gol", 2019, 55000, "automovel"));
        adicionarVeiculo(new Veiculo("LMN1O23", "Chevrolet", "Onix", 2020, 72000, "automovel"));
        adicionarVeiculo(new Veiculo("PQR4S56", "Hyundai", "HB20", 2023, 89000, "automovel"));
        adicionarVeiculo(new Veiculo("TUV7W89", "Ford", "Ranger", 2022, 210000, "automovel"));
        adicionarVeiculo(new Veiculo("XYZ1A23", "Fiat", "Argo", 2018, 48000, "automovel"));

        adicionarVeiculo(new Veiculo("BCD4E56", "Volvo", "FH 540", 2021, 650000, "caminhao"));
        adicionarVeiculo(new Veiculo("FGH7I89", "Scania", "R 450", 2020, 720000, "caminhao"));
        adicionarVeiculo(new Veiculo("JKL1M23", "Mercedes", "Actros 2651", 2022, 780000, "caminhao"));

        adicionarVeiculo(new Veiculo("MNO4P56", "Yamaha", "Fazer 250", 2022, 24000, "moto"));
        adicionarVeiculo(new Veiculo("QRS7T89", "Honda", "CG 160 Titan", 2023, 18500, "moto"));
    }
}