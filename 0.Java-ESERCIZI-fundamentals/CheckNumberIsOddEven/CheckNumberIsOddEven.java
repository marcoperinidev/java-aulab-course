import java.util.Scanner;

public class CheckNumberIsOddEven {
    public static void main(String[] args) {
        // NORMAL check if the input number is odd or even
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }*/
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;
        String[] exitOptions = {"N", "n", "No", "no", "NO"};
        while (continueProgram) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("The number is even");
            } else {
                System.out.println("The number is odd");
            }
            System.out.println("Do you want to continue? (Y/N)");
            String answer = scanner.next();
            for (String option : exitOptions) {
                if (option.equalsIgnoreCase(answer)) {
                    continueProgram = false;
                    break;
                }
            }
        }
    }
}
