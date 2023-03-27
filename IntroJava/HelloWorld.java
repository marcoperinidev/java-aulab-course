import java.util.Arrays;

class HelloWorld {
    //! main
    //*visibilità static valorediritorno main
    //! quando lancio il file compilato HelloWorld, come prima cosa viene eseguita la funzione main.
    //! possiamo passare dei parametri quando lanciamo il file compilato HelloWorld
    public static void main(String[] args){
        // int[] arr;
        // int[] arr = new int[100];
        // int[] arr = {10, 20, 30};
        // int[] copy = arr;
        // for( int number : arr){
        //     System.out.println(number);
        // }
        //! copia effettiva -> genero un altro array
        // int[] arr = {10, 20, 30};
        // int[] copy = Arrays.copyOf(arr, arr.length);
        // // System.out.println(arr == copy);
        // boolean returnVal1 = Arrays.equals(arr,copy);
        // System.out.println("Array arr and copy equal?: " + returnVal1);
    }


}

//! dato che il pc non è in grado di eseguire direttamente Java, devo compilare in bytecode questo programma. Una volta compilato, posso lanciarlo
//* il compilatore legge riga per riga e compila ogni riga in bytecode. Se non trova errori, compila tutto il file e quindi posso eseguire il file compilato. Se trova errori la compilazione termina restituendo un errore */