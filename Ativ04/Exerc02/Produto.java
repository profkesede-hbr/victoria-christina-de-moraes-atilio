public class Produto {
    private String codigo;
    private String nome;
    private double preco;

    // Construtor 1: Sem parametros (valores padrao)
    public Produto() {
        this.codigo = "";
        this.nome = "";
        this.preco = 0.0;
    }

    // Construtor 2: Recebe codigo e nome (preco zero)
    public Produto(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = 0.0;
    }

    // Construtor 3: Recebe todos os atributos
    public Produto(String codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public static void main(String[] args) {
        // Testando os construtores
        Produto p1 = new Produto();
        Produto p2 = new Produto("TXT01", "Camiseta Branco");
        Produto p3 = new Produto("TXT02", "Calca Jeans", 120.00);
        
        System.out.println("Produtos criados com sucesso!");
    }
}