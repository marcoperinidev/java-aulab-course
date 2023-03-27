import java.util.Scanner;

class PasswordValidation {
    public static void main(String[] args) {

        Boolean firstRule = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la tua password");
        String password = scanner.nextLine();
        System.out.println("La pwd inserita è " + password);

        // ! controllo 1
        if (password.length() >= 8)
            firstRule = true;

        if (firstRule && checkIfPWDContainsNumberAndUppercase(password)) {
            System.out.println("La pwd è corretta");
        } else {
            System.out.println("La password non è corretta");
        }

    }

    public static boolean checkIfPWDContainsNumberAndUppercase(String pwd) {
        boolean secondRule = false;
        boolean thirdRule = false;
        for (int i = 0; i < pwd.length(); i++) {
            if (Character.isUpperCase(pwd.charAt(i))) {
                secondRule = true;
            }
            if (Character.isDigit(pwd.charAt(i))) {
                thirdRule = true;
            }
        }
        return secondRule && thirdRule;
    }

}