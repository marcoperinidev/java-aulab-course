import java.util.Comparator;

// public class Pointer3DComparator implements Comparator {
//     @Override
//     public int compare(Object o1, Object o2){
//         Pointer3D p1 = (Pointer3D) o1;
//         Pointer3D p2 = (Pointer3D) o2;
//         return (p1.x + p1.y + p1.z) - (p2.x + p2.y + p2.z);
//         //! 0 - 6 = -6 => <0
//         //! 6 - 15 = -9 => <0

//     }
// }

public class Pointer3DComparator implements Comparator<Pointer3D> {
    @Override
    public int compare(Pointer3D p1, Pointer3D p2){
        return (p1.x + p1.y + p1.z) - (p2.x + p2.y + p2.z);
        //! 0 - 6 = -6 => <0
        //! 6 - 15 = -9 => <0

    }
}
