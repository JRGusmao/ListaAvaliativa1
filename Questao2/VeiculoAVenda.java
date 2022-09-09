package ListaAvaliativa1.Questao2;

public class VeiculoAVenda {
    protected String tipo, placaDoVeiculo;
    protected int anoDeLancamento;
    protected double precoDeVenda;

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getPlacaDoVeiculo() {
        return placaDoVeiculo;
    }

    public double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setAno(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setPlacaDoVeiculo(String placaDoVeiculo) {
        this.placaDoVeiculo = placaDoVeiculo;

    }

    public void setPrecoDeVenda(double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        String descricao = "Tipo do veículo: " + this.tipo + "\n" + "Placa do veículo: " + this.placaDoVeiculo + "\n"
                + "Ano de lançamento: " + this.anoDeLancamento + "\n" + "Preço de Venda: " + this.precoDeVenda;
        return descricao;
    }

    public void set(String placaDoVeiculo, int anoDeLancamento, double precoDeVenda, String tipo) {
        this.placaDoVeiculo = placaDoVeiculo;
        this.precoDeVenda = precoDeVenda;
        this.anoDeLancamento = anoDeLancamento;
        this.tipo = tipo;

    }

    public VeiculoAVenda(String tipo, int anoDeLancamento, String placaDoVeiculo, double precoDeVenda) {
        this.placaDoVeiculo = placaDoVeiculo;
        this.precoDeVenda = precoDeVenda;
        this.anoDeLancamento = anoDeLancamento;
        this.tipo = tipo;

    }

}