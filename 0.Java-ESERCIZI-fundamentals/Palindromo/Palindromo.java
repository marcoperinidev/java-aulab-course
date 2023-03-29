import java.util.Scanner;

class Palindromo {
    public static void main(String[] args) {

        String a = "";
        String b = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci la parola: ");
        a = sc.nextLine();
        int len = a.length();
        for (int i = len - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        if (a.equalsIgnoreCase(b)) {
            System.out.println("La stringa è palindroma");
        } else {
            System.out.println("La stringa NON è palindroma");
        }

    }
}