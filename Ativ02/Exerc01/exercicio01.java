import java.util.Scanner;

public class exercicio01 {

    public static double calcularDesconto(double valorDaCompra) {
        
        double valorFinal = 0; 

        if (valorDaCompra < 100){
            valorFinal = valorDaCompra * 0.95;
        } 
        else if (valorDaCompra < 500){
            valorFinal = valorDaCompra * 0.90;
        }
        else{
            valorFinal = valorDaCompra * 0.85;
        }

        return valorFinal; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor da compra: ");
        double valorDigitado = scanner.nextDouble();
        
        double resultado = calcularDesconto(valorDigitado);
        
        System.out.printf("Valor com desconto: R$ %.2f\n", resultado);
        
        scanner.close();
    }
}
