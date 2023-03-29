import java.lang.reflect.Field;

public class Person {
    String name;
    String surname;

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
