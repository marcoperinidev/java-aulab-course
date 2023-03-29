## Collection
- strutture dati con cui possiamo gestire dei dati
- array -> un insieme di elementi ( ordinati tramite chiave ) dello stesso tipo con una lunghezza determinata al momento della creazione
    -> per gestire degli elementi collegati tra loro

## gestire dei dati ?
-> eseguire delle operazioni
- array -> aggiungere, rimuovere un elemento; accedere ad un elemento tramite la chiave, cercare un elemento

Una collection è un array con delle operazioni in più
1. add -> aggiungo un elemento ( cambiando la sua lunghezza )
2. addAll -> aggiungere n elementi ( cambiando la sua lunghezza )
3. clear -> svuotare la collection
4. contains -> verificare l'esistenza di un elemento all'interno della collection
5. containsAll -> verifica l'esistenza di più elementi all'interno di una collection
6. isEmpty -> controllare se la collection è vuota
7. remove -> rimuovere un elemento da una collection
8. removeAll -> rimuovere n elementi da una collection
9. size -> prendere la lunghezza
10. toArray -> trasformare la collection in un array
11. get -> prendo un elemento da una collection tramite l'indice

collection è un'interfaccia quindi una generalizzazione di qualcosa che può essere formato da n elementi, che può essere ciclato e che può eseguire i metodi che abbiamo visto prima -> quindi non la posso istanziare -> non posso fare new Collection

Quindi, per utilizzare una collection devo utilizzare una delle sue implementazioni -> classi che si possono istanziare -> di cui posso creare oggetti -> di cui posso fare la new

Le collection lavorano SOLO con gli oggetti
NOn posso creare una collection di tipo primitivo
int -> Integer
String
char -> Char
boolean -> Boolean

## 01. List
List è una inteerfaccia quindi non posso istanziarla, devo utilizzare ua sua implementazione
1. ArrayList
-> tutti gli elementi sono salvati in locazioni di memoria contigue
List<String> list = new ArrayList<String>();
"ciao"
"buongiorno"
"Hello world"

list.add("welcome")

## 02.LinkedList
un'implementazione della List in cui gli elementi NON sono salvati in locazioni contigue
List<String> list = new LinkedList<String>();
"ciao"
"buongiorno"
"Hello world"

1. addFirst() -> aggiunge un elemento in testa
2. addLast() -> aggunge un elemento in coda
3. removeFirst()
4. removeLast()
5. getFirst()
6. getLast()

## 03. SET
una lista ( un insieme ) di elementi che non accetta ripetizioni

Particolarità della set
1. non mantiene l'ordine di inserimento
2. è una collection immutabile -> non posso modificare la lunghezza -> non posso aggiungere elementi


## come facciamo a controllare se due dati ( reference ) contengono gli stessi valori al momento dell'inserimento?
La set utilizza due metodi di Object per capire se all'interno dei suoi elementi c'è già lo stesso elemento
1. equals
2. hashCode

## equals
- prende in input un altro oggetto e controlla se è uguale all'oggetto su cui la lanciamo
obj1.equals(obj2);

## hashCode
- genera un codice univoco in base alle caratteristiche dell'oggetto
"ciao"  -> f() -> askjfdhs9f9428r34olk3jhpwòefjhpoi


## 04. HashSet
- la hashset è una set che può variare in dimensione

## 05 TreeSet
è una set che ordina gli elementi al suo interno
-> ogni volta che inserisco un inserimento, applica un algorimto di ordinamento per calcolare la giusta posizione del nuovo elemento
-> inserire un nuovo elemento nella treeset è un'operazione lenta
 Come fa ad ordinare gli elementi?
 -> devo passare un oggetto che implementa l'interaccia Comparable