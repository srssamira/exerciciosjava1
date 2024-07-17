import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        int number = scanner("Escreva um numero: ").nextInt();
        String textNumber = Integer.toString(number); // converter inteiro em caractere
        String textNumber2 = "";

        // no for abaixo, o indice começa no ultimo caracter do texto,
        // que, no caso, eh -1 pq o for começa a contar na posicao 0,
        // e vai até o primeiro caracter (que, por si só, está na posicao 0)
        // com o decremento do indice
        for (int i = textNumber.length() - 1; i >= 0; i--) {
            textNumber2 += textNumber.charAt(i);    // chartAt(i) eh um metodo que vai retornar
            // a string na posicao especificada,
            // lembrando que qnd falamos de posicao,
            // falamos do indice i
        }

        System.out.println(textNumber2);

    }

    public static Scanner scanner(String message) {
        System.out.println(message);
        return new Scanner(System.in);
    }
}
