public class CarroNovo extends Veiculo{
    private double imposto;

    public CarroNovo() {

    }

    public void adicionarImpostos(double imposto){
        this.imposto = preco + imposto;
    }

    public double getImposto() {
        return imposto;
    }
}
