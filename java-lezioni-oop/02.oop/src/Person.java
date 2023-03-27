public class Person {
    //! attributi
    String name;
    String surname;

    //! metodi
    public void saluta(){
        System.out.println(
            "Ciao, il mio nome è "
            + this.name + " "
            + this.surname
        );
    }
}
