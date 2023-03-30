import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.addPiatto(new Piatti("Pasta al sugo", 5.0, Arrays.asList("Pasta", "Sugo")));
        menu.addPiatto(new Piatti("Pizza Margherita", 6.0, Arrays.asList("Pizza", "mozzarella", "pomodoro")));
        menu.stampaMenu();


        Scanner input = new Scanner(System.in);
            System.out.println("Inserisci il nome del ristorante");
        String nome = input.nextLine();
            System.out.println("Inserisci il numero di piatti");

        int numpiatti = input.nextInt();
            input.nextLine();

        String[] piatti = new String[numpiatti];
        for (int i = 0; i < numpiatti; i++) {
                System.out.println("Inserisci il nome del piatto");
            piatti[i] = input.nextLine();
        }

        System.out.println("Inserisci il numero di bevande");
            int numbevande = input.nextInt();
                input.nextLine();

        String[] bevande = new String[numbevande];
            for (int i = 0; i < numbevande; i++) {
                    System.out.println("Inserisci il nome della bevanda");
                bevande[i] = input.nextLine();
        }
        Restaurant ristorante = new Restaurant(nome, piatti, bevande);
        ristorante.stampamenu();

    }
}