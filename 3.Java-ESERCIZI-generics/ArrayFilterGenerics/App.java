import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        //crea un array di Integer e lo passso al costruttore di ArrayFilter
        Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        ArrayFilter<Integer> filter = new ArrayFilter<>(intArray);//il tipo esplicito Integer può essere omesso
        ArrayList<Integer> evenNumbers = filter.filterEvenNumbers();
        System.out.println("Even numbers: " + evenNumbers);
        ArrayList<Integer> oddNumbers = filter.filterOddNumbers();
        System.out.println("Odd numbers: " + oddNumbers);
        ArrayList<Integer> primeNumbers = filter.filterPrimeNumbers();
        System.out.println("Prime numbers: " + primeNumbers);
    }

}
