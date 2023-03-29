## caratteristiche del linguaggio
- case sensitive -> HelloWorld != helloworld
- keyword -> public, class
- tutte le classi che dichiaro diventano un tipo
    class Persona {
        $name;
        $surname;
        fun()
    }
    new Persona() -> un oggetto della classe Persona -> tipo di dato
- void -> nelle funzioni, ad esempio, mi dice che la funzione non ritorna nulla
- { }
- ogni comando deve terminare con il ;
- Il nome del file deve coincidere con il nome della classe


# Type System di java
il type system di un linguaggio è l'insieme dei tipi di dato del linguaggio e del modo in cui questi vengono gestiti
prendere in input dei dati, elaborarli e trasformarli in un output.

Serve per capire come il linguaggio gestisce i dati
Quali sono le operazioni possibili su questo linguaggio

## Verifiche sui tipi di dato che stiamo utilizzando e sulle operazioni
verifica sulla correttezza dei dati che sto utilizzando
## due modi
1. statico
2. dinamico

statico -> quando il programma effettua questa verifica a compile time -> prima di essere eseguito -> in fase di compilazione -> mentre genera il bytecode

dinamico -> quando il programma effettua questa vericfica a run time -> durante l'esecuzione del programma

## tipizzazione
//è quando devi scrivere il tipo di dato di una variabile
la tipizzazione può essere :
1. forte
2. debole

Un linguaggio ha tipizzazione forte quando non effettua conversioni di tipo in maniera autonoma

un linguaggio ha tipizzazione debole quando effettua delle conversioni di tipo in maniera autonoma

## Java ha tipizzazione statica e forte ( però non è così cattivo come pensiamo )

## Tipi di Java
### Interi
long -> 8 bytes -> -9 quintilioni a + 9 quintilioni
int -> 4 bytes -> -2 miliardi a +2 miliardi
short -> 2 bytes -> -32768 a + 32768
byte -> 1 byte -> -128 a 127

### decimali
float -> 4 bytes - numeri con max 7 cifre decimali
double -> 8 bytes - numeri con max 15 cifre decimali

Notazione literals
float numero = 0.5f;

## char
un singolo carattere
char c = 'c';

## boolean

## Operatori
### matematici
+, -, /, *, %

## di confronto
==, !=, <, <= ...


## enum
enumerazione -> insieme di valori fissi
enum Size { SMALL, MEDIUM, LARGE, EXTRA_LARGE };

## Type inference
Quando il linguaggio riesce a comprendere in autonomia il tipo di dato da assegnare ad una variabile
var num = 5;

## String
una sequenza di caratteri testuali delimitati dai doppi apici " "
Ogni strigna è un oggetto di classe String
String saluto = "Hello World"; -> new String()

## comportamento strano
String saluto1 = "Hello World"; //! oggetto
String saluto2 = "Hello World"; //! oggetto
System.out.println(saluto1 == saluto2);
Per lui l'hashCode è uguale perchè lo calcola tramite gli stessi valori
