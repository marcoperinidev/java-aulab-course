//* T è solo un segnaposto -> non sappiamo a prescindere quale sarà il suo valore */
//* String, Integer, Person */
//! T -> Type Parameter
public class GenericClass<T> {
    private T data;
    public GenericClass(T data) {
        this.data = data;
    }
    public T getData(){
        return this.data;
    }

}
