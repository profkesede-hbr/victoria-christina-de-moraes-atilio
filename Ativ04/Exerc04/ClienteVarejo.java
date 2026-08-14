public class ClienteVarejo {
    private String nome;
    private String cpf;

    // Construtor 1: Sem parametros (strings vazias)
    public ClienteVarejo() {
        this.nome = "";
        this.cpf = "";
    }

    // Construtor 2: Recebe nome e cpf
    public ClienteVarejo(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public static void main(String[] args) {
        // Testando os construtores
        ClienteVarejo cli1 = new ClienteVarejo();
        ClienteVarejo cli2 = new ClienteVarejo("Carlos Silva", "11122233344");
        
        System.out.println("Clientes criados com sucesso!");
    }
}