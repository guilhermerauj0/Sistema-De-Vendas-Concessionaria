public class VendedorComum implements Vendedor{

    @Override
    public void vender(Veiculo veiculo) {
        //TODO Implementar lógica de venda
    }

    @Override
    public double calcularComissao(double valorVenda) {
        return valorVenda * 0.05;
    }


}
