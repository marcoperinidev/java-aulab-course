import java.util.ArrayList;
import java.util.Scanner;

public class ListaPersone {
    public static void main(String[] args) {
        //creazione lista di persone sconosciute e sicuramente non famose
        ArrayList<String> persone = new ArrayList<String>();
        persone.add("Andrea Alongi");
        persone.add("Alberto Biggiogero");
        persone.add("Bram Cohen");
        persone.add("Sir Tim Berners-Lee");
        persone.add("Donald Knuth");
        persone.add("Brendan Eich");
        persone.add("Richard Stallman");
        persone.add("Hames Gosling");
        persone.add("Gottfrid Svartholm");
        persone.add("Fredrik Neij");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quale persona della lista vuoi modificare? Inserisci l'indice (da 1 a " + persone.size() + "): ");
        int index = scanner.nextInt() -1;
        scanner.nextLine();

        System.out.println("Inserisci il nuovo nome: ");
        String nuovoNome = scanner.nextLine();

        persone.set(index, nuovoNome);

        System.out.println("Questa è la Lista Persone aggiornata:");
        for (String persona : persone) {
            System.out.println(persona);
        }
    }
}

//--------------------------TEST---------------

/*Quale persona della lista vuoi modificare? Inserisci l'indice (da 1 a 10):
        4
        Inserisci il nuovo nome:
        Dennis Ritchie
        Questa è la Lista Persone aggiornata:
        Andrea Alongi
        Alberto Biggiogero
        Bram Cohen
        Dennis Ritchie
        Donald Knuth
        Brendan Eich
        Richard Stallman
        Hames Gosling
        Gottfrid Svartholm
        Fredrik Neij

        Process finished with exit code 0*/
//----------------------------------------------