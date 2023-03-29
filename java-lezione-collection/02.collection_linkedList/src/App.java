import java.util.List;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        //! LINKEDLIST
        LinkedList<Person> people = new LinkedList<Person>(
            List.of(
                new Person("Andrea", "MIninni", 29),
                new Person("COsimo", "Di Lorenzo", 26),
                new Person("Riccardo", "Fusco", 19)
            )
        );
        // System.out.println(people.get(2).getName());

        people.addFirst(new Person("Pippo", "Pluto", 20));
        people.add(2,  new Person("Gianni", "Fusco", 19));
        for(Person p : people){
            System.out.println(p.getName());
        }

    }
}
