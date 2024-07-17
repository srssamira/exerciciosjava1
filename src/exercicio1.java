import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        int n = scan("Escreva um numero: ").nextInt();
        int result = 0;

        for (int i = 1; i <= n; i++){
            result = result + i;
        }
        System.out.println(result);
    }
    public static Scanner scan(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
