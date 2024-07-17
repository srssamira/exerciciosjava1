import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        int number = scan("Escreva um numero: ").nextInt();
        String textNumber = Integer.toString(number);
        String textNumber2 = "";
        boolean palindromo = true;

        for (int i = textNumber.length() - 1; i >= 0; i--) {
            textNumber2 += textNumber.charAt(i);
        }

        if (textNumber.compareTo(textNumber2) == 0) {
            System.out.println(palindromo);
        } else System.out.println(false);
    }

    public static Scanner scan(String message) {
        System.out.println(message);
        return new Scanner(System.in);
    }
}
