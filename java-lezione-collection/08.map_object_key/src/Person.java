public class Person {
    String name;
    String surname;
    String cf;
    // String key;
    public Person(String name, String surname, String cf) {
        this.name = name;
        this.surname = surname;
        this.cf = cf;
        // this.key = this.cf != null ? cf : this.name+this.surname;
    }

}
