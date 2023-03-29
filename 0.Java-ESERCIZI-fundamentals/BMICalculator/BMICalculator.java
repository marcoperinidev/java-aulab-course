import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita il tuo peso in kilogrammi: ");
        double weight = scanner.nextDouble();

        System.out.println("Digita la tua altezza in metri: ");
        double height = scanner.nextDouble();

        double bmi = calculateBMI(weight, height);
        System.out.println("Il tuo Indice di Massa Corporea è: " + bmi);
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
}

