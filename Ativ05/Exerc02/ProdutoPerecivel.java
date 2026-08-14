// Subclasse
public class ProdutoPerecivel extends Produto {
    private String dataValidade;

    public ProdutoPerecivel(String codigo, String nome, double preco, String dataValidade) {
        super(codigo, nome, preco);
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(String dataAtualStr) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate validade = LocalDate.parse(this.dataValidade, formatter);
            LocalDate atual = LocalDate.parse(dataAtualStr, formatter);
            
            return atual.isAfter(validade); 
        } catch (DateTimeParseException e) {
            System.out.println("Formato de data inválido. Use dd/MM/yyyy.");
            return false;
        }
    }
}