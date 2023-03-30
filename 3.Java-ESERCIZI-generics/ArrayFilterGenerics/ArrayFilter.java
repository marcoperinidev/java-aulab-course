import java.util.ArrayList;

public class ArrayFilter<T extends Number> { //estende la classe Number per poter usare i metodi intValue() e doubleValue()

    private final T[] array;

    public ArrayFilter(T[] array) {
        this.array = array;
    }

    public ArrayList<T> filterEvenNumbers() {
        ArrayList<T> result = new ArrayList<>();//il tipo esplicito T può essere omesso
        for (T element : array) {
            if (element.intValue() % 2 == 0) {
                result.add(element);
            }
        }
        return result;
    }

    public ArrayList<T> filterOddNumbers() {
        ArrayList<T> result = new ArrayList<>();
        for (T element : array) {
            if (element.intValue() % 2 == 1) {
                result.add(element);
            }
        }
        return result;
    }

    public ArrayList<T> filterPrimeNumbers() {
        ArrayList<T> result = new ArrayList<>();
        for (T element : array) {
            if (isPrime(element.intValue())) {
                result.add(element);
            }
        }
        return result;
    }

    /*filterEvenNumbers(), filterOddNumbers(), e filterPrimeNumbers() restituiscono un nuovo ArrayList<T> che contiene tutti gli elementi dell'array che soddisfano gli if del caso.*/

    //isPrima() torna true se il numero è primo o meno

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
