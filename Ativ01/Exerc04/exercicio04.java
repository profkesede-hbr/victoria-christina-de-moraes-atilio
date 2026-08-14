import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        
        double valor = scanner.nextDouble();

        System.out.print("Digite a media: ");
        
        double media = scanner.nextDouble();

        if (valor > media) {
            System.out.println("O valor esta " + (valor - media) + " acima da media.");
        } else if (valor < media) {
            System.out.println("O valor esta " + (media - valor) + " abaixo da media.");
        }else{
            System.out.println("A distancia e 0.");
        }

        scanner.close();
    }
}
