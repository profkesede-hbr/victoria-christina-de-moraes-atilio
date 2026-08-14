public class MainCarrinhoDeCompras {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Testando a Versão 1 (Apenas 2 preços)
        double total1 = carrinho.calcularTotal(50.0, 30.0);
        System.out.println("Total (2 produtos): R$ " + total1);

        // Testando a Versão 2 (2 preços + 10% de desconto)
        double total2 = carrinho.calcularTotal(50.0, 30.0, 10.0);
        System.out.println("Total (2 produtos + 10% de desconto): R$ " + total2);

        // Testando a Versão 3 (Inúmeros preços com varargs)
        double total3 = carrinho.calcularTotal(10.0, 25.50, 5.0, 40.0, 19.99);
        System.out.println("Total (Vários produtos): R$ " + total3);
    }
}