import java.util.Scanner;

class AutomorphicNumber {
    public static void main(String[] args) {
        // un numero è automorfo se le cifre finali del suo quadrato sono uguali al

        System.out.println("Inserisci un numero e ti dirò se è automorfo");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        int squared = number * number;
        System.out.println(squared);

        int numLength = String.valueOf(number).length();
        System.out.println(numLength);

        int squaredLastDigits = squared % (int) Math.pow(10, numLength);

        if (squaredLastDigits == number) {
            System.out.println("Il numero " + number + " è automorfo");
        } else {
            System.out.println("Il numero " + number + " NON è automorfo");
        }

        // oppure con le stringhe

        if (String.valueOf(squared).endsWith(String.valueOf(number))) {
            System.out.println("Il numero " + number + " è automorfo");
        } else {
            System.out.println("Il numero " + number + " NON è automorfo");
        }

    }
}