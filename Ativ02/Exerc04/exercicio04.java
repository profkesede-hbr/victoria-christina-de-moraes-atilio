import java.util.Scanner;

public class exercicio04 {

    public static void exibirParcelas(double valorTotal, int numeroParcelas) {
        
        double valorDaParcela = valorTotal / numeroParcelas;
        
        for (int i = 1; i <= numeroParcelas; i++) {
            valorDaParcela = valorDaParcela * 1.01; 
            System.out.printf("Parcela %d: R$ %.2f\n", i, valorDaParcela);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor total da compra: ");
        double valorTotal = scanner.nextDouble();
        
        System.out.print("Digite o numero de parcelas: ");
        int numeroParcelas = scanner.nextInt();
        
        System.out.println("\n--- Resumo do Parcelamento ---");
        exibirParcelas(valorTotal, numeroParcelas);
        
        scanner.close();
    }
}