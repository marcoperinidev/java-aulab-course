package dev.lpa;

import java.util.LinkedList;

//con java14 ci sono i record che sono una classe immutabile che non ha bisogno di getter e setter
record Place(String name, int distance) {

    // can you explain me this @override method?

    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
    // sovrascrivo il metodo toString di Object; il simbolo %s indica che il valore
    // sarà una stringa(name), mentre %d indica che il valore sarà un
    // intero(distance)
    // % = operatore di formattazione di stringhe (formatting operator) -
    // String.format()
    // %s = stringa
    // %d = intero
    // %f = floating point
    // %c = carattere
    // %b = booleano
    // %n = nuova riga
    // %t = data e ora
    // %x = esadecimale
    // %e = esponenziale
    // %g = generico
    // %o = ottale
    // %h = hashcode
    // %a = indirizzo di memoria
}

public class Main {

    public static void main(String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, new Place("adelaide", 1374));
        addPlace(placesToVisit, new Place("Brisbane", 917));
        addPlace(placesToVisit, new Place("Perth", 3923));
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Darwin", 3972));
        addPlace(placesToVisit, new Place("Melbourne", 877));

        placesToVisit.addFirst(new Place("Sydney", 0));
        System.out.println(placesToVisit);

    }

    private static void addPlace(LinkedList<Place> list, Place place) {

        if (list.contains(place)) {
            System.out.println("Found duplicate: " + place);
            return;
        }

        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate: " + place);
                return;
            }
        }

        int matchedIndex = 0;
        for (var listPlace : list) {
            if (place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }

            matchedIndex++;
        }

        list.add(place);
    }
}
