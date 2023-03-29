
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
      //! una lista di elementi non ripetuti
    //   Pointer3D p1 = new Pointer3D(10, 20, 30);
    //   Pointer3D p2 = new Pointer3D(5, 5, 5);
    //   Pointer3D p3 = new Pointer3D(20, 30, 40);
    //   Pointer3D p4 = new Pointer3D(20, 30, 40);
    //   //! in questo caso aggiunge p3 e p4 perché sono REFERENCE DIVERSE anche se hanno valori identici
    //   Set<Pointer3D> points = Set.of(
    //     p1,
    //     p2,
    //     p3,
    //     p4
    //   );

      //! operazione non concessa
    //   points.add(new Pointer3D(30, 50, 90));

        Pointer3D p1 = new Pointer3D(10, 20, 30);
      Pointer3D p2 = new Pointer3D(5, 5, 5);
      Pointer3D p3 = new Pointer3D(20, 30, 40);
      Pointer3D p4 = p3;
      //! questa operazione non è consentita perché p3 e p4 contengono la stessa reference
      Set<Pointer3D> points = Set.of(
        p1,
        p2,
        p3,
        p4
      );

      for(Pointer3D p : points){
        System.out.println(p.print());
      }
    }
}
