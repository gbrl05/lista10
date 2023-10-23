import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números da sequência de Fibonacci você deseja imprimir? ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Os primeiros " + n + " números da sequência de Fibonacci são:");

        int primeiro = 0, segundo = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(primeiro + " ");

            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
    }
}
