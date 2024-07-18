import java.util.Scanner;

public class SecondEx {
    public static void main(String[] args) {

        int n = scanner("Escreva um numero: ").nextInt();
        int fat = n; // inicializa o fatorial como n

        while (n > 1){
            fat *= (n - 1); // fatorial vai multiplicar (n - 1)
            n--; // n vai decrementando até chegar em 1 parar
        }
        System.out.println("Fatorial de N: "+fat);
    }
    public static Scanner scanner(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
