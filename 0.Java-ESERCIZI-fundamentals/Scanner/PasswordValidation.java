import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {

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