import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        
        double numero = scanner.nextDouble();

        if (numero > 0) {
            System.out.println("O numero " + numero + " e POSITIVO.");
        } else if (numero < 0) {
            System.out.println("O numero " + numero + " e NEGATIVO.");
        } else {
            System.out.println("O numero e ZERO.");
        }

        scanner.close();
    }
}