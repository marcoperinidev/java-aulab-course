import java.util.Scanner;

import java.util.Scanner;

class ReverseDigits {
    public static void main(String[] args) {

        int reverse = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        int number = scanner.nextInt();

        while (number != 0) {
            int digit = number % 10;
            reverse = (reverse * 10) + digit;
            number = number / 10;
        }
        scanner.close();
        System.out.println("Il numero invertito è : " + reverse);
    }
}