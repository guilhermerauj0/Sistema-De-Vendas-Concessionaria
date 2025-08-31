public class CarroNovo extends Veiculo{
    private double imposto;

    public CarroNovo() {

    }

    // TODO Implementar regra de negocio
    @Override
    public void calcularPrecoFinal() {
        super.calcularPrecoFinal();
    }

    public void adicionarImpostos(double imposto){
        this.imposto = preco + imposto;
    }

    public double getImposto() {
        return imposto;
    }
}
