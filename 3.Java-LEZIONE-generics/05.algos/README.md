## Generics
aggiungono astrazione sui tipi di dato con cui le classi e le funzioni


Immutabilità
[3,4,5,6,7,8] -> [6, 8, 10]
prendere i dati in input -> elaborarli e ritornare altri dati che sono frutto dell'elaborazione

Programmazione concorrente
due funzioni su due sistemi diversi possono accedere agli stessi dati contemporaneamente
Concorrenza -> due metodi accedono agli stessi dati contemporaneamente
-> blocca l'esecuzione

a.filter( el => el.length < 3 ).map( el => el * 2).reduce((a, b) => a + b)
for(let i = 0; i < arr.length; i++){
    if(arr[i] < 3){

    }
    return arrayFiltrato
}
