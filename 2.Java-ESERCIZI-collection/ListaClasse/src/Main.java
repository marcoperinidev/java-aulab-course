import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Prodotto> listaProdotti = new ArrayList<>();
        String nomeProdotto;
        /*double prezzoProdotto;*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il nome del prodotto: ");
        nomeProdotto = scanner.nextLine();
        System.out.println("Inserisci il prezzo del prodotto: ");
        double prezzoProdotto = scanner.nextDouble();

        //cerca che è sta roba--------
        /*try {
            System.out.println("Inserisci il nome del prodotto: ");
            nomeProdotto = scanner.nextLine();
            prezzoProdotto = scanner.nextDouble();
        } finally {
            scanner.close();
        }*/
        //-----------------------------

        Prodotto nuovoProdotto = new Prodotto(nomeProdotto, prezzoProdotto);
        listaProdotti.add(nuovoProdotto);

        for (Prodotto prodotto : listaProdotti) {
            System.out.println("il prodotto " + prodotto.getName() + " " + "vale " + prodotto.getPrezzo());
        }
    }
}
