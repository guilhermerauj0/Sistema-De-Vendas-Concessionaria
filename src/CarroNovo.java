public class CarroNovo extends Veiculo{
    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    private double imposto;

    public CarroNovo(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public void adicionarImpostos(double imposto){
        this.imposto = preco + imposto;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public int getAno() {
        return ano;
    }

    @Override
    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    public double getImposto() {
        return imposto;
    }
}
