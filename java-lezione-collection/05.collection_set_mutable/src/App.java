
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
      //! una lista di elementi non ripetuti
      Pointer3D p1 = new Pointer3D(10, 20, 30);
      Pointer3D p2 = new Pointer3D(5, 5, 5);
      Pointer3D p3 = new Pointer3D(20, 30, 40);
      HashSet<Pointer3D> points = new HashSet<Pointer3D>(
        Set.of(
          p1,p2,p3
        )
      );

      for(Pointer3D p : points){
        System.out.println(p.print());
      }

      points.add(new Pointer3D(6,7,8));

      for(Pointer3D p : points){
        System.out.println(p.print());
      }






    }
}
