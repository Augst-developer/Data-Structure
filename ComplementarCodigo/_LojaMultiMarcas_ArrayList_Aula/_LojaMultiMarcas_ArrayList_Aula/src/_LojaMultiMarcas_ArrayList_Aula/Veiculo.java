package _LojaMultiMarcas_ArrayList_Aula;

//Classe Veículo contendo dados de veículos.
//Os seus dados são: placa, marca, modelo 
//ano, preco e tipo.
//Autor: Ivan Carlos Alcântara de Oliveira.
//Data da Criação: 14/02/2026. 15h.
public class Veiculo {
    private String placa, marca, modelo; 
    private int ano; 
    private float preco;
    private String tipo;

    public Veiculo () {
        placa="-"; marca="-"; modelo="-";
        ano=0; preco=0.0f; tipo="-";
    }
    
    public Veiculo (String placa, String marca, String modelo,
                    int ano, float preco, String tipo)
    {
        setPlaca(placa); // ou usar:  this.placa = placa;
        setMarca(marca); 
        setModelo(modelo);
        setAno(ano); 
        setPreco(preco); 
        setTipo(tipo);
    }
    
    
    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = 0;
        if(ano>1900)this.ano = ano;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = 0.0f;
        if(preco>0)this.preco = preco;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String toString() {
        return (String.format("%10s %12s %12s %5d R$ %16.2f %10s.", getPlaca(), getMarca(), getModelo(), getAno(), getPreco(), getTipo()));
    }
    
}
