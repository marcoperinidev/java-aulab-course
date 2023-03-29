
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
      // Set<Integer> numbers = new TreeSet<Integer>(
      //   Set.of(7, 8, 4, 2, 9, 10)
      // );
      // System.out.println(numbers);

      // Set<String> names = new TreeSet<String>(
      //   Set.of("Pippo", "marco", "francesco", "andrea")
      // );
      // System.out.println(names);
      //! creo una TreeSet che contiene oggetti di classe Pointer3D
      //* Set<Pointer3D> =  new TreeSet<Pointer3D>*/
      //* a questa set passo come valore principale una classe che implementa l'interfaccia Comparator -> adesso sa come ordinare gli elementi in base alla funzione compare che abbiamo scritto all'interno della classe  Pointer3DComparator*/
      Set<Pointer3D> points = new TreeSet<Pointer3D>(new Pointer3DComparator());
        points.addAll(Set.of(
          new Pointer3D(0, 0, 0),
          new Pointer3D(5, 5, 5),
          new Pointer3D(2, 2, 2),
          new Pointer3D(1, 1, 1)
          )
      );
      for(Pointer3D p : points){
        System.out.println(p.print());
      }
    }
}
