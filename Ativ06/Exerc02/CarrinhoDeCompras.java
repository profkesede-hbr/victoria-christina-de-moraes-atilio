public class CarrinhoDeCompras {

    // Versão 1: Soma simples de dois preços
    public double calcularTotal(double preco1, double preco2) {
        return preco1 + preco2;
    }

    // Versão 2: Soma de dois preços com aplicação de desconto percentual
    public double calcularTotal(double preco1, double preco2, double descontoPercentual) {
        double soma = preco1 + preco2;
        double valorDesconto = soma * (descontoPercentual / 100.0);
        return soma - valorDesconto;
    }

    // Versão 3: Soma para uma quantidade indefinida de preços usando varargs (double...)
    public double calcularTotal(double... precos) {
        double total = 0.0;
        for (double preco : precos) {
            total += preco;
        }
        return total;
    }
}