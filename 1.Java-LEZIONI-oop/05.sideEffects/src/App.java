// import java.lang.reflect.Field;

public class App {
    public static void main(String[] args) throws Exception {

        Person p1 = new Person("James", "Bond");
        Person p2 = p1; //! prendi il riferimento dell'oggetto refenziato da p1 e assegnalo ( copialo ) nella variabile p2

        //* Un sideeffect si ha quando una funzione modifica lo stato del nostro programma ( cambia il contenuto di una variabile ) oppure mostra qualcosa all'utente */
        stampanome(p1.name);
        cambianome(p1);
        stampanome(p1.name);
    }

    //! con sideEffect -> mostra
    public static void stampanome(String name){ System.out.println(name); }
    //! con sideEffect -> cambia i dati del programma
    public static void cambianome(Person p) { p.name = "ciccio"; }

    //! senza sideEffect -> funzioni pure
    //* perché la loro esecuzione non cambia lo stato e dipende esclusivamente dai dati con cui lavora  */
    public static int sum(int num1, int num2){ return num1 + num2; }

}
