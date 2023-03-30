public class App {
    public static void main(String[] args) throws Exception {
      String[] nomi = new String[] {"Giancarlo", "Zoe", "Luigi", "Andrea", "Angelo"};
      String nomeMinimo = AlgoritmiPerArray.min(nomi);
      System.out.println("Il nome minimo è " + nomeMinimo);
      Integer[] numbers = new Integer[] { 100, 400, 30, 50};
      Integer numeroMinimo = AlgoritmiPerArray.min(numbers);
      System.out.println("Il numero minimo è " + numeroMinimo);
      Integer numeroMassimo = AlgoritmiPerArray.max(numbers);
      System.out.println("Il numero massimo è " + numeroMassimo);

      //! Sto violando il principio DRY

    }
}
