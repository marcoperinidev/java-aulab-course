import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapKeyString {
    public static void main(String[] args) {
        //creazione una mappa pre esistente dove metterci le personz
        Map<String, Persona> mappaPreesistente = new HashMap<>();
        mappaPreesistente.put("Bjarne Stroustrup",new Persona("Bjarne Stroustrup", 72));
        mappaPreesistente.put("Kevin Mitnick",new Persona("Kevin Mitnick", 59));
        mappaPreesistente.put("Albert Gonzalez",new Persona("Albert Gonzalez", 42));
        mappaPreesistente.put("Kevin Poulsen",new Persona("Kevin Poulsen", 57));
        mappaPreesistente.put("Gary McKinnon",new Persona("Gary McKinnon", 57));

        Map<String, Persona> mappa = new HashMap<>(mappaPreesistente);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il nome della persona: ");
        String nome = scanner.nextLine();
        System.out.println("Inserisci l'età della persona: ");
        int eta = scanner.nextInt();
        scanner.nextLine();

        //crea l'oggetto Persona e lo schiaffa nella mappa
        Persona persona = new Persona(nome, eta);
        mappa.put(nome, persona);

        //stampa values della mapponas con un ciclo sennò mi stampava tutto l'obj
        System.out.println("Mappa:");
        for (Persona p : mappa.values()) {
            System.out.println("Nome: " + p.getNome() + ", Età: " + p.getEta());
        }

        //rimuovi l'obj
        mappa.remove("Albert Gonzalez");

        //cerca nella mappa
        if (mappa.containsKey(nome)) {
            System.out.println("La persona " + nome + " è presente nella mappa.");
        } else {
            System.out.println("La persona " + nome + " non è presente nella mappa.");
        }
    }
}