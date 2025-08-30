public class CarroUsado extends Veiculo{
    private double precoInicial;
    private int ano;
    private int anoAtual = 2025;
    private double precoDepreciado;
    private  double valorVenda;

    public CarroUsado(double valorVenda){
        this.valorVenda = valorVenda;
    }

    public double calcularDepreciacao(){
        this.ano = getAno();
        this.precoInicial = getPreco();
        precoDepreciado = ((precoInicial - valorVenda)/(anoAtual - this.ano)) * (anoAtual - this.ano);
        return precoDepreciado;
    }
}
