//scrivere un programma che prenda in input(Scanner) un numero e ritorni la sommatoria delle cifre che lo compongono.
import java.util.Scanner;

public class Sommatoria {
    public static void main(String[] args) {
        System.out.println("Inserisci un numero");
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        int somma = 0;
        while (numero > 0) {
            somma += numero % 10;
            numero /= 10;
        }
        System.out.println("La somma delle cifre è: " + somma);
        input.close();
    }
}
