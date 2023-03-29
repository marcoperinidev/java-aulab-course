// import java.lang.reflect.Field;

public class App {
    public static void main(String[] args) throws Exception {
        //! Boxing e unboxing
        //* tipi primitivi e dei tipi non primitivi -> oggetti */
        //! Wrapper class
        //* delle classi che incapsulano un valore primitivo in un oggetto */
        //! Integer -> la wrapper class del tipo di dato int


        //* BOXING -> racchiudo un valore di tipo primitivo nella sua classe oggetto ( wrapper class ) */
        Integer x = 10;//! -> int -> incapsula in un oggetto di classe Integer
        Double d = 5.5;
        Boolean b = true;
        String s = x.toString();

        //* UNBOXING -> estrarre il valore primitivo dall'oggetto */
        Integer i = 50;
        int a = i;
    }
}
