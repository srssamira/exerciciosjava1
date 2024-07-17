import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        String binario = scan("Escreva um valor binario: ").nextLine();
        int number = Integer.parseInt(binario, 2);
        // autoexplicaçao sobre parseInt:
        // parseInt(string, radix). a string eh o texto a ser convertido
        // em valor numerico e radix eh a base do sistema numero para a conversao
        // se for um numero binario, inserir 2. se for octal, inserir 8, se
        // for hexadecimal, inserir 16. decimal eh 10. feito isso, a string
        // sera convertida com base nesses parametros
        System.out.println(number);
    }
    public static Scanner scan(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
