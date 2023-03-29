class App {
    public static void main(String[] args) {
        //! funzioni
        //* */ senza funzioni
        //! procedurale
        String name = "James";
        String surname = "Bond";
        saluta(name, surname);
        name = "Pippo";
        surname = "Pluto";
        //! estrazione => extract function
        saluta(name, surname);
    }

    //! parametri => un set di istruzioni che possono lavorare con dati diversi. SONO IO  A SCEGLIERE I DATI
    public static void saluta(String name, String surname){
        //! incapsulamento
        System.out.println("Il mio nome è " + surname + ", " + name + " " + surname);
    }

}