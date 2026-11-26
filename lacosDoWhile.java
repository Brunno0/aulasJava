import java.util.Scanner;

public class LacosWhile {
    public static void main (String[] args){

       Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número positivo: ");
            numero = entrada.nextInt();
         } while (numero <= 0);
        
            System.out.println("Número aceito: " + numero);
    }
}


