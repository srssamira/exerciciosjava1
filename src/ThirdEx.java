import java.util.Scanner;

public class ThirdEx {
    public static void main(String[] args) {
        int number = scanner("Escreva um numero: ").nextInt();
        String textNumber = Integer.toString(number); // metodo dentro da classe Integer que converte um inteiro para String

        System.out.println(textNumber.length());
    }
    public static Scanner scanner(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
