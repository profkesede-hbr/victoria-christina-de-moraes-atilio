import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        
        double numero = scanner.nextDouble();

        if (numero % 2 == 0) {
            System.out.println("O numero " + numero + " e PAR.");
        } else {
            System.out.println("O numero " + numero + " e IMPAR.");
        }

        scanner.close();
    }
}
