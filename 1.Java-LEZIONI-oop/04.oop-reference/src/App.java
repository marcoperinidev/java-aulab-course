// import java.lang.reflect.Field;

public class App {
    public static void main(String[] args) throws Exception {
        // Person p = new Person("James", "Bond");
        // p.saluta();
        //! object reference
        Person p1 = new Person("James", "Bond");
        Person p2 = p1; //! prendi il riferimento dell'oggetto refenziato da p1 e assegnalo ( copialo ) nella variabile p2
        //* p2 e p1 puntano allo stesso oggetto */
        // Person p3 = p1.clone();
        // System.out.println(p1.getClass().getDeclaredFields());
        // Field[] fields = p1.getClass().getDeclaredFields();

        // for(Field field: fields) {
        //    System.out.println(field.get(p1));
        // }

        // p1.saluta();
        // p2.name = "Ciccio";
        // p1.saluta();
        p1.saluta();
        test(p2);
        p1.saluta();


    }

    public static void test(Person p){
        p.name = null;
    }

    //! passa alla funzione il nome di p1 => prova ad accedere a p1.name, trova null => NULLPointerException



}
