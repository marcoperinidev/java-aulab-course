public class App {
    public static void main(String[] args) throws Exception {
        //! funzione
        //! classe
        //* la classe ci permette di creare un dato coerente
        //! name, surname => sono due informazioni che possono riguarda uno stesso dato
        Person p = new Person();
        p.name = "James";
        p.surname = "Bond";
        p.saluta();
        Person p2 = new Person();
        p2.name = "Gianni";
        p2.surname = "Ciccio";
        p2.saluta();
        //! Semplificare il problema, suddividerlo in maniera logica
        //! classificazioni => descrivere meglio il problema e tutte le sue componenti

    }

    // public static void saluta(Person persona){
    //     System.out.println("Ciao, il mio nome è " + persona.name + " " + persona.surname);
    // }


}
