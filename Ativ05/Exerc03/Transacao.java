// Classe Base
public class Transacao {
    private String id;
    private double valor;
    private String data;

    public Transacao(String id, double valor, String data) {
        this.id = id;
        this.valor = valor;
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }
}