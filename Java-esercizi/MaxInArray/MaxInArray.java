import java.util.Scanner;

class MaxInArray {
    public static void main(String[] args) {
        //! vogliamo permettere all'utente di inserire dei numeri e ritornare il valore maggiore inserito
        System.out.println("Inserisci il numero di numeri che vuoi inserire");
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Inserisci il numero");
            numbers[i] = Integer.parseInt(sc.nextLine());
        }
        int position = 0;
        int largest = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
                position = i;
            }
        }

        System.out.println("Il valore maggiore all'interno dell'array è " + largest + " in posizione " + position);
    }
}