import java.util.Scanner;

public class SixthEx {
    public static void main(String[] args) {
        int base = scan("Escreva a base: ").nextInt();
        int exponent = scan("Escreva o expoente: ").nextInt();
        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        System.out.println(base + "^" + exponent + " = " + result);

    }

    public static Scanner scan(String message) {
        System.out.println(message);
        return new Scanner(System.in);
    }

}
