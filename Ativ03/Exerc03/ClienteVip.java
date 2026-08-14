public class ClienteVip {
    private String nome;
    private String cpf;
    private double limiteCredito;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        if (limiteCredito >= 1000.0 && limiteCredito <= 100000.0) {
            this.limiteCredito = limiteCredito;
        } else {
            System.out.println("Erro: O limite de credito deve estar entre R$ 1.000,00 e R$ 100.000,00!");
        }
    }

    public void exibirCliente() {
        System.out.println("\n--- Cliente VIP ---");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.printf("Limite de Credito: R$ %.2f\n", limiteCredito);
        System.out.println("-------------------\n");
    }

    public static void main(String[] args) {
        ClienteVip cliente = new ClienteVip();
        cliente.setNome("Maria Oliveira");
        cliente.setCpf("111.222.333-44");
        
        cliente.setLimiteCredito(500); // Teste erro (menor que 1000)
        cliente.setLimiteCredito(5000); // Sucesso
        
        cliente.exibirCliente();
    }
}