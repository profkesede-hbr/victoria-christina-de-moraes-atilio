// Subclasse
public class TransferenciaBancaria extends Transacao {
    private String contaOrigem;
    private String contaDestino;

    public TransferenciaBancaria(String id, double valor, String data, String contaOrigem, String contaDestino) {
        super(id, valor, data);
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public String resumoTransferencia() {
        return String.format("Transferência de R$ %.2f de %s para %s na data %s", 
                getValor(), contaOrigem, contaDestino, getData());
    }
}