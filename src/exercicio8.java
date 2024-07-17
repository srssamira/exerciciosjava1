import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        int n = scan("Escreva um numero: ").nextInt();
        int m = scan("Escreva ate onde quer encontrar seu multiplo: ").nextInt();

        for (int i = 1; i <= m; i++){
            // se o resultado da multiplicacao de n por i (ex 3 por 5) dividido por
            if  ((n * i) <= m){
                System.out.println(n * i);
            }
        }


    }
    public static Scanner scan(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
