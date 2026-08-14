public class CalculadoraFinanceira {

    // Versão 1: Recebe capital, taxa e tempo
    public double calcularJuros(double capital, double taxaMensal, int tempoMeses) {
        return (capital * taxaMensal * tempoMeses) / 100.0;
    }

    // Versão 2: Recebe apenas capital e taxa (assume tempo padrão de 12 meses)
    public double calcularJuros(double capital, double taxaMensal) {
        return calcularJuros(capital, taxaMensal, 12);
    }

    // Versão 3: Recebe apenas capital (assume taxa de 1.5% e tempo de 12 meses)
    public double calcularJuros(double capital) {
        return calcularJuros(capital, 1.5, 12);
    }
}