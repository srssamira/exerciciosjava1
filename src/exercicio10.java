import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        int n = scan("Escreva ate onde voce deseja calcular a sequencia de fibonacci: ").nextInt();
        int fibA = 1, fibB = 0;
        System.out.println(fibB);
        System.out.println(fibA);

        for (int i = 0; i < n - 2; i++){
            fibA = fibA + fibB;
            fibB = fibA - fibB;
            System.out.println(fibA);
        }

    }
    public static Scanner scan(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
