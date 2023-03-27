import java.util.Scanner;

public class EvenPositionOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la lunghezza dell' Array: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Inserisci l'elemento " + (i+1) + " di " + length + ":");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Elementi in posizione pari: ");
        for (int i = 0; i < length; i+=2) {
            System.out.print(arr[i] + " ");
        }
    }
}
