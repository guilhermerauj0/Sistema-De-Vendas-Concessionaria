public class VendedorComum implements Vendedor{
    private double comissao;

    @Override
    public void vender(Veiculo veiculo) {
        //TODO Implementar lógica de venda
    }

    @Override
    public double calcularComissao(double valorVenda) {
        return comissao = (valorVenda * 0.05)-valorVenda;
    }


}
