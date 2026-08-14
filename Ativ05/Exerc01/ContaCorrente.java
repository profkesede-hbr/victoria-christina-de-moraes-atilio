// Subclasse
public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, String numeroConta, double saldo, double limiteChequeEspecial) {
        super(titular, numeroConta, saldo); 
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public boolean sacarComChequeEspecial(double valor) {
        double saldoDisponivel = getSaldo() + limiteChequeEspecial;
        
        if (valor > 0 && valor <= saldoDisponivel) {
            setSaldo(getSaldo() - valor); 
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo e limite insuficientes para o saque.");
            return false;
        }
    }
}