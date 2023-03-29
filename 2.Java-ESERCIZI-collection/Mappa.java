/*

--------------CONSEGNA-------------------
creare una mappa con degli oggetti, chiedere all’utente
di inserire una chiave e provare a cercare l’oggetto corrispondente nella mappa
-----------------------------------------

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mappa {
    public static void main(String[] args) {
        Map<String, Integer> mappa = new HashMap<>();
        mappa.put("uno", 1);
        mappa.put("due", 2);
        mappa.put("tre", 3);
        mappa.put("quattro", 4);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la chiave da cercare nella mappa: ");
        String chiave = scanner.nextLine();
        if (mappa.containsKey(chiave)) {
            System.out.println("La chiave " + chiave + " è presente nella mappa");
            System.out.println("Il valore associato è: " + mappa.get(chiave));
        } else {
            System.out.println("La chiave " + chiave + " non è presente nella mappa");
        }
    }
}
*/

import java.util.HashMap;
import java.util.Map;

public class Mappa {
    private final Map<String, Integer> mappa;

    public Mappa() {
        mappa = new HashMap<>();
        mappa.put("uno", 1);
        mappa.put("due", 2);
        mappa.put("tre", 3);
    }

    public Integer cercaValore(String chiave) {
        return mappa.get(chiave);
    }
}
