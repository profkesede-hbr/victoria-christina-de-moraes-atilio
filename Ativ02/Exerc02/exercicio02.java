import java.util.Scanner;

public class exercicio02 {

    public static boolean  validarEstoque(int qdtDisponivel, int qdtDesejada) {

        return qdtDisponivel >= qdtDesejada; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade disponivel em estoque: ");
        int qdtDisponivel = scanner.nextInt();

        System.out.print("Digite a quantidade desejada pelo cliente: ");
        int qdtDesejada = scanner.nextInt();
        
        boolean resultado = validarEstoque(qdtDisponivel, qdtDesejada);

        if (resultado){
            System.out.printf("Estoque disponivel");
        } else{
            System.out.printf("Estoque nao disponivel");
        }
        scanner.close();
    }
}