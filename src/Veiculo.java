import java.util.ArrayList;
import java.util.List;

public class Veiculo {
    String marca;
    String modelo;
    int ano;
    double preco;
    List<Servico> historicoManutencao;

    public void calcularPrecoFinal(){};

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<Servico> getHistoricoManutencao() {
        return historicoManutencao;
    }
}
