public class BankAccount {
    //! public rende l'attributo/funzione visibile in tutto il package
    //! protected rende l'attributo/funzione visibile ai figli diretti di questa classe
    //! private rende l'attributo/funzione visibile Solo a questa classe
    private String name;
    private String code;
    private int balance;
    public BankAccount(String name, String code, int balance) {
        this.setName(name);
        this.setCode(code);
        this.setBalance(balance);
    }

    //? 2. getter e setter
    //? sono delle funzioni che mi permettono di accedere in scrittura e in lettura agli attributi di un oggeto SOLO dall'interno della classe
    public String getName() { return this.name; }
    public String getCode() { return this.code; }
    public int getBalance() { return this.balance; }

    public void setName(String name){ this.name = name; }
    public void setCode(String code) { this.code = code; }
    public void setBalance(int balance) {
        if(this.balance == 0 && balance < 300){
            System.out.println("Non puoi aprire un conto con meno di 300$");
        } else {
            this.balance = balance;
        }
    }

    //! versamento , prelievo
    public void versamento( int cifra ) {
        setBalance(this.balance + cifra);
    }
    public void prelievo( int cifra ) {
        if(this.balance < cifra ){
            System.out.println("Saldo non suff");
        } else {
            setBalance(this.balance - cifra);
        }
    }
    public void saldo() { System.out.println("Il saldo è " + this.balance );}
}
