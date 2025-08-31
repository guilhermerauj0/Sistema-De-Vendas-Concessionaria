public class Funcionario implements Vendedor {

    @Override
    public void vender(Veiculo veiculo) {
        //TODO Implementar lógica de venda
    }

    public double calcularComissao(double valorVenda){
        return valorVenda * 0.05;
    }

    public double calcularComissao(double[] valoresVenda){
        double total = 0;
        for(double valor: valoresVenda){
            total += valor * 0.05;
        }

        return total;
    }
}
