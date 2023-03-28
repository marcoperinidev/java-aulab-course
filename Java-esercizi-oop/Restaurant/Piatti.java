import java.util.Arrays;
import java.util.List;

public class Piatti {

    private String nome;
    private double prezzo;
    private List<String> ingredienti;

    public Piatti(String nome, double prezzo, String[] ingredienti) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.ingredienti = Arrays.asList(ingredienti);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public List<String> getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(List<String> ingredienti) {
        this.ingredienti = ingredienti;
    }

    public boolean getName() {
        return false;
    }

    public Object getPrice() {
        return null;
    }
}
