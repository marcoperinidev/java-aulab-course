import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class App {
    public static void main(String[] args) throws Exception {
        Map<String, Person> rubrica = new HashMap<String, Person>();
        Person andrea = new Person("Andrea", "Mininni", "MNNNDR94L");
        rubrica.put(andrea.cf, andrea);
        Person marco = new Person("Marco", "Perini", "PRNMRC89P");
        rubrica.put(marco.cf, marco);
         //! come ciclo una mappa?
         //! per accedere ad un elemento della mappa -> per fare la get
         System.out.println("Prima della rimozione");
        for(String key : rubrica.keySet()){
            System.out.println(rubrica.get(key).name);
        }

        rubrica.remove(andrea.cf);
        Person andreaRitrovato = rubrica.get(andrea.cf);
        if(andreaRitrovato == null){
            System.out.println("Andrea non è stato trovato");
        }
        // System.out.println("DOpo la rimozione");
        // for(String key : rubrica.keySet()){
        //     System.out.println(rubrica.get(key).name);
        // }
    }
}
