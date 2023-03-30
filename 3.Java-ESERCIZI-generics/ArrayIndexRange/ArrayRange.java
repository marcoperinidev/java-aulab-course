import java.lang.reflect.Array;

public class ArrayRange<T> {

    private final T[] array;

    public ArrayRange(T[] array) {
        this.array = array;
    }

    /*
                    //NON FUNZIONANTE
    //! -----------------ERRORE------------------ !
        -----------------------------------------

        "Exception in thread "main" java.lang.ClassCastException: class
        [Ljava.lang.Object; cannot be cast to class [Ljava.lang.Integer;
        ([Ljava.lang.Object; and [Ljava.lang.Integer; are in module
        java.base of loader 'bootstrap') at Main.main(Main.java:8)"

	    -----------------------------------------
	  ! -----------------ERRORE------------------ !
    public T[] getRange(int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex >= array.length || startIndex > endIndex) {
            throw new IllegalArgumentException("Invalid range");
        }
        int length = endIndex - startIndex + 1;
        T[] result = (T[]) new Object[length];
        System.arraycopy(array, startIndex, result, 0, length);
        return result;
    }*/

    //FUNZIONANTE
    public T[] getRange(int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex >= array.length || startIndex > endIndex) {
            throw new IllegalArgumentException("Invalid range");
        }
        int length = endIndex - startIndex + 1;
        T[] result = (T[]) Array.newInstance(array.getClass().getComponentType(), length);
        //posso replac-are con System.arraycopy(array, startIndex, result, 0, length);
        for (int i = 0; i < length; i++) {
            result[i] = array[startIndex + i];
        }
        return result;
    }


    //SOLUZIONE STACKOVERFLOW
    /*public T[] getRange(int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex >= array.length || startIndex > endIndex) {
            throw new IllegalArgumentException("Invalid range");
        }
        int length = endIndex - startIndex + 1;
        T[] result = Arrays.copyOfRange(array, startIndex, endIndex + 1);
        return result;
    }*/

}
