/*----------CONSEGNA--------------
scrivere un programma che dichiari una lista di elementi di una determinata classe,
chiedere all’utentele informazioni per creare un nuovo oggetto e inserire
l’oggetto nella lista.

-- dichiarare lista di el
-- chiedere all'utente le info
-- creare nuovo oggetto
-- inserire oggetto nella lista.
--------------------------------*/

public class Prodotto {
    private final String nome;
    private double prezzo;

    public Prodotto(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getName() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }
}