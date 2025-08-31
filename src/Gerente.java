public class Gerente implements  Vendedor{
    private double comissao;
    @Override
    public void vender(Veiculo veiculo) {
        // TODO Implementar lógica de venda
    }

    // Retorna o valor da comissao
    @Override
    public double calcularComissao(double valorVenda) {
        return comissao = (valorVenda * 0.1)-valorVenda;
    }


}
