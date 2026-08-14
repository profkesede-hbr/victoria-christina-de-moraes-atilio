import java.util.Scanner;

public class exercicio03 {

    public static double calcularTotal(String formaPagamento, double valorCompra) {
        
        switch (formaPagamento.toUpperCase()) {
            case "DEBITO":
            case "PIX":
                return valorCompra;
            case "CREDITO":
                return valorCompra * 1.02;
            default:
                return -1; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor da compra: ");
        double valorDaCompra = scanner.nextDouble();
        
        System.out.print("Digite a forma de pagamento (DEBITO, CREDITO ou PIX): ");
        String formaPagamento = scanner.next();
        
        double resultado = calcularTotal(formaPagamento, valorDaCompra);
        
        if (resultado == -1) {
            System.out.println("Forma de pagamento invalida!");
        } else {
            System.out.printf("Valor final da compra: R$ %.2f\n", resultado);
        }
        
        scanner.close();
    }
}