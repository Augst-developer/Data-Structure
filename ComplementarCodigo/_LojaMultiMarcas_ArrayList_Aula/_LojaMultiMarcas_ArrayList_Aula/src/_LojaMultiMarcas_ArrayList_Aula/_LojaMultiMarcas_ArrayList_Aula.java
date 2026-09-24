package _LojaMultiMarcas_ArrayList_Aula;

import java.util.ArrayList;
import java.util.Scanner;

//Classe _LojaMultiMarcas_ArrayList: encarregada de executar algumas funcionalidades
//com objetos do tipo Veiculo armazenados em um ArrayList.
//Autor: Ivan Carlos Alcântara de Oliveira.
//Data da Criação: 14/02/2026. 15h.
public class _LojaMultiMarcas_ArrayList_Aula {
	//inicia o ArrayList de Veiculos
	   // private ArrayList<Veiculo> veic = new ArrayList<Veiculo>(); 
	    //Outra forma de declaração
	    private ArrayList veic = new ArrayList();
		// Construtor encarregado de executar os métodos da classe
	    // _LojaMultiMarcas_ArrayList.
	    public _LojaMultiMarcas_ArrayList_Aula() {
	        simularLeituraDeDados();
	        mediaPrecosCaminhoesVendidos();
	        veiculoMaisCaroMaisBarato();
	        mediaPrecosDeUmTipoDeVeiculo();
	        listarTodosOsVeiculosDaLoja();
	    }

		// Calcula e apresenta a média dos preços dos Veiculos
		// tipo "caminhão".
	    public void mediaPrecosCaminhoesVendidos () {

		}
		

		// Determina e apresenta o veículo mais caro e mais barato
		// dentre os cadastrados. 
		public void veiculoMaisCaroMaisBarato() {
		}
	    
	    
		// Calcula e apresenta a média dos preços de um tipo
		// de Veiculo (lido do usuário).
		public void mediaPrecosDeUmTipoDeVeiculo () {
			Scanner entrada = new Scanner(System.in);
			float soma = 0.0f;  int cont = 0; char tipo;
			do {
				System.out.println("Digite o tipo de veículo (a - automóvel, c - caminhão e m - moto) que deseja analisar: ");
				tipo = Character.toLowerCase(entrada.next().charAt(0));

				if (tipo != 'a' && tipo != 'c' && tipo != 'm')
					System.out.println("Caracter "+ tipo + " inválido, digite novamente!");
			}while ((tipo != 'a' && tipo != 'c' && tipo != 'm'));
			
			String tipoNome = "";
			if (tipo == 'a') tipoNome = "automóvel";
			else if (tipo == 'c') tipoNome = "caminhão";
			else tipoNome = "moto";		
			
			
			entrada.close();
		}


		// Monta uma string contendo todos os Veiculos e apresenta
		public void listarTodosOsVeiculosDaLoja() {
			String cad = "";
			for(int i=0; i<veic.size(); i++) {
	            cad += ""+ String.format("%3do ",(i+1)) +veic.get(i).toString() + "\n";
			}
			System.out.print("\n--------------------------------------\n");
			System.out.print("Veículos Cadastrados:\n" + cad);
		}

		// Cadastra 12 Veiculos no ArrayList
		public void simularLeituraDeDados() {
			veic.add(new Veiculo("ABC1D23","Toyota","Corolla", 2022, 135000f,"automóvel")); 
			veic.add(new Veiculo("DEF4G56","Honda","Civic", 2021, 128000f,"automóvel")); 
			veic.add(new Veiculo("HIJ7K89","Volkswagen","Gol", 2019, 55000f,"automóvel")); 
			veic.add(new Veiculo("LMN1O23","Chevrolet","Onix", 2020, 72000f,"automóvel")); 
			veic.add(new Veiculo("PQR4S56","Hyundai","HB20", 2023, 89000f,"automóvel")); 
			veic.add(new Veiculo("TUV7W89","Ford","Ranger", 2022, 210000f,"automóvel")); 
			veic.add(new Veiculo("XYZ1A23","Fiat","Argo", 2018, 48000f,"automóvel")); 
			veic.add(new Veiculo("BCD4E56","Volvo","FH 540", 2021, 650000f,"caminhão")); 
			veic.add(new Veiculo("FGH7I89","Scania","R 450", 2020, 720000f,"caminhão")); 
			veic.add(new Veiculo("JKL1M23","Mercedes","Actros 2651", 2022, 780000f,"caminhão"));  
			veic.add(new Veiculo("MNO4P56","Yamaha","Fazer 250", 2022, 24000f,"moto")); 
			veic.add(new Veiculo("QRS7T89","Honda","CG 160 Titan", 2023, 18500f,"moto"));  
		}

		public static void main(String[] args) {
			new _LojaMultiMarcas_ArrayList_Aula();
			System.exit(0);
		}
}
