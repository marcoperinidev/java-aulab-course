import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        // List peolpe = new List(); -> questo non posso utilizzarlo perché List è una interfaccia

        //! devo utilizzare una classe che implementa List
        //! ArrayList, LinkedList

        List<Person> people = new ArrayList<Person>();
        //? 1. add
        people.add(new Person("Andrea", "Mininni", 29));
        people.add(new Person("Luca", "Colaianni", 21));
        people.add(new Person("Tommaso", "Zuffa", 27));
        //! non ci piace
        // for (int i = 0; i < people.size(); i++) {
        //     System.out.println(people.get(i).getName());
        // }
        //! utilizziamo iterable
        //* hasNext() -> ci dice se la collection ha ancora un elemento -> all'inizio ci darà true se ha almeno un elemento, false se è vuota
        //* next() -> ritorna il prossimo elemento */
        //! non ci piace
        // Iterator<Person> it = people.iterator();
        // //! fino a quando it.hasNext ritonra true, continui a ciclare
        // while(it.hasNext()){
        //     Person p = it.next();
        //     System.out.println(p.getName());
        // }
        //! CI PIACE
        for(Person p : people){
            System.out.println(p.getName());
        }

        //! modificare un dato già esistente all'interno della lista
        people.set(0, new Person("Stefano", "Ercolani", 28));
        System.out.println("Ciclo dopo sostituzione");
        for(Person p : people){
            System.out.println(p.getName());
        }

        people.remove(0);
        System.out.println("Ciclo dopo rimozione di Andrea");

        for(Person p : people){
            System.out.println(p.getName());
        }

        people.clear();
        System.out.println("Ciclo dopo rimozione di tutti gli elementi");
        for(Person p : people){
            System.out.println(p.getName());
        }

    }
}
