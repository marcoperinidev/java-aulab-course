## Map
interfaccia che identifica un insieme di elementi formati da coppie chiave : valore.
In una map le chiavi sono UNIVOCHE
Non ci possono essere due elementi che hanno la stessa chiave

## Metodi
1. put( key, value ) -> inserisce un nuovo elemento nella map
2. get( key ) -> ritorna il valore corrispondente alla chiave
3. contains( key ) -> ritorna true se la chiave è presente all'interno della map
4. keySet() -> ritorna una set con le chiavi della mappa
5. clear() -> svuota la map
6. values() -> ritorna una collection con i soli valori salvati nella map

## Hashmap
Una implementazione di map è HashMap
quando inserisco un nuovo elemento ( chiave : valore ) all'interno della HashMap, questa genera un hashcode della chiave
Person andrea = new Person("andrea", "mininni", "MNNNDR94L");
rubrica.put(andrea.cf, andrea)
la chiave viene usata per generare un HashCode
- lo utilizza per inserire un nuovo elemento
- lo utilizza per controllare se esiste già quella chiave
- lo utilizza per accedere in lettura get()

PERCHE' LA MAP CI PERMETTE DI ACCEDERE AD UN ELEMENTO IN MANIERA DIRETTA TRAMITE LA CHIAVE MENTRE LE LISTE DEVONO ESSERE CICLATE FINO A QUANDO NON TROVIAMO L'ELEMENTO CHE STIAMO CERCANDO O FINO A QUANDO NON FINISCE IL CICLO

ogni volta che inserisco un elemento nella mappa questa viene "ordinata" tramite la chiave
rubrica.get("MNNDR94L")

andrea => "MNNDR94L"
marco => "PRNMCR89P"

bucket
