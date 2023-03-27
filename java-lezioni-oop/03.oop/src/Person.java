public class Person {
    //! attributi
    String name;
    String surname;

    //! metodi
   //* come si creano gli oggetti di questa classe */
   //! costruttore
   //? spostato il controllo della creazione di un oggetto direttamente nella classe
   //? abbiamo "forzato" il codice al passaggio di parametri. caro codice, se vuoi creare un oggetto di classe Person, DEVI NECESSARIAMENTE passarmi questi due parametri
    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void saluta(){
        System.out.println(
            "Ciao, il mio nome è "
            + this.name + " "
            + this.surname
        );
    }
}
