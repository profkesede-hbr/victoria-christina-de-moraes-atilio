public class ItemCarrinho {
    private String produto;
    private int quantidade;
    private double precoUnitario;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 1) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Erro: A quantidade nao pode ser menor que 1!");
        }
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario > 0) {
            this.precoUnitario = precoUnitario;
        } else {
            System.out.println("Erro: O preco unitario deve ser positivo!");
        }
    }

    public double calcularSubtotal() {
        return quantidade * precoUnitario;
    }

    public static void main(String[] args) {
        ItemCarrinho item = new ItemCarrinho();
        
        item.setProduto("Teclado Mecanico");
        item.setQuantidade(2);
        item.setPrecoUnitario(150.00);
        
        item.setQuantidade(0); // Teste erro
        
        System.out.println("\n--- Item no Carrinho ---");
        System.out.println("Produto: " + item.getProduto());
        System.out.println("Quantidade: " + item.getQuantidade());
        System.out.printf("Preco Unitario: R$ %.2f\n", item.getPrecoUnitario());
        System.out.printf("Subtotal: R$ %.2f\n", item.calcularSubtotal());
    }
}