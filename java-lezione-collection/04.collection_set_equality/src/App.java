
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
      //! una lista di elementi non ripetuti
      Pointer3D p1 = new Pointer3D(10, 20, 30);
      Pointer3D p2 = new Pointer3D(5, 5, 5);
      Pointer3D p3 = new Pointer3D(20, 30, 40);
      Pointer3D p4 = new Pointer3D(20, 30, 40);
      //* in questo momento ho due oggetti p3 e p4 che hanno gli stessi valori ma sono reference diverse */
      // * quando provo ad inserire degli oggetti nella set, utilizza il metodo equals per vedere se c'è un oggetto che contiene la stessa reference
      Set<Pointer3D> points = Set.of(
        p1,
        p2,
        p3,
        p4
      );


      //* voglio utrilizzare la Set per non avere elementi duplicati */
      //* la set effettua dei controlli solo sulla reference e non sui valori  */



    }
}
