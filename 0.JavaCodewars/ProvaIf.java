import java.util.Scanner;

public class ProvaIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (N >= 2 && N <= 5 || N > 20) {
                System.out.println("Not Weird");
            } else {
                System.out.println("Weird");
            }
        }

        scanner.close();
    }
}