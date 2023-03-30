public class App {
    public static void main(String[] args) throws Exception {
    //    GenericClass gen = new GenericClass("Not so generic");
    //    System.out.println(gen.getData());
        GenericClass<String> gen = new GenericClass<String>("That's generic");
        System.out.println(gen.getData());

        GenericClass<Integer> genInt = new GenericClass<Integer>(5);
        System.out.println(genInt.getData());

    }
}
