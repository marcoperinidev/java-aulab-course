//* T è solo un segnaposto -> non sappiamo a prescindere quale sarà il suo valore */
//* String, Integer, Person */
//! T -> Type Parameter


//! DICHIARAZIONE DI CLASSE CON GENERIC
//? questa classe per funzionare ha bisogno di un parametro che identifichi il tipo di dato con cui deve funzionare
//* istanziare -> generare un oggetto di una classe */
//? <T> -> è una dichiarazione -> sto dicendo alla classe che per essere istanziata DEVO passare un attributo che identifichi il tipo di oggetto con cui lavorerà
//* GenericClass<String> gen = new GenericClass<String>("ciao a tutti") */
//? T -> indica che la funzione o l'attributo avrà come tipo di dato quello passato durante la creazione dell'oggetto
// public class GenericClass<T> {
//     //! utilizzo il tipo di dato passato per un attributo
//     public T data;
// }

//! DICHIARAZIONE DI CLASSE SENZA GENERIC CON METODI GENERIC
//? visibilità dichiarazione-generico valore-di-ritorno nome-funzione dichiarazione-parametri-formali
public class GenericClass {
    //! metodo generico senza valore di ritorno
    public <T> void print(T data){
        System.out.println(data);
    }
    //! metodo generico con valore di ritorno
    public <T> T returnTypeGeneric(T data){
        return data;
    }
}
