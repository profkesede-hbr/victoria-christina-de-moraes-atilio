public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preco nao pode ser negativo!");
        }
    }

    public int getEstoque() {
        return estoque;
    }
 
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.estoque += quantidade;
        }
    }

    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && this.estoque >= quantidade) {
            this.estoque -= quantidade;
        } else {
            System.out.println("Erro: Quantidade invalida ou estoque insuficiente!");
        }
    }

    public void exibirProduto() {
        System.out.println("\n--- Dados do Produto ---");
        System.out.println("Nome: " + nome);
        System.out.printf("Preco: R$ %.2f\n", preco);
        System.out.println("Estoque atual: " + estoque + " unidades");
        System.out.println("------------------------\n");
    }

    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setNome("Notebook");
        p1.setPreco(3500.00);
        p1.setPreco(-50); // Teste erro
        
        p1.adicionarEstoque(10);
        p1.removerEstoque(3);
        
        p1.exibirProduto();
    }
}