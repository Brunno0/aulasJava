import java.util.Scanner;                      // 1

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);   // 2

        System.out.print("Digite sua idade: ");     // 3
        int idade = entrada.nextInt();              // 4

        System.out.println("Você tem " + idade + " anos.");
    }
}