import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MapWithNoDuplicates {
            public static void main(String[] args) {
                // Creazione della lista di elementi
                List<String> lista = new ArrayList<>();
                lista.add("Linus Torvalds");
                lista.add("Ada Lovelace");
                lista.add("Grace Hopper");
                lista.add("Ken Thompson");
                lista.add("Alan Turing");
                lista.add("John Carmack");
                lista.add("Bruce Schneier");
                lista.add("Richard Stallman");
                lista.add("Tim Berners-Lee");
                lista.add("Vint Cerf");
                lista.add("Niklaus Wirth");
                lista.add("Donald Knuth");
                lista.add("Brian Kernighan");
                lista.add("Dennis Ritchie");
                lista.add("Steve Jobs");
                lista.add("Bill Gates");
                lista.add("Mark Zuckerberg");
                lista.add("Elon Musk");
                lista.add("Jeff Bezos");
                lista.add("Edward Snowden");
                lista.add("Kevin Mitnick");

                // Rimozione dei duplicati dalla lista
                Set<String> set = new HashSet<>(lista);
                lista.clear();
                lista.addAll(set);

                // Stampa della lista senza duplicati
                System.out.println("Lista senza duplicati:");
                for (String elemento : lista) {
                    System.out.println(elemento);
                }
            }
}