public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    // Construtor 1: Sem parametros
    public ContaBancaria() {
        this.titular = "";
        this.numeroConta = "";
        this.saldo = 0.0;
    }

    // Construtor 2: Recebe titular e numero da conta (saldo zero)
    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    // Construtor 3: Recebe todos os atributos
    public ContaBancaria(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        // Testando os construtores
        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria("Joao", "123-4");
        ContaBancaria c3 = new ContaBancaria("Maria", "567-8", 1500.50);
        
        System.out.println("Contas criadas com sucesso!");
    }
}