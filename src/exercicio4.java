import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        int n = scanner("Escreva um numero: ").nextInt();
        boolean primo = true;

        for(int i = 2; i < n; i++){ // começa no 2 e incrementa até antes do n, pq ja sabemos que por 1 e ele mesmo n eh divisivel
            if(n % i == 0){ // se encontrar algum divisivel, nao eh primo
                System.out.println("NAO PRIMO");
            } else System.out.println(primo);; // se nao encontrar, eh primo
        }
    }
    public static Scanner scanner(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
