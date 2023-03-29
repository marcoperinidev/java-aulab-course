import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mappa mappa = new Mappa();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la chiave da cercare nella mappa: ");
        String chiave = scanner.nextLine();
        Integer valore = mappa.cercaValore(chiave);
        if (valore != null) {
            System.out.println("Il valore associato alla chiave " + chiave + " è " + valore);
        } else {
            System.out.println("La chiave " + chiave + " non esiste nella mappa");
        }
    }
}
