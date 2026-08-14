public class MainCalculadoraFinanceira {
    public static void main(String[] args) {
        CalculadoraFinanceira calc = new CalculadoraFinanceira();

        // Testando a Versão 1 (Capital: 1000, Taxa: 2.0%, Tempo: 6 meses)
        double juros1 = calc.calcularJuros(1000.0, 2.0, 6);
        System.out.println("Juros (1000, 2.0%, 6 meses): R$ " + juros1);

        // Testando a Versão 2 (Capital: 1000, Taxa: 2.0%, Tempo padrão: 12 meses)
        double juros2 = calc.calcularJuros(1000.0, 2.0);
        System.out.println("Juros (1000, 2.0%, 12 meses): R$ " + juros2);

        // Testando a Versão 3 (Capital: 1000, Taxa padrão: 1.5%, Tempo padrão: 12 meses)
        double juros3 = calc.calcularJuros(1000.0);
        System.out.println("Juros (1000, 1.5%, 12 meses): R$ " + juros3);
    }
}