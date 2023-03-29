// import java.lang.reflect.Field;

public class App {
    public static void main(String[] args) throws Exception {
        //! Object equality
        Pointer3D p1 = new Pointer3D(100, 200, 300);
        // Pointer3D p2 = p1;
        Pointer3D p2 = new Pointer3D(100, 200, 300);
        // System.out.println(p1 == p2); //! false
        //! Ongi classe eredita da Object un metodo che si chiama equals
        //! ritorna true se entrambe le variabili hanno lo stesso riferimento
        System.out.println(p1.equals(p2));

        //? come facciamo a sovrascrivere questo comportamento in modo da ottenere uin controllo NON sul riferimento ma sui valori?
    }
}
