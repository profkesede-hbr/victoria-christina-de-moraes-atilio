public class Emprestimo {
    private double valor;
    private double taxaJuros;
    private int prazoMeses;

    // Construtor 1: Recebe valor e prazo (taxa padrao de 1.5)
    public Emprestimo(double valor, int prazoMeses) {
        this.valor = valor;
        this.prazoMeses = prazoMeses;
        this.taxaJuros = 1.5;
    }

    // Construtor 2: Recebe todos os atributos
    public Emprestimo(double valor, double taxaJuros, int prazoMeses) {
        this.valor = valor;
        this.taxaJuros = taxaJuros;
        this.prazoMeses = prazoMeses;
    }

    public static void main(String[] args) {
        // Testando os construtores
        Emprestimo emp1 = new Emprestimo(5000.00, 12); // Usara taxa de 1.5
        Emprestimo emp2 = new Emprestimo(10000.00, 2.0, 24); // Taxa personalizada de 2.0
        
        System.out.println("Emprestimos criados com sucesso!");
    }
}