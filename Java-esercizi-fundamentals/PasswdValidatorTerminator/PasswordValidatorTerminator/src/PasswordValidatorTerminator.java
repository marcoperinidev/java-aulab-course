import java.util.Scanner;

public class PasswordValidatorTerminator {
    public static void main(String[] args) {
        System.out.println("Inserisci la password: ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (password.length() >= 8 && password.length() <= 20) {
            if (password.matches(".*[a-z].*") && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*")
                    && password.matches(".*[!@#$%^&*()_+].*")) {
                System.out.println("Password Valida");
            } else {
                System.out.println("Password NON Valida");
            }
        } else {
            System.out.println("Invalid");
        }

        scanner.close();
    }
}