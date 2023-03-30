public class App {
    public static void main(String[] args) throws Exception {
        GenericClass gen = new GenericClass();
        // gen.<String>print("ciao");
        // gen.<Integer>print(5);

        //! indichiamo il tipo del generic
        System.out.println(
            gen.<String>returnTypeGeneric("ciaone")
        );
        //! Java calcola in automatico il tipo di generic
        //! Type Inference
        System.out.println(
            gen.returnTypeGeneric(10)
        );
    }
}
