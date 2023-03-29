import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {

        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero: ");
        int number = Integer.parseInt(scanner.nextLine());

        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.err.println("La somma è " + sum);
    }
}