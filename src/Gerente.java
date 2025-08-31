public class Gerente implements  Vendedor{

    @Override
    public void vender(Veiculo veiculo) {
        // TODO Implementar lógica de venda
    }

    // Retorna o valor da comissao
    @Override
    public double calcularComissao(double valorVenda) {
        return valorVenda * 0.1;
    }


}
