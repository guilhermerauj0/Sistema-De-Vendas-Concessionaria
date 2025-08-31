public class Funcionario {

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
