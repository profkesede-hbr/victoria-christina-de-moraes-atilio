public class ContaBancaria {
    
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0; 
    }

    // Getters e Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
   
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito invalido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor invalido para saque!");
        }
    }

    public void exibirExtrato() {
        System.out.println("\n--- Extrato Bancario ---");
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.printf("Saldo Atual: R$ %.2f\n", saldo);
        System.out.println("------------------------\n");
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Joao Silva", "12345-6");
        
        conta.depositar(500);
        conta.sacar(150);
        conta.sacar(1000);  // Teste erro
        
        conta.exibirExtrato();
    }
}